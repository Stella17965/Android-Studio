class p45 {
	public static void main(String[]args) {
		CarP45 car1 =new CarP45("1號車");
		car1.start();
		CarP45 car2 =new CarP45("2號車");
		car2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class CarP45 extends Thread{
	private String name;
	public CarP45(String nm) {
		name =nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}
