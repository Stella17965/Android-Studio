class p32 {
	public static void main(String[]args)throws CarExceptionP32 {
		CarP32 car1;
		car1 =new CarP32();
		car1.setCar(1234,-10.0);
		car1.show();
	}
}
class CarExceptionP32 extends Exception{
	
}
class CarP32{
	private int num;
	private double gas;
	
	public CarP32() {
		num=0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar(int n,double g)throws CarExceptionP32{
		if(g<0) {
			CarExceptionP32 e =new CarExceptionP32();
			throw e;
		}else {
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}