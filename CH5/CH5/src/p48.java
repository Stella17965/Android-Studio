class p48 {
	public static void main(String[]args) {
		CarP48 car1=new CarP48("1號車");
		car1.start();
		try {
			car1.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("結束main()的處理工作。");
	}
}
 class CarP48 extends Thread{
	 private String name;
	 public CarP48(String nm) {
		 name =nm;
	 }
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println("正在進行"+name+"的處理工作");
		 }
	 }
 }