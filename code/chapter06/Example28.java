import java.text.*;
import java.util.*;
public class Example28 {
	public static void main(String[] args) throws Exception {
		// ����һ��SimpleDateFormat����
		SimpleDateFormat df1 = new SimpleDateFormat(
				"Gyyyy��MM��dd�գ�������yyyy��ĵ�D�죬E"); 
		// ��SimpleDateFormat���������ģ���ʽ��Date����
		System.out.println(df1.format(new Date()));
	}
}
