class CachePool {                          // ����CachePool��
	Object temp;
	public void save(Object temp) {     // ����һ��save()�������ڱ�������
		this.temp = temp;
	}
	public Object get() {                 // ����һ��get()�������ڻ�ȡ����
		return temp;
	}
}
public class Example25 {
	public static void main(String[] args) {
		CachePool pool = new CachePool();     // ����CachePool����
		pool.save(new Integer(1));             // ��������
		String temp = pool.get();              // ȡ������
		System.out.println(temp);
	}
}
