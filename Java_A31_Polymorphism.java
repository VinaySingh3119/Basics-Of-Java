
interface Camera2{
	void TakeSnap();
	void RecordVideo();
	
	private void greet() {
		System.out.println("Good Morning...");
	}
	
	default void Record4KVideo() {
		greet();
		System.out.println("Recording 4K Video:");
	}
}

interface Wifi2{
	String[] getNetwork();
	void ConnectToNetwork(String Network);
}

class MyCellPhone2{
	
	void CallNumber(int Number) {
		System.out.println("Calling "+ Number);
	}
	
	void PickCall() {
		System.out.println("Connecting...");
	}
	
//	void TakeSnap() {
//		System.out.println("Take a Snap");
//	}
	
	
}

class MySmartPhone2 extends MyCellPhone2 implements Wifi2, Camera2{
	public void TakeSnap() {
		System.out.println("Take a Snap:");
	}
	
	public void RecordVideo() {
		System.out.println("Recording a video:");
	}
	
	public String[] getNetwork() {
		System.out.println("Getting List of network...");
		
		String[] NetworkList = {"Vinay","Harry","MyJio"};
		return NetworkList;
	}
	
	public void ConnectToNetwork(String Network) {
		System.out.println("Print the netwrok " + Network);
	}
	
	
}

public class Java_A31_Polymorphism {
	public static void main(String[] args) {
		
		Camera2 cm1 = new MySmartPhone2(); // This is a SmartPhone but use it as Camera
		
		cm1.Record4KVideo();
//		cm1.getNetwork(); --> Not allow
		
		Wifi2 wi1 = new MySmartPhone2(); // This is a SmartPhone but use it as Wifi Network
		
		String[] ar = wi1.getNetwork();
		
		for (String item : ar) {
			System.out.println(item);
		}
		
//		wi1.Record4KVideo(); --> Throw an error

	}
}
