class p47 {
	public static void main(String[]args) {
		CarP47 car1=new CarP47("1號車");
		car1.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
			}catch(InterruptedException e) {
				
			}
		}
	}
}
class CarP47 extends Thread{
	private String name;
	public CarP47(String nm) {
		name =nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}