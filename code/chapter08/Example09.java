import java.io.*;
public class Example09 {
	public static void main(String[] args) throws Exception {
		// ����һ��FileWriter�����������ļ���д������
		FileWriter writer = new FileWriter("writer.txt");
		String str = "��ã����ǲ���";
		writer.write(str);  // ���ַ�����д�뵽�ı��ļ���
		writer.write("\r\n");  // �������任��
		writer.close(); // �ر�д�������ͷ���Դ
	}
}
