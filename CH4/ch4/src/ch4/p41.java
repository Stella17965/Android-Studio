package ch4;

public class p41 {
	public static void main(String[]args) {
		CarP41 car1 =new CarP41(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicleP41{
	void vShow();
}
interface iMaterial{
	void mShow();
}
class CarP41 implements iVehicleP41,iMaterial{
	private int num;
	private double gas;
	
	public CarP41(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void vShow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mShow() {
		System.out.println("車子的材質是鐵");
	}
}