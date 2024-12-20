
class MyThread1 extends Thread{
	
	@Override
	public void run() {
		
		int i = 0;
		while(i<40000) {
			System.out.println("My cook Thread is running:");
			System.out.println("i.m feel good:");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	
	@Override
	public void run() {
		
		int i = 0;
		while(i<40000) {
			System.out.println("My Thread chatting with her:");
			System.out.println("i.m feel sad:");
			i++;
		}
	}
}

public class Java_A35_Threading {
	public static void main(String[] args) {
		
		System.out.println("Function is starting");
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
		
	}
}
