import java.awt.*;
public class Example13 {
	public static void main(String[] args) {
		Frame f = new Frame("hello");
		f.setLayout(null); // ȡ�� frame�Ĳ��ֹ�����
		f.setSize(300, 150);
		Button btn1 = new Button("press");
		Button btn2 = new Button("pop");
		// btn1.setLocation(40, 60);���ð�ť���������
		// btn1.setSize(100, 30);���ð�ť����ĳ���
		btn1.setBounds(40, 60, 100, 30);
		// btn1.setLocation(140, 90);���ð�ť���������
		// btn1.setSize(100, 30);���ð�ť����ĳ���
		btn2.setBounds(140, 90, 100, 30);
         // �ڴ�������Ӱ�ť
		f.add(btn1);
		f.add(btn2);
		f.setVisible(true);
	}
}
