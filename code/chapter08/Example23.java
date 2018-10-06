import java.io.*;
public class Example23 {
	public static void main(String[] args) throws Exception {
		// ����Ĵ����Ǵ���������������in1��in2
		FileInputStream in1 = new FileInputStream("stream1.txt");
		FileInputStream in2 = new FileInputStream("stream2.txt");
		// ����һ�����������ϲ������ֽ���in1��in2
		SequenceInputStream sis = new SequenceInputStream(in1, in2);
		FileOutputStream out = new FileOutputStream("stream.txt");
		int len;
		byte[] buf = new byte[1024];  // ����һ��1024���ֽ�������Ϊ������
		// ����Ĵ�������ѭ����ȡ�������е��ļ�
		while ((len = sis.read(buf)) != -1) {
			out.write(buf, 0, len);      // ���������е��������
              out.write("\r\n".getBytes());
		}
		sis.close();
		out.close();
	}
}
