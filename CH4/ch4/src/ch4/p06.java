package ch4;

public class p06 {
	public static void main(String[]args) {
		RacingCarP04 rccar1=new RacingCarP04(1234,20.5,5);
	}
}
class CarP04{
	private int num;
	private double gas;
	
	public CarP04() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public CarP04(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車子"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCarP04 extends CarP04{
	private int course;
	
	public RacingCarP04() {
		course=0;
		System.out.println("生產了車子");
	}
	public RacingCarP04(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
}