import java.util.*;
class MyComparator implements Comparator {           // ����Ƚ���ʵ��Comparator�ӿ�
	public int compare(Object obj1, Object obj2) { // ʵ�ֱȽϷ���
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		int temp = s1.length() - s2.length();
		return temp;
	}
}
public class Example14 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());// ����TreeSet����ʱ�����Զ���Ƚ���
		ts.add("Jack");// ���Set����������ַ���
		ts.add("Helena");
		ts.add("Eve");
		Iterator it = ts.iterator(); // ��ȡIterator����
		// ͨ��whileѭ�����𽥽������е�Ԫ�ش�ӡ����
		while (it.hasNext()) {
			// ���Iterator��Ԫ�ؽ��е��������ȡԪ�ز����д�ӡ
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
