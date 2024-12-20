
class Phone{
	
	public void showTime() {
		System.out.println("Time is 8 pm...");
	}
	
	public void on() {
		System.out.println("Truning on Phone.");
	}
	
}

class SmartPhone extends Phone{
	
	public void music() {
		System.out.println("Playing Music...");
	}
	
	public void on() {
		System.out.println("Turning on SmartPhone.");
	}
	
}
public class Java_A27_DynamicMethodDispatch{
	public static void main(String[] args) {
//		Phone obj = new Phone();
//		obj.name();
//		
//		SmartPhone saobj = new SmartPhone();
//		saobj.name();
		
		Phone objP =new Phone();
		objP.showTime();
		objP.on();
		
		Phone obj = new SmartPhone();
		obj.showTime();
		obj.on();
		
		
		
	}
}