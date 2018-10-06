import java.util.*;
public class Example21 {				                // ����TreeMap������
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator());// ����һ���Զ���Ƚ���
		tm.put("1", "Jack");						   // �򼯺ϴ���ѧ����ѧ�ź�����
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet = tm.keySet();                       // ��ȡ���ļ���
		Iterator it = keySet.iterator();			  // ��õ���������
		while (it.hasNext()) {
			Object key = it.next();					// ���һ����
			Object value = tm.get(key);				// ��ü���Ӧ��ֵ
			System.out.println(key + ":" + value);
		}
	}
}
class MyComparator implements Comparator {         // �Զ���Ƚ���
	public int compare(Object obj1, Object obj2) {// ʵ�ֱȽϷ���
		String id1 = (String) obj1;                  // ��Object���͵Ĳ���ǿתΪString����
		String id2 = (String) obj2;   
		return id2.compareTo(id1);                   // ���Ƚ�֮���ֵ����
	}
}
