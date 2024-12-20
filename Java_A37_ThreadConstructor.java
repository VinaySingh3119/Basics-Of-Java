
class MyThr extends Thread{
	
	public MyThr(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Thank you:");
	}
}

public class Java_A37_ThreadConstructor {
	public static void main(String[] args) {
		MyThr t1 = new MyThr("Vinay");
		MyThr t2 = new MyThr("Singh");
		
		t1.start();
		t2.start();
		
		System.out.println("The id of Thread t1 is " + t1.getId());
		System.out.println("The name of Thread t1 is " + t1.getName());
		
		System.out.println("The id of Thread t2 is " + t2.getId());
		System.out.println("The name of Thread t2 is " + t2.getName());
		
	}
}
