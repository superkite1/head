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
