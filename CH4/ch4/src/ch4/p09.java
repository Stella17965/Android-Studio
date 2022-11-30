package ch4;

public class p09 {
	public static void main(String[]args) {
		RacingCarP09 rccar1;
		rccar1 =new RacingCarP09();
		rccar1.newShow();
	}
}
class CarP09{
	protected int num;
	protected double gas;
	
	public CarP09() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCarP09 extends CarP09{
	private int course;
	
	public RacingCarP09() {
		course=0;
		System.out.println("生產了車子");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號為"+course);
	}
	public void newShow() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}