
interface Bycycle{
	
	int a = 45;
	void Break(int decrement);
	void SppedUp(int increment);
	
}

interface BlowHorn{
	void BlowHornK3g();
	void BlowHornMhn();
}


class AvonCycle implements Bycycle, BlowHorn{
	
	void BlowHorn() {
		System.out.println("Pee Pee Poo Poo");
	}
	
	public void Break(int decrement) {
		System.out.println("Applying Break...");
	}
	public void SppedUp(int increment) {
		System.out.println("Applying Speedup...");
	}
	
	public void BlowHornK3g() {
		System.out.println("Kbhi khushi khbhi gum pee pee pee");
	}
	
	public void BlowHornMhn() {
		System.out.println("Me hu na poo poo poo");
	}
	
}

public class Java_A28_AbstractVsInterface {
	
	public static void main(String[] args) {
		AvonCycle vinay = new AvonCycle();
		
//		You can create properties in interface
		vinay.Break(1);
		System.out.println(vinay.a);
		
//		You cannot modify the property of interface as they are final
//		vinay.a = 66;
//		System.out.println(vinay.a);
		
		vinay.BlowHornK3g();
		vinay.BlowHornMhn();
		
	}
}
