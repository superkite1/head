import java.io.*;
class Example29 {
	public static void main(String[] args) {
		File file = new File("E:\\cn"); // ����һ������Ŀ¼��File����
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
}
