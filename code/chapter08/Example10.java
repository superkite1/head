import java.io.*;
public class Example10 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("src.txt");
		// ����һ��BufferedReader�������
		BufferedReader br = new BufferedReader(reader);
		FileWriter writer = new FileWriter("des.txt");
		// ����һ��BufferdWriter����������
		BufferedWriter bw = new BufferedWriter(writer);
		String str;
		while ((str = br.readLine()) != null) { // ÿ�ζ�ȡһ���ı����ж��Ƿ��ļ�ĩβ
			bw.write(str);
			bw.newLine(); // д��һ�����з����÷�������ݲ�ͬ�Ĳ���ϵͳ������Ӧ�Ļ��з�
		}
		br.close();              
		bw.close();
	}
}
