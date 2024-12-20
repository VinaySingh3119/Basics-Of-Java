
class Employee{
		String name;
		int id;
		int Salary;
		
		public void printDetail() {
			System.out.println("My id is: " + id);
			System.out.println("My name is: " + name);
			System.out.println("My salary is: " + Salary);
			System.out.println();
		}
		public int getSalary() {
			return Salary;
		}
	}
	
public class Java_A20A_OOP1 {
	
	public static void main(String[] args) {
		
		System.out.println("This is coustem class...");
		
		// Instantiating a new object a new Employee Object.
		Employee vinay = new Employee();
		
		Employee john = new Employee();
		
		// Setting properties 
//		vinay.id = 12;
//		vinay.name = "Vinay Singh";
//		int Salary = 34850;
		
		// Printing the Attribute
//		System.out.println(vinay.id);
//		System.out.println(vinay.name);
		
//		vinay.printDetail("Vinay Singh",12,Salary);
		
		john.name = "John";
		john.id = 12;
		john.Salary = 32500;
		
		john.printDetail();
		int Salry = john.getSalary();
		System.out.println(Salry);
		
		vinay.name = "Vinay";
		vinay.id = 13;
		vinay.Salary = 45000;
		
		vinay.printDetail();
		
	}

}
