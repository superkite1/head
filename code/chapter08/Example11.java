import java.io.*;
public class Example11 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Example09.java");	// �����ַ�������
		FileWriter fw = new FileWriter("copy.java");	// �����ַ������
		LineNumberReader lr = new LineNumberReader(fr);	// ��װ
		lr.setLineNumber(0); // ���ö�ȡ�ļ�����ʼ�к�
		String line = null;
		while ((line = lr.readLine()) != null) {
			fw.write(lr.getLineNumber() + ":" + line); // ���к�д�뵽�ļ���
			fw.write("\r\n");							// д�뻻��
		}
		lr.close();
		fw.close();
	}
}
