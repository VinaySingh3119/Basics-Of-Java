
/**
 * This is a good class
 */
public class Java_A57_JavaDocs {
	
	/**
	 * 
	 * @param args These are arguments supplied to the command line
	 */
	public static void main(String[] args) {
		System.out.println("I,m main method");
	}
	
	/**
	 * Hello this is the method and this is the most beautiful method of this class 
	 * @param i This is first number to add
	 * @param j This is second number to add
	 * @return Sum of two numbers as an Integer
	 * @exception Exception if i is 0
	 * @deprecated This method is deprecated please use + Operator
	 */
	public int add(int i, int j) throws Exception {
		
		if(i==0) {
			throw new Exception();
		}
		int c;
		c = i + j;
		return c;
	}
}
