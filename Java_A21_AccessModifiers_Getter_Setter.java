
class MyEmployee{
	
	private int id;
	private String name;
	
	public String getName() {
		return name; 
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	
}



public class Java_A21_AccessModifiers_Getter_Setter {
	
	public static void main(String[] args) {
		
		MyEmployee vinay = new MyEmployee();
		
//		vinay.id = 45;
//		vinay.name = "Vinay Singh";-> Throw an error due to private access modifier
		
		vinay.setName("Vinay Singh");
		System.out.println(vinay.getName());
		vinay.setId(45);
		System.out.println(vinay.getId());
		
		
	}

}
