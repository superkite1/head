import java.util.*;
public class Example22 {
   public static void main(String[] args) {
	    Properties p=new Properties();             // ����Properties����
	    p.setProperty("backgroup-color", "red");
	    p.setProperty("Font-size", "14px");
	    p.setProperty("Language", "chinese");
	    Enumeration names = p.propertyNames();   // ��ȡEnumeration�������м���ö��
	    while(names.hasMoreElements()){           // ѭ���������еļ�
	    	String key=(String) names.nextElement();
	    	String value=p.getProperty(key);        // ��ȡ��Ӧ����ֵ
	    	System.out.println(key+" = "+value);
	    }
	}
}
