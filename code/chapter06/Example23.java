import java.util.*;
public class Example23 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // ��ȡ��ʾ��ǰʱ���Calendar����
		int year = calendar.get(Calendar.YEAR); // ��ȡ��ǰ���
		int month = calendar.get(Calendar.MONTH) + 1; // ��ȡ��ǰ�·�
		int date = calendar.get(Calendar.DATE); // ��ȡ��ǰ��
		int hour = calendar.get(Calendar.HOUR); // ��ȡʱ
		int minute = calendar.get(Calendar.MINUTE); // ��ȡ��
		int second = calendar.get(Calendar.SECOND); // ��ȡ��
		System.out.println("��ǰʱ��Ϊ:" + year + "�� " + month + "�� " + date + "�� "
				+ hour + "ʱ " + minute + "�� " + second + "��");
	}
}
