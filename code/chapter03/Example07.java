class Person {
	String name;
	int age;
	// �������������Ĺ��췽��
	public Person(String con_name, int con_age) {
		name = con_name;	// Ϊname���Ը�ֵ
		age = con_age; 		// Ϊage���Ը�ֵ
	}
	// ����һ�������Ĺ��췽��
	public Person(String con_name) {
		name = con_name; 	// Ϊname���Ը�ֵ
	}
	public void speak() {
		// ��ӡname��age��ֵ
		System.out.println("��Һã��ҽ�" + name + ",�ҽ���" + age + "��!");
	}
}
public class Example07 {
	public static void main(String[] args) {
		// �ֱ𴴽��������� p1 �� p2
		Person p1 = new Person("�½�");
		Person p2 = new Person("�", 18);
		// ͨ������p1 �� p2 ����speak()����
		p1.speak();
		p2.speak();
	}
}
