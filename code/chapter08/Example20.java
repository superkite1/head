import java.io.*;
public class Example20 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("source.txt"); 
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); //����һ���ֽ����黺����
		FileOutputStream out = new FileOutputStream("target.txt");
		// ����Ĵ�����ѭ����ȡ�������е����ݣ���������һ����д���ļ�
		int b;
		while ((b = in.read()) != -1) {
			bos.write(b);
		}
		in.close();
		bos.close();
		out.write(bos.toByteArray());//���������е�����һ����д���ļ�
		out.close();
	}
}
