import java.util.*;
public class Example08 {
	public static void main(String[] args) {
		Vector v = new Vector();             // ����Vector����
		v.add("Jack");                         // ���Vector���������Ԫ��
		v.add("Rose");
		v.add("Tom");
		Enumeration en = v.elements();      // ���Enumeration����
		while (en.hasMoreElements()) {      // �жϸö����Ƿ��и���Ԫ��
			Object obj = en.nextElement(); // ȡ���ö������һ��Ԫ��
			System.out.println(obj);
		}
	}
}
