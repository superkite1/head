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
}
