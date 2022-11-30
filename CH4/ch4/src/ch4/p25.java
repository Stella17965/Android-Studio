package ch4;

public class p25 {
	public static void main(String[]args) {
		CarP25 car1=new CarP25();
		CarP25 car2=new CarP25();
		
		CarP25 car3;
		car3=car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
	}
}
class CarP25{
	protected int num;
	protected double gas;
	
	public CarP25() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
}