import java.io.File;
public class Example28 {
	public static void main(String[] args) {
		File file = new File("E:\\cn\\itcast\\chapter08"); // ����һ������Ŀ¼��File����
		fileDir(file);					 // ����FileDirɾ������
	}
	public static void fileDir(File dir) {
		File[] files = dir.listFiles(); // ��ñ�ʾĿ¼�������ļ�������
		for (File file : files) {		 // �������е���Ŀ¼���ļ�
			if (file.isDirectory()) {
				fileDir(file);			 // �����Ŀ¼���ݹ����FileDir()
			}
			System.out.println(file.getAbsolutePath());	// ����ļ��ľ���·��
		}
	}
