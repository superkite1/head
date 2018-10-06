import java.io.File;
import java.io.FilenameFilter;
public class Example27 {
	public static void main(String[] args) throws Exception {
		// ����File����
		File file = new File("d:/cn/itcast/chapter05");
		// ��������������
		FilenameFilter filter = new FilenameFilter() {
			// ʵ��accept()����
			public boolean accept(File dir, String name) {
				File currFile = new File(dir, name);
				// ����ļ�����.java��β����true�����򷵻�false
				if (currFile.isFile() && name.endsWith(".java")) {
					return true;
				} else {
					return false;
				}
			}
		};
		if (file.exists()) { // �ж�File�����Ӧ��Ŀ¼�Ƿ����
			String[] lists = file.list(filter); // ��ù��˺�������ļ�������
			for (String name : lists) {
				System.out.println(name);
			}
		}
	}
}
