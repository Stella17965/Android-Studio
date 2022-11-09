package ch3;

public class p15 {
	public static void main(String[]args) {
		Car car1;
		car1=new Car();
		
		int number=2134;
		double gasoline=20.5;
		
		car1.setNumGas(number,gasoline);
	}
}
class Car{
	int num;
	double gas;
	void setNumGas(int n,double g) {
		num=n;
		gas =g;
		System.out.println("將車子設為"+num+"汽油量設為"+gas);
	}
	void show() {
		System.out.println("車號是"+gas);
		System.out.println("汽油量是"+gas);
	}
}