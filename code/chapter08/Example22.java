import java.io.*;
public class Example22 {
  public static void main(String[] args)throws Exception {
	     FileReader reader = new FileReader("A.txt");// ����һ��FileReader����
		CharArrayWriter caw = new CharArrayWriter();// ���ڴ��д���һ���ַ����黺����
		// ����Ĵ����ǽ�����д�뻺����
		int b;
		while ((b = reader.read()) != -1) {
			caw.write(b);        // ����ȡ�����ַ�д�뻺����
		}
		reader.close();
		caw.close();
         char[] c = caw.toCharArray();// ���������е�����ת�����ַ�������
         CharArrayReader cr = new CharArrayReader(c);// ��ȡ�ַ������е�����
		// ����Ĵ����Ǵӻ������ж�ȡ���ݣ������д�ӡ
         int i = 0;
		while ((i = cr.read()) != -1) {
			System.out.println((char) i);
		}
    }
}
