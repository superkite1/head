import java.util.*;
public class Example33 {
	public static void main(String[] args) throws Exception {
		String str = "����";
		byte[] b = str.getBytes("GBK");
		String temp = new String(b, "ISO8859-1");
		System.out.println(temp);                      // �ô���������룬��ӡ��������
		byte[] b1 = temp.getBytes("ISO8859-1");     // ��ʹ�ô����������
		String result = new String(b1, "GBK");      // ����ȷ��������
		System.out.println(result);                   // ��ӡ����ȷ�Ľ��
	}
}
