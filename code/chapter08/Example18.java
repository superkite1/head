public class Example18 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("source.txt"));// �������������ض���
		System.setOut(new PrintStream("target.txt"));// ������������ض���
		// ��ȡ����������ַ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) { // �ж϶�ȡ����һ���Ƿ�������
			System.out.println(line); // ��ӡ��ȡ����һ������
		}
	}
}
