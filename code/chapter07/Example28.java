import java.util.*;
public class Example28 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Collections.addAll(list, -3,2,9,5,8);
		System.out.println("�����е�Ԫ��: " + list);
		System.out.println("�����е����Ԫ��: " + Collections.max(list));
		System.out.println("�����е���СԪ��: " + Collections.min(list));
		Collections.replaceAll(list, 8, 0); 	// �������е�8��0�滻��
		System.out.println("�滻��ļ���: " + list);
	}
}
