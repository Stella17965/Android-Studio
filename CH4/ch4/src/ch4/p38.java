package ch4;

public class p38 {
	public static void main(String[]args) {
		iVehicle[]ivc;
		ivc =new iVehicle[2];
		
		ivc[0]=new CarP38(1234,20.5);
		ivc[1]=new PlaneP38(232);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVehicle{
	int weight=1000;
	void show();
}
class CarP38 implements iVehicle{
	private int num;
	private double gas;
	
	public CarP38(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}

class PlaneP38 implements iVehicle{
	private int flight;
	public PlaneP38(int f) {
		flight =f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
}