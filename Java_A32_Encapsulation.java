
class Encap{
	private int value; // Data hiding

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

public class Java_A32_Encapsulation {
	public static void main(String[] args) {
		Encap Vinay = new Encap();
		Vinay.setValue(5);
		
		System.out.println(Vinay.getValue());
	}
}
