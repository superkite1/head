import java.util.*;
public class Example25 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // ������2��6��
		// ��MONTH�ֶ�����Ϊ13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		// ����non-lenientģʽ
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH,13);
		System.out.println(calendar.getTime());
	}
}
