import java.io.*;
public class Example19 {
	public static void main(String[] args) throws Exception {
		final PipedInputStream pis = new PipedInputStream();// ����PipedInputStream����
		final PipedOutputStream pos = new PipedOutputStream();
		// PipedInputStream��PipedOutputStream�������ӣ�Ҳ��д��pos.connect(pis)
		pis.connect(pos);
		new Thread(new Runnable() { // ����һ���߳�
					public void run() {
						BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
						// ���Ӽ��̶�ȡ������д��ܵ���
						PrintStream ps = new PrintStream(pos);
						while (true) {
							try {
								System.out.print(Thread.currentThread()
										.getName() + "Ҫ���������ݣ�");
								ps.println(br.readLine());
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}, "�������ݵ��߳�").start();
		new Thread(new Runnable() {
			public void run() {
				// ����Ĵ����Ǵӹܵ����ж������ݣ�ÿ��һ���������һ��
				BufferedReader br = new BufferedReader(new InputStreamReader(
						pis));
				while (true) {
					try {
						System.out.println(Thread.currentThread().getName()
								+ "�յ������ݣ�" + br.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}, "�������ݵ��߳�").start();
	}
}
