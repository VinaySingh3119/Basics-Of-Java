  


public class Java_A44_Finally {
	
	public static int greet() {
		try {
			int a = 50;
			int b = 25;
			int c = a/b;
			return c;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is the end of the program:");
		}
		
		return 0;
	}
	public static void main(String[] args) {
		int k = greet();
		
		System.out.println(k);
		
		int a = 99;
		int b = 9;
		
		while(true) {
			
			
			try {
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I,m Finally for value b = " + b);
			}
			b--;
			
		}
		
		
		try {
			System.out.println(50/3);
		}
		finally {
			System.out.println("Yes this is valid in java program:");
		}
		
	}
}
