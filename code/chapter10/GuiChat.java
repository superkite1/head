import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.net.*;
public class GuiChat extends JFrame {
	private static final int DEFAULT_PORT = 8899;
	// �������ڷ�ΪNORTH��CEMTER��SOUTH��������
	private JLabel stateLB; // ��ʾ����״̬
	private JTextArea centerTextArea;       // ��ʾ�����¼
	private JPanel southPanel;               // ����������
	private JTextArea inputTextArea;        // ���������
	private JPanel bottomPanel;              // ���� IP����򣬰�ť��
	private JTextField ipTextField;         // IP�����
	private JTextField remotePortTF;        // �˿ں������
	private JButton sendBT;                   // ���Ͱ�ť
	private JButton clearBT;                  // ��������¼��ť
	private DatagramSocket datagramSocket; // ���ں��湦�ܵ�ʵ��
private void setUpUI() {               // ��ʼ��Swing����
		// ��ʼ������
		setTitle("GUI����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);             // ���ô��ڵĴ�С
		setResizable(false);           // ���ڴ�С���ɵ���
		setLocationRelativeTo(null); // ���ھ���
		// ���ڵ�NORTH����
		stateLB = new JLabel("��ǰ��δ��������");
		stateLB.setHorizontalAlignment(JLabel.RIGHT);
		// ���ڵ�CENTER����
		centerTextArea = new JTextArea();     // �����¼��ʾ����
		centerTextArea.setEditable(false);
		centerTextArea.setBackground(new Color(211, 211, 211));
		// ���ڵ�SOUTH����
		southPanel = new JPanel(new BorderLayout());
		inputTextArea = new JTextArea(5, 20);// ������������
		bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ipTextField = new JTextField("127.0.0.1", 8);
		remotePortTF = new JTextField(String.valueOf(DEFAULT_PORT), 3);
		sendBT = new JButton("����");
		clearBT = new JButton("����");
		bottomPanel.add(ipTextField);
		bottomPanel.add(remotePortTF);
		bottomPanel.add(sendBT);
		bottomPanel.add(clearBT);
		southPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
		southPanel.add(bottomPanel, BorderLayout.SOUTH);
		// ��Ӵ���NORTH��CENTER��SOUTH���ֵ����
		add(stateLB, BorderLayout.NORTH);
		add(new JScrollPane(centerTextArea), BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
private void setListener() {
          // ΪsendBT��ť����¼�������
		sendBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ȡ���͵�Ŀ��ip��ַ�Ͷ˿ں�
				final String ipAddress = ipTextField.getText();
				final String remotePort = remotePortTF.getText();
				// �ж�ip��ַ�Ͷ˿ں��Ƿ�Ϊ��
				if (ipAddress == null || ipAddress.trim().equals("")
						|| remotePort == null || remotePort.trim().equals("")) {
					JOptionPane.showMessageDialog(GuiChat.this, "������IP��ַ�Ͷ˿ں�");
					return;
				}
				if (datagramSocket == null || datagramSocket.isClosed()) {
					JOptionPane.showMessageDialog(GuiChat.this, "�������ɹ�");
					return;
				}
				// �����Ҫ���͵�����
				String sendContent = inputTextArea.getText();
				byte[] buf = sendContent.getBytes();
				try {
					// �����͵�������ʾ���Լ��������¼��
					centerTextArea.append("�Ҷ� " + ipAddress + ":" + remotePort
							+ " ˵��\n" + inputTextArea.getText() + "\n\n");
					// ������ݺ�ʹ�������Զ���������׶�
					centerTextArea.setCaretPosition(centerTextArea.getText()
							.length());
					// ��������
					datagramSocket.send(new DatagramPacket(buf, buf.length,
							InetAddress.getByName(ipAddress), Integer
									.parseInt(remotePort)));
					inputTextArea.setText("");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(GuiChat.this, "������,���Ͳ��ɹ�");
					e1.printStackTrace();
				}
			};
		});
         // ΪclearBT��ť����¼�������
		clearBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				centerTextArea.setText(""); // ��������¼������
			}
		});
	}
private void initSocket() {
		int port = DEFAULT_PORT;
		while (true) {
			try {
				if (datagramSocket != null && !datagramSocket.isClosed()) {
					datagramSocket.close();
				}
				try { // �ж϶˿ں��Ƿ���1-65535֮��
					port = Integer.parseInt(JOptionPane.showInputDialog(this,
							"������˿ں�", "�˿ں�", JOptionPane.QUESTION_MESSAGE));
					if (port < 1 || port > 65535) {
						throw new RuntimeException("�˿ںų�����Χ");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"������Ķ˿ڲ���ȷ��������1-65535֮�����");
					continue; // �˿ڲ���ȷ������д
				}
				// ����DatagramSocket
				datagramSocket = new DatagramSocket(port);
				startListen(); // ����startListen����
				// ��stateLB����ʾ��������Ķ˿ں�
				stateLB.setText("���� " + port + " �˿ڼ���");
				break;
			} catch (SocketException e) { // �˿ںű�ռ��������д
				JOptionPane.showMessageDialog(this, "�˿��ѱ�ռ�ã����������ö˿�");
				stateLB.setText("��ǰ��δ��������");
			}
		}
	}
private void startListen() {
		new Thread() {
			private DatagramPacket p;
			public void run() {
				byte[] buf = new byte[1024];
				// ����DatagramPacket
				p = new DatagramPacket(buf, buf.length);
				while (!datagramSocket.isClosed()) {
					try {
						datagramSocket.receive(p); // ����������Ϣ
						// ��ӵ������¼��
						centerTextArea.append(p.getAddress().getHostAddress()
								+ ":"
								+ ((InetSocketAddress) p.getSocketAddress())
										.getPort() + " ����˵��\n"
								+ new String(p.getData(), 0, p.getLength())
								+ "\n\n");
						// ʹ�������Զ���������׶�
						centerTextArea.setCaretPosition(centerTextArea
								.getText().length());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	public GuiChat() {
		setUpUI();
		initSocket();
		setListener();
	}
	public static void main(String[] args) {
		new GuiChat();
	}
}

