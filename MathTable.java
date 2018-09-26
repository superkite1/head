

public class MathTable {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i) {
					System.out.print(j + "*" + i + "=" + (j * i) + " ");
				}
			}
			System.out.println();// 小括号里面的代码每执行一次换行
		}
	}

}
