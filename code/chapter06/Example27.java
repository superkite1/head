import java.text.*;
public class Example27 {
	public static void main(String[] args) throws Exception{
         // ����Long��ʽ��DateFormat����
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG);
		String d1="2008��8��8��";
		System.out.println(df1.parse(d1)); // ����Ӧ��ʽ���ַ���������Date����
	}
}
