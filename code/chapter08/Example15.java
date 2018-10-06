import java.io.*;
public class Example15 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("d:\\dataStream.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeByte(12);                       // дһ���ֽ�
		dos.writeChar('1');                     // дһ���ַ�
		dos.writeBoolean(true);                // дһ������ֵ
		dos.writeUTF("ͬѧ�����");             // дһ��ת����UTF-8���ַ���
		dos.close();                             // �ر���
		FileInputStream fis = new FileInputStream("d:\\dataStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		System.out.println(dis.readByte());     // ��һ���ֽ�
		System.out.println(dis.readChar());     // ��һ���ַ�
		System.out.println(dis.readBoolean()); // ��һ������ֵ
		System.out.println(dis.readUTF());      // ��һ��ת����UTF-8������ַ���
		dis.close();                                // �ر���
	}
}
