import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Example15 extends JFrame{
      public Example15(){
    	  this.setTitle("JFrameTest");
    	  this.setSize(200, 300);
    	  // ����һ����ť���
    	  JButton bt = new JButton("��ť");
    	  // ������ʽ���ֹ�����
    	  this.setLayout(new FlowLayout());
    	  // ��Ӱ�ť���
    	  this.add(bt); 
    	  // ���õ���رհ�ťʱ��Ĭ�ϲ���
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
      }
      public static void main(String[] args) {
		new Example15 ();
	}
}
