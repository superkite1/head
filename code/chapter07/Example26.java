class cachePool<T> {             // �ڴ�����ʱ��������������ΪT
	T temp;
	public void save(T temp) { // �ڴ���save()����ʱ��ָ����������ΪT
		this.temp = temp;
	}
     public T get() {             // �ڴ���get()����ʱ��ָ������ֵ����ΪT 
		return temp;
	}
}
public class Example26 {
	public static void main(String[] args) {
		// ��ʵ��������ʱ���������ΪInteger����
         cachePool<Integer> pool = new cachePool<Integer>(); 
         pool.save(new Integer(1));
         Integer temp = pool.get();
         System.out.println(temp);
	}
}
