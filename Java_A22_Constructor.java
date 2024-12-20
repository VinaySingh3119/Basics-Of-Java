
class MyMainEmployee{
	
	private int id;
	private String name;
	
	public MyMainEmployee() {
		id = 0;
		name = "Vinay Singh";
	}
	
	public MyMainEmployee(int myId, String myName) {
		id = myId;
		name = myName;
	}
	
	public MyMainEmployee(String myName) {
		id = 35;
		name = myName;
	}
	
	public MyMainEmployee(int myId) {
		id = myId;
		name = "VINAY SINGH";
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	public int getId() {
		return id;
	}
	
}

public class Java_A22_Constructor {
	
	public static void main(String[] args) {
		
//		MyMainEmployee vinay = new MyMainEmployee(32,"Vinay");
		MyMainEmployee vinay = new MyMainEmployee();
		
		vinay.setId(34);
		vinay.setName("Vinay Singh Sehdev");
		
		System.out.println(vinay.getId());
		System.out.println(vinay.getName());
		
	}
}











