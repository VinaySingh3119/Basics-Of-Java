

class MyRunnableThread1 implements Runnable{
	public void run() {
		while (true) {
			System.out.println("I,m Thread 1 not a treat 1 :");
		}
	}
}

class MyRunnableThread2 implements Runnable{
	public void run() {
		while(true) {
			System.out.println("I,m Thread 2 not a treat 2 :");
		}
	}
}

public class Java_A36_RunnableThread {
	public static void main(String[] args) {
		MyRunnableThread1 bullet1 = new MyRunnableThread1();
		Thread gun1 = new Thread(bullet1);
		
		MyRunnableThread2 bullet2 = new MyRunnableThread2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
		
		
	}
}
