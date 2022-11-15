package ch3;

public class p28 {
	public static void main(String[]args) {
		CarP28 car1;
		car1=new CarP28();
		car1.show();
		
		CarP28 car2;
		car2=new CarP28(1234,25.0);
		car2.show();
	}
}
class CarP28{
	private int num;
	private double gas;
	
	public CarP28() {
		num =0;
		gas =0.0;
		System.out.println("生產了車子");
	}
	public CarP28(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show(){
		System.out.println("車號為"+num);
		System.out.println("汽油量為為"+gas);
	}
}