import java.util.*;
public class Example30 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		Arrays.sort(arr);// �������򷽷�������������{2,3,5,8,9}
		int index = Arrays.binarySearch(arr, 3);	// ����ָ��Ԫ��3
		System.out.println("Ԫ��3��������:" + index);	// �����ӡԪ�����ڵ�����λ��
	}
}
