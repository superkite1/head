import java.util.*;
public class Example20 {				  // ����TreeMap������
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("1", "Jack");
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet = tm.keySet();          // ��ȡ���ļ���
		Iterator it = keySet.iterator(); // ��ȡIterator����
		while (it.hasNext()) {             // �ж��Ƿ������һ��Ԫ��
			Object key = it.next();       // ȡ��Ԫ��
			Object value = tm.get(key);  // ���ݻ�ȡ�ļ��ҵ���Ӧ��ֵ
			System.out.println(key + ":" + value);
		}
	}
}
