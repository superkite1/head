public class Example17 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); // �����ڲ������
		inner.show(); // ���� test() ����
	}
}
