
class Base1{
	public int x;

	public Base1() {
		System.out.println("I,m a constructor...");
	}
	
	public Base1(int x) {
		System.out.println("I,m an overloading constructor with a value of x as: " + x);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}

class Derived1 extends Base1{
	public int y;

	public Derived1() {
//		super(1);
		System.out.println("I,m a Derived class Constructor...");
	}
	
	public Derived1(int x, int y) {
		super(x);
		System.out.println("I,m an overloading Derived constructor with a value of y as: " + y);
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

class ChildOfDerived extends Derived1{
	
	ChildOfDerived(){
		System.out.println("I,m a Child of Derived Constructor...");
	}
	
	ChildOfDerived(int x, int y, int z){
		super(x,y);
		System.out.println("I,m an overloading Derived constructor with a value of z as: " + z);
		
	}
}
public class Java_A24_Constructor_In_Inheriranace {
	
	public static void main(String[]args) {
		
//		Base1 b = new Base1();
		
//		Derived1 d = new Derived1(14,32);
		
		ChildOfDerived cd = new ChildOfDerived(11, 12, 13);
		
	}
}
