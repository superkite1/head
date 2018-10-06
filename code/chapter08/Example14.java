import java.io.*;
public class Example14 {
	public static void main(String[] args) throws Exception {
          // �����ļ��������������ڶ�ȡָ���ļ�������
		FileInputStream fis = new FileInputStream("objectStream.txt");
          // �������������������Ҵ�ָ�����������ж�ȡ����
		ObjectInputStream ois = new ObjectInputStream(fis);
          // ��objectStream.txt�ж�ȡPerson����
		Person p = (Person) ois.readObject();
		System.out.println("---------���ļ��ж�ȡ��----------");
		System.out.println("Person�����id:"+p.getId());
		System.out.println("Person�����name:"+p.getName());
		System.out.println("Person�����age:"+p.getAge());
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
