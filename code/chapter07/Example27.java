import java.util.*;
public class Example27 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Collections.addAll(list, "C","Z","B","K");    // ���Ԫ��
		System.out.println("����ǰ: " + list);          // �������ǰ�ļ���
		Collections.reverse(list);                       // ��ת����
		System.out.println("��ת�� " + list); 
		Collections.sort(list);                           // ����Ȼ˳������
		System.out.println("����Ȼ˳�������: " + list);
		Collections.shuffle(list);          
		System.out.println("ϴ�ƺ�: " + list); 
	}
}
