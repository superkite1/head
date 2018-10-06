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
