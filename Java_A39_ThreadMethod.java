

class MyNewThr1 extends Thread{
	
	public void run() {
		int i = 0;
		while(true) {
			System.out.println("Thank You 1:" + i);
			try {
				Thread.sleep(45);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class MyNewThr2 extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("Thank You 2:");
		}
	}
}

public class Java_A39_ThreadMethod {
	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		
		t1.start();
		
//		try {
//			t1.join();
//		} 
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		t2.start();
		
	}
}
