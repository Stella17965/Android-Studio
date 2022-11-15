package ch3;

public class p31 {
	public static void main(String[]args) {
		CarP31.showSum();
		CarP31 car1;
		car1=new CarP31();
		car1.setCar(1234,20.5);
		CarP31.showSum();
		
		CarP31 car2;
		car2=new CarP31();
		car2.setCar(4567, 20.5);
	}
}
class CarP31{
	public static int sum=0;
	private int num;
	private double gas;
	
	public CarP31() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}