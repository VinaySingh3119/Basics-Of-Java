
public class Java_3_Associativity {
	public static void main(String[] args) {

// 		Precedence & Associativity
		
		int a = 6*5-34/2;
		/*
		 * Highest precedence goes to * and /. They are the evaluated on the basis of left to right associativity.
		 * = 6*5-34/2
		 * = 30-34/2
		 * = 30-17
		 * = 12
		 */
		int b = 60/5-34*2;
		/* 
		 *= 60/5-34*2
		 *= 12-34*2
		 *= 12-68
		 *= 56
		 */
		System.out.println(a);
		System.out.println(b);
		
	}
}
