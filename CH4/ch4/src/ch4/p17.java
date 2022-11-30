package ch4;

public class p17 {
	public static void main(String[]args) {
		CarP17 cars[];
		cars=new CarP17[2];
		
		cars[0]=new CarP17();
		cars[0].setCar(1234, 20.5);
		
		cars[1]=new RacingCarP17();
		cars[1].setCar(5678, 30.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}
}
class CarP17{
	protected int num;
	protected double gas;
	
	public CarP17() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
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
class RacingCarP17 extends CarP17{
	private int course;
	
	public RacingCarP17() {
		course=0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}