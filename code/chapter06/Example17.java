import java.util.Random;
public class Example17{
	public static void main(String args[]) {	
		Random r = new Random(13);	// ��������ʱ��������
        // �������10��[0,100)֮�������
        for (int x = 0; x < 10; x++) {
                System.out.println(r.nextInt(100));
        }
	}
}
