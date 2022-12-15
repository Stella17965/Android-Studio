class p44 {
	public static void main(String[]args) {
		CarP44 car1 =new CarP44("1號車");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}
class CarP44 extends Thread{
	private String name;
	
	public CarP44(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}
