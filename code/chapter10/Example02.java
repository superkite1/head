import java.net.*;
// ���ն˳���
public class Example02 {
	public static void main(String[] args) throws Exception {
		byte[] buf = new byte[1024]; // ����һ������Ϊ1024���ֽ����飬���ڽ�������
         // ����һ��DatagramSocket���󣬼����Ķ˿ں�Ϊ8954
		DatagramSocket ds = new DatagramSocket(8954);
         // ����һ��DatagramPacket�������ڽ�������
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		System.out.println("�ȴ���������");
		ds.receive(dp); // �ȴ��������ݣ����û�������������
         // ����DatagramPacket�ķ�����ý��յ�����Ϣ���������ݵ����ݡ����ȡ����͵�IP��ַ�Ͷ˿ں�
		String str = new String(dp.getData(), 0, dp.getLength()) + "from "
				+ dp.getAddress().getHostAddress() + ":" + dp.getPort();
		System.out.println(str); // ��ӡ���յ�����Ϣ
		ds.close();// �ͷ���Դ
	}
}
