
public class Java_A13_Array {
	public static void main(String[] args) {
		/* Classroom of 500 Student - You have to store marks of these 500 student
		 * You have 2 option:
		 * 1. Create 500 variable
		 * Or
		 * 2. Use Array
		 */
		
//		There are three main ways to create an array in Java
		
//		1. Declaration and memory allocation
//		int [] marks = new int [5];
		
//		2. Declaration and then memory allocation
//		int [] marks;
//		marks = new int[5]; 
		
//		Initialization
//		marks[0] = 100;
//		marks[1] = 70;
//		marks[2] = 65;
//		marks[3] = 98;
//		marks[4] = 86;
//		marks[4] = 93; 
		
//		3. Declaration, memory allocation and initialization together
		int [] marks = {100,70,80,71,98};
		

//		marks[5] - throws an error
		
		System.out.println(marks[4]);
		
	}
}

