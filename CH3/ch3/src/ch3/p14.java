package ch3;

public class p14 {
	public static void main(String[]args) {
		Car car1;
		car1=new Car();
		car1.setNum(1234);
		car1.getGas(20.5);
			
	}
}
class Car{
	int num;
	double gas;
	void setNum(int n) {
		num=n;
		System.out.println("將車子設為"+num);
	}
	void getGas(double g) {
		gas=g;
		System.out.println("將汽油量設為"+gas);
	}
}
