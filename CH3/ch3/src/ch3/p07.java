package ch3;

public class p07 {
	public static void main(String[]args) {
		CarP07 car1;
		car1=new CarP07();
		car1.num=1234;
		car1.gas=20.5;
		
		CarP07 car2;
		car2=new CarP07();
		car2.num=2345;
		car2.gas=30.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}
}
class CarP07{
	int num;
	double gas;
}