import java.io.*;
public class Example16 {
	public static void main(String[] args) throws Exception {
      // ����һ��PrintStream���󣬽�FileOutputStream��ȡ�����������
	 PrintStream ps = new PrintStream(new FileOutputStream("printStream.txt"), true);
	    Student stu=new Student();   // ����һ��Student����
		ps.print("����һ������:");     
		ps.println(19);   // ��ӡ����
		ps.println(stu); // ��ӡStudent����
	}
}
class Student{	
    // ��дObject��toString()����
	public String toString() {	
		return "����һ��ѧ��";
	}
}
