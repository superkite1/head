public class Example24 {
	public static void main(String[] args) {
		int sum = getSum(4);                    // ���õݹ鷽�������1~4�ĺ�
		System.out.println("sum = " + sum); // ��ӡ���
	}
	// ����ķ���ʹ�õݹ�ʵ�� ��1~n�ĺ�
	public static int getSum(int n) {
		if (n == 1) {
			// �����������ݹ����
			return 1;
		}
		int temp = getSum(n - 1);
		return temp + n;
	}
}
