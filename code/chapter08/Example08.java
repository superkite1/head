import java.io.*;
public class Example08 {
	public static void main(String[] args) throws Exception {
		// ����һ��FileReader����������ȡ�ļ��е��ַ�
		FileReader reader = new FileReader("reader.txt");
		int ch; // ����һ���������ڼ�¼��ȡ���ַ�
		while ((ch = reader.read()) != -1) { // ѭ���ж��Ƿ��ȡ���ļ���ĩβ
			System.out.println((char) ch); // �����ַ���ĩβ��תΪ�ַ���ӡ
		}
		reader.close(); // �ر��ļ���ȡ�����ͷ���Դ
	}
}