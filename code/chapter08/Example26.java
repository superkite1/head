import java.io.File;
public class Example26 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:\\cn\\itcast\\chapter05");  // ����File����
		if (file.isDirectory ()) { // �ж�File�����Ӧ��Ŀ¼�Ƿ����
			String[] names = file.list (); // ���Ŀ¼�µ������ļ����ļ���
				for (String name : names) {
					System.out.println(name);	// ����ļ���
				}
		}
	}
}
