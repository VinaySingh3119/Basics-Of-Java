
class Base{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Im in Base and setting x now...");
		this.x = x;
	}
	
	public void printMe() {
		System.out.println("Learning a Inheritance...");
	}
}

class Derived extends Base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("Im in derived class and set y now...");
		this.y = y;
	}
	
}



public class Java_A23_Inheritance {
	
	public static void main(String[] args) {
		
//		Creating a object of Base class:
		Base B = new Base();
		
		B.setX(4);
		System.out.println(B.getX());
		B.printMe();
		
//		Creating a object of Derived class:
		Derived D = new Derived();
		
		D.setX(5);
		System.out.println(D.getX());
		D.printMe();
		
		D.setY(6);
		System.out.println(D.getY());
		
	}
}
