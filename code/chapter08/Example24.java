import java.io.*;
import java.util.*;
public class Example24 {
	public static void main(String[] args) throws Exception {
		Vector vector = new Vector();// ����Vector����
		// ����Ĵ����Ǵ���3������������
		FileInputStream fis1 = new FileInputStream("1.txt");
		FileInputStream fis2 = new FileInputStream("2.txt");
		FileInputStream fis3 = new FileInputStream("3.txt");
		// ����Ĵ�������Vector�����3������������
		vector.addElement(fis1);
		vector.addElement(fis2);
		vector.addElement(fis3);
		Enumeration e = vector.elements();// ��ȡVector�����е�Ԫ��
		// ��Enumeration�����е����ϲ�
		SequenceInputStream sis = new SequenceInputStream(e);
		FileOutputStream out = new FileOutputStream("stream.txt");
		int len;
		byte[] buf = new byte[1024]; // ����һ����СΪ1024���ֽ�����Ļ�����
		while ((len = sis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		sis.close();
		out.close();
	}
}
