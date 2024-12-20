
class MyThr1 extends Thread{
	
	public MyThr1(String name) {
		super(name);
	}
	
	public void run() {
		while(true) {
			System.out.println("Thank You:" + this.getName());
		}
	}
}

public class Java_A38_ThreadPriorities {

	public static void main(String[] args) {
//		Ready Queue T1, T2, T3, T4, T5
		
		MyThr1 t1 = new MyThr1("Vinay");
		MyThr1 t2 = new MyThr1("Singh");
		MyThr1 t3 = new MyThr1("Sehdev");
		MyThr1 t4 = new MyThr1("Harry");
		MyThr1 t5 = new MyThr1("Rohan (Most Important) ");
		
		
		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t3.start();
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t4.start();
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.start();
		
		t5.setPriority(Thread.MAX_PRIORITY);
		
	}
	
}
