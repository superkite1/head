import java.awt.*;
import java.awt.event.*;
public class Example04 {
	public static void main(String[] args) {
		Frame f = new Frame("�ҵĴ���!");
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		Button btn = new Button("EXIT"); // ������ť�������
		f.add(btn); // �Ѱ�ť������ص�������
		// ���ڲ���ķ�ʽΪ��ť���ע�������
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
