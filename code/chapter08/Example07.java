import java.io.*;
public class Example07 {
	public static void main(String[] args) throws Exception {
		// ����һ������������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"src.txt"));
		// ����һ�����������������
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("des.txt"));
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}
