import java.io.*;
public class Example17 {
	public static void main(String[] args) throws Exception {
		StringBuffer sb=new StringBuffer();
		int ch;
         // whileѭ�����ڶ�ȡ�������������
		while((ch=System.in.read())!=-1){    // �ж��Ƿ��ȡ�����ݵ�ĩβ
              // ��������ַ������жϣ�����ǻس���\r�����߻��С�\n����������ѭ��
			if(ch=='\r'||ch=='\n'){
				break;
			}
			sb.append((char)ch);      // ����ȡ������
		}
		System.out.println(sb);       // ��ӡ�������������
	}
}
