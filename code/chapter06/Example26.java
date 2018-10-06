import java.text.*;
import java.util.*;
public class Example26 {
	public static void main(String[] args) {
		Date date = new Date();
		// Full��ʽ�����ڸ�ʽ������
		DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
		// Long��ʽ�����ڸ�ʽ������
		DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
		// medium��ʽ������/ʱ�� ��ʽ������
		DateFormat mediumFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// short��ʽ������/ʱ���ʽ������
		DateFormat shortFormat = DateFormat.getDateTimeInstance(
				DateFormat.SHORT, DateFormat.SHORT);
		// �����ӡ��ʽ��������ڻ�������/ʱ��
		System.out.println("��ǰ���ڵ�������ʽΪ��" + fullFormat.format(date));
		System.out.println("��ǰ���ڵĳ���ʽΪ��" + longFormat.format(date));
		System.out.println("��ǰ���ڵ���ͨ��ʽΪ��" + mediumFormat.format(date));
		System.out.println("��ǰ���ڵĶ̸�ʽΪ��" + shortFormat.format(date));
	}
}
