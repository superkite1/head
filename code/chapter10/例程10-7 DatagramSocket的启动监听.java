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
