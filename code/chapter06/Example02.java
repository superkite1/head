public class Example02 {
	public static void main(String[] args) {
		String s = "abcdedcba"; // �����ַ���
		System.out.println("�ַ����ĳ���Ϊ��" + s.length()); // ��ȡ�ַ������ȣ����ַ�����
		System.out.println("�ַ����е�һ���ַ�:" + s.charAt(0));
		System.out.println("�ַ�c��һ�γ��ֵ�λ��:" + s.indexOf('c'));
		System.out.println("�ַ�c���һ�γ��ֵ�λ��:" + s.lastIndexOf('c'));
	}
}
