import java.util.*;
public class Example12 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();     // ����TreeSet����
		ts.add("Jack");                   // ��TreeSet���������Ԫ��
		ts.add("Helena");
		ts.add("Helena");
		ts.add("Eve");
		Iterator it = ts.iterator();   // ��ȡIterator����
		while(it.hasNext()) {            
			System.out.println(it.next());
		}
	}
}
