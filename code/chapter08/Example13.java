import java.io.*;
public class Example13 {
	public static void main(String[] args) throws Exception {
		Person p = new Person("p1", "zhangsan", 20); // ����һ��Person����
		System.out.println("---------д���ļ�ǰ----------");
		System.out.println("Person�����id:"+p.getId());       // ��ӡPerson�����id
		System.out.println("Person�����name:"+p.getName());    // ��ӡPerson�����name
		System.out.println("Person�����age:"+p.getAge());     //��ӡPerson�����age
		 // �����ļ���������󣬽�����д��objectStream.txt�ļ��� 
		FileOutputStream fos = new FileOutputStream("objectStream.txt");
          // ��������������������ڴ������������д�������
		ObjectOutputStream oos = new ObjectOutputStream(fos);
          // ��Person����������������
		oos.writeObject(p);
	}
}
class Person implements Serializable {
	private String id;
	private String name;
	private int age;
	public Person(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
