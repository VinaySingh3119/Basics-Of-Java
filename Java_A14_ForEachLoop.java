
public class Java_A14_ForEachLoop {
	public static void main(String[] args) {
//		float [] marks = {98.1f,45.5f,79.3f,99.4f,80.2f};
//		
//		Display length off Array-
//		System.out.println(marks.length);
//		System.out.println(marks[2]);
//		
//		String [] student = {"Vinay", "Rohan", "Subham", "Lavish"};
//		
//		System.out.println(student[2]);
//		System.out.println(student.length);
		
		int [] marks = {98,45,79,99,80};
		
//		Display the Array (Naive Way)
		
		System.out.println("Printing using naive method...");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]); 
		
//		Display the Array (for loop)
		
		System.out.println("Printing using for loop...");
		for(int i = 0;i < marks.length;i++) {
			System.out.println(marks[i]);
		}
		
//		Quick Quiz: Displaying the Array in Reverse order(for loop)
		System.out.println("Printing using for loop in reverse order...");
		for(int i = marks.length-1;i >= 0;i--) {
			System.out.println(marks[i]);
		}
		
		
//		Quick Quiz: Displaying the Array(for each loop)
		System.out.println("Printing using For Each loop...");
		for(int element: marks) {
			System.out.println(element);
		}
		
	}
}
