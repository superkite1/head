public class Example12 {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();  //��ȡ
		System.out.println("�������ĸ���: " + rt.availableProcessors()+"��");
		System.out.println("�����ڴ�����: " + rt.freeMemory()/1024/1024+"M");
		System.out.println("�������ڴ�����: " + rt.maxMemory()/1024/1024+"M");
	}
}
