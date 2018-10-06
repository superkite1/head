// ����PCI�ӿ�
interface PCI {
	void start(); // ������󷽷�start()
	void stop();  // ������󷽷�stop()
}
// ����NetWorkCard��ʵ��PCI�ӿ�
class NetWorkCard implements PCI {
     // ʵ�� start()����
	public void start() {
		System.out.println("Send...");
	}
     // ʵ��stop()����
	public void stop() {
		System.out.println("NetWork Stop");
	}
}
// ����SoundCard��ʵ��PCI�ӿ�
class SoundCard implements PCI {
     // ʵ��start()����
	public void start() {
		System.out.println("Du du...");
	}
     // ʵ��stop()����
	public void stop() {
		System.out.println("Sound Stop");
	}
}
// ����MainBoard��
class MainBoard {
     // ����һ��userPCICard()����������PCI���͵Ĳ���
	public void usePCICard(PCI p) {
		p.start(); // ���ô�������start()����
		p.stop();   // ���ô�������stop()����
	}
}
  // ����Assembler��
 class Assembler {
	public static void main(String[] args) {
		MainBoard mb = new MainBoard();      // ����MainBoard���ʵ������ 
		NetWorkCard nc = new NetWorkCard(); // ����NetWorkCard���ʵ������nc
		mb.usePCICard(nc); // ����MainBoard�����usePCICard()����,��nc��Ϊ��������
		SoundCard sc = new SoundCard();     // ����NetWorkCard���ʵ������sc
		mb.usePCICard(sc); // ����MainBoard�����usePCICard()��������sc��Ϊ��������
	}
}
