import java.util. *;
public class Example29 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };            // ��ʼ��һ������
		System.out.print("����ǰ��");
		printArray(arr);                             // ��ӡԭ����
		Arrays.sort(arr);                            // ����Arrays��sort��������
		System.out.print("�����");
		printArray(arr);
	}
	public static void printArray(int[] arr) {  // �����ӡ���鷽��
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1) {
				System.out.print(arr[x] + ", ");
			} else {
				System.out.println(arr[x] + "]");
			}
		}
	}
}
