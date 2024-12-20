
interface Camera{
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

interface Wifi{
	String[] getNetwork();
	void ConnectToNetwork(String Network);
}

class MyCellPhone{
	
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

class MySmartPhone extends MyCellPhone implements Wifi, Camera{
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

public class Java_A29_InterfaceDefaultMethod {
	public static void main(String[] args) {
		MySmartPhone ms = new MySmartPhone();
		
		ms.Record4KVideo();
//		ms.greet() --> Throws an error
		String[] ar = ms.getNetwork();
		for (String item : ar) {
			System.out.println(item);
		}
	}
}
