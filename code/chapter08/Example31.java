import java.io.RandomAccessFile;
public class Example31 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		int times = 0; // int���͵ı�����ʾ���ô���
		times = Integer.parseInt(raf.readLine()); // ��һ�ζ�ȡ�ļ�ʱtimesΪ5
		if (times > 0) {
			// ����һ�Σ���������һ��
			System.out.println("������������" + times-- + "�Σ�");
			raf.seek(0); // ʹ��¼ָ��ָ���ļ��Ŀ�ͷ
			raf.writeBytes(times + ""); // ��ʣ��Ĵ����ٴ�д���ļ�
		} else {
			System.out.println("������ô����ѵ�"); // ��time<=0,�����û��������ѵ�
		}
		raf.close(); // �ر�RandomAccessFile����
	}
}
