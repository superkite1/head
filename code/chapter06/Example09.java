import java.util.*;
public class Example09 {
	public static void main(String[] args) {
		// ��ȡ��ǰϵͳ����
		Properties properties = System.getProperties();
		// �������ϵͳ���Ե�key������Enumeration����
		Enumeration propertyNames = properties.propertyNames();
		while (propertyNames.hasMoreElements()) {
			//��ȡϵͳ���Եļ�key
			String key = (String) propertyNames.nextElement();
			// ��õ�ǰ��key��Ӧ��ֵvalue
			String value = System.getProperty(key);
			System.out.println(key + "--->" + value);
		}
	}
}
