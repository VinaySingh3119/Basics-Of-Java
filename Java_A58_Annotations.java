import java.io.Serial;

@FunctionalInterface
interface MyFunctionalInterface{
	void thisMethod();
}

class MyPhone{
	public void showTime() {
		System.out.println("Time is 8 am");
	}
	public void on() {
		System.out.println("Turn on the Phone:");
	}
}

class MyNewPhone3 extends MyPhone implements MyFunctionalInterface{
	@Override
	public void showTime() {
		System.out.println("Time is 8 pm");
	}
	
	@Deprecated
	public int sum(int a, int b) {
		return a + b;
	}
	
	public void thisMethod() {
		System.out.println("This is Interface Method:");
	}
}
public class Java_A58_Annotations {
	
	@SuppressWarnings("Deprecated")
	public static void main(String[] args) {
		MyNewPhone3 phone = new MyNewPhone3();
		
		phone.showTime();
		phone.sum(5, 6);
		phone.thisMethod();
		
	}
}
