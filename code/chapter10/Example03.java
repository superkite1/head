import java.net.*;
//���Ͷ˳���
public class Example03 {
	public static void main(String[] args) throws Exception {
		// ����һ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket(3000);
		String str = "hello world"; // Ҫ���͵�����
		/*
		 * ����һ��Ҫ���͵����ݰ������ݰ��������͵����ݣ����ݵĳ��ȣ����ն˵�IP��ַ�Լ��˿ں�
		 */
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),
				InetAddress.getByName("localhost"), 8954);
		System.out.println("������Ϣ");
		ds.send(dp); // ��������
		ds.close(); // �ͷ���Դ
	}
}
