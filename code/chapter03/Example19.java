class Outer {
	private int num = 4;  // �����Ա����
	public void test() {
		// �������ڷ����ж�����ڲ���
		class Inner {
			void show() {
				System.out.println("num = " + num);  // �����ⲿ��ĳ�Ա����
			}
		}
		Inner in = new Inner(); // �����ڲ������
		in.show();				// �����ڲ���ķ���
	}
}
public class Example19 {
	public static void main(String[] args) {
		Outer outer = new Outer();	// �����ⲿ�����
		outer.test();				// ���� test() ����
	}
}
