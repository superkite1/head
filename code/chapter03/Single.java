class Single {
	// �Լ�����һ������
	private static Single INSTANCE = new Single(); 
	private Single() {}                      // ˽�л����췽��
	public static Single getInstance() { // �ṩ���ظö���ľ�̬����
		return INSTANCE;
	}
}
/*
 class Single {
	private Single() {}
	public static final Single INSTANCE = new Single();
}

*/