import java.awt.*;
import java.awt.event.*;
public class Example08 {
	public static void main(String[] args) {
		final Frame f = new Frame("Flowlayout");// ����һ����ΪFlowlayout�Ĵ���
		// ���ô����еĲ��ֹ�����ΪFlowLayout�������������룬ˮƽ���Ϊ20����ֱ���Ϊ30
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(200, 300);                     // ���ô����С
		f.setLocation(300, 200);                // ���ô�����ʾ��λ��
		Button but1 = new Button("��1����ť");// ������1����ť
		f.add(but1);                              // ��"��1����ť"��ӵ�f����
		// ����Ĵ�����ÿ���һ�Ρ���1����ť�������������һ����ť
		but1.addActionListener(new ActionListener() { // �����¼�Ϊ��1����ť��ӵ���¼�
			private int num = 1;                           // �������num����¼��ť�ĸ���
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("��" + ++num + "����ť"));// ����������°�ť
				// f.setVisible(true);                       // ˢ�´�����ʾ�°�ť
			}
		});
		f.setVisible(true); // ���ô���ɼ�
	}
}
