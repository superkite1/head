import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		Map map = new HashMap();    // ����Map����
		map.put("1", "Jack");       // �洢����ֵ
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();              // ��ȡIterator����
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) (it.next());// ��ȡ�����м�ֵ��ӳ���ϵ
			Object key = entry.getKey();                // ��ȡEntry�еļ�
			Object value = entry.getValue();           // ��ȡEntry�е�ֵ
			System.out.println(key + ":" + value);
		}
	}
}
