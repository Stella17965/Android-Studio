class p55 {
	public static void main(String[]args) {
		CompanyP55 cmp =new CompanyP55();
		DriverP55 drv1 =new DriverP55(cmp);
		drv1.start();
		DriverP55 drv2 =new DriverP55(cmp);
		drv2.start();
	}
}
class CompanyP55{
	private int sum =0;
	public synchronized void add(int a) {
		int tmp =sum;
		System.out.println("目前合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元了");
		tmp=tmp+a;
		System.out.println("合計金額是"+tmp+"元");
		sum=tmp;
	}
}
class DriverP55 extends Thread{
	private CompanyP55 comp;
	public DriverP55(CompanyP55 c) {
		comp=c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}