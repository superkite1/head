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
}
