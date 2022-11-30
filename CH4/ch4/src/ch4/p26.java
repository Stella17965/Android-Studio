package ch4;

public class p26 {
	public static void main(String[]args) {
		CarP26[] cars;
		cars=new CarP26[2];
		
		cars[0]=new CarP26();
		cars[1]=new RacingCarP26();
		
		for(int i=0;i<cars.length;i++) {
			Class cl =cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}
}
class CarP26{
	protected int num;
	protected double gas;
	
	public CarP26() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
}
class RacingCarP26 extends CarP26{
	public RacingCarP26() {
		System.out.println("生產了賽車");
	}
}