import java.io.*;
public class Example34 {
	public static void main(String[] args) throws Exception {
		// ����InputStreamReader����
		Reader reader = new InputStreamReader(new FileInputStream("E:/1.txt"),
				"GBK");
		// ����OutputStreamWriter����
		Writer writer = new OutputStreamWriter(new FileOutputStream("E:/2.txt",
				true), "UTF-8");
		char[] chs = new char[100]; // ����һ���ַ�����
		int len;
		len = reader.read(chs); // ���ļ������ݶ�ȡ���ַ�����
		String string = new String(chs, 0, len); // ʹ���ַ����鴴���ַ���
		writer.write(string);  // ��Ŀ���ļ�д���ַ���
		reader.close();
		writer.close();
	}
}
