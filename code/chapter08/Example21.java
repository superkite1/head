import java.io.*;
public class Example21 {
	public static void main(String[] args) throws Exception {
		byte[] bufs = new byte[] { 97, 98, 99, 100 };// ����һ���ֽ�����
		ByteArrayInputStream bis = new ByteArrayInputStream(bufs);//��ȡ�ֽ������е�����
		//����Ĵ�����ѭ����ȡ�������е�����
         int b;
		while ((b = bis.read()) != -1) {
			System.out.println((char) b);
		}
	}
}
