
@FunctionalInterface
interface DemoAno {
	void meth1(int a);

//	void meth2();
}

//class HarryFunc implements DemoAno{
//
//	@Override
//	public void meth1() {
//		System.out.println("This is Method 1");
//		
//	}
//	
//}

//class AnonyDemo implements DemoAno {
//	public void display() {
//		System.out.println("Hello:");
//	}
//
//	@Override
//	public void meth1() {
//		System.out.println("I,m Meth1");
//
//	}
//
//	@Override
//	public void meth2() {
//		System.out.println("I,m Meth2");
//
//	}
//}

public class Java_A59_LambdaExpressions {

	public static void main(String[] args) {
//		DemoAno obj = new AnonyDemo();
//		
//		obj.meth1();
//		obj.meth2();
		
//		Example of Anonymous class ###########################################################################
		
//		DemoAno obj = new DemoAno() {
//			
//			@Override
//			public void meth1() {
//				System.out.println("I,m Meth1");
//				
//			}
//			
//			@Override
//			public void meth2() {
//				System.out.println("I,m Meth2");
//				
//			}
//		};
//		
//		obj.meth1();
//		obj.meth2();
		
//		Lambda Expressions ###################################################################################
		
//		HarryFunc obj = new HarryFunc();
//		obj.meth1();
		
		DemoAno obj = (a)->{
			System.out.println("This is Method 1 from this lambda " + a);
		};
		
		obj.meth1(6);
		
	}
}
