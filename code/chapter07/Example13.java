import java.util.*;
class Student implements Comparable{	      // ����Student��ʵ��Comparable�ӿ�
	String name;
	int age;
	public Student(String name, int age) {  // �������췽��
		this.name = name;
		this.age = age;
	}
	public String toString() {	               // ��дObject���toString()����������������Ϣ
		return name + ":" + age;
	}
	public int compareTo(Object obj){   // ��дComparable�ӿڵ�compareTo����
		Student s = (Student) obj;	     // ���Ƚ϶���ǿתΪStudent����
		if(this.age -s.age > 0) {		// ����ȽϷ�ʽ	
				return 1;
		}
		if(this.age -s.age == 0) {		
			return this.name.compareTo(s.name);	// ���ȽϽ������
		}
		return -1;
	}
}
public class Example13 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();                  // ����TreeSet����
		ts.add(new Student("Jack",19));             // �򼯺������Ԫ��
		ts.add(new Student("Rose",18));
		ts.add(new Student("Tom", 19));
		ts.add(new Student("Rose",18));
		Iterator it = ts.iterator();       
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
