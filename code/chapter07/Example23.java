import java.util.*;
public class Example23 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();	 // ����ArrayList����
		list.add("String");					 // ����ַ�������
		list.add("Collection");				
		list.add(1);						// ���Integer����
		for (Object obj : list) {			// ��������
			String str = (String) obj;		// ǿ��ת����String����
		}
	}
}
