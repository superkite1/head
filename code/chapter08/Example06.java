class Car {
	private String carName;      // ����һ�����ԣ�������
	public Car(String carName) {
		this.carName = carName;
	}
	public void show() {         // ʵ��Car��show()����
		System.out.println("���� " + carName + " ,���л�������");
	}
}
// ����һ����RadarCar
class RadarCar {
	public Car myCar;
	public RadarCar(Car myCar) {	// ͨ�����췽�����ձ���װ�Ķ���
		this.myCar = myCar;
	}
	public void show() {
		myCar.show();
		System.out.println("���е����״﹦��"); // ʵ�ֹ��ܵ���ǿ
	}
}
public class Example06 {
	public static void main(String[] args) {
		Car benz = new Car("Benz");  // ����һ��NewCar����
		System.out.println("--------------��װǰ--------------");
		benz.show();
		RadarCar decoratedCar_benz = new RadarCar(benz);  // ����һ��RadarCar����
		System.out.println("--------------��װ��--------------");
		decoratedCar_benz.show();
	}
}
