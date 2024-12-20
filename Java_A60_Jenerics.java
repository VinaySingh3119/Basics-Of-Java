
import java.util.ArrayList;

class MyGeneric<T1, T2>{
	int val;
	protected T1 t1;
	protected T2 t2;
	
	public MyGeneric(int val, T1 t1, T2 t2) {
		super();
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	
	
	
	
}

public class Java_A60_Jenerics {
	public static void main(String[] args) {
//		ArrayList arrayList = new ArrayList();
//		
//		arrayList.add("str1");
//		arrayList.add(6);
//		arrayList.add(365);
//		
//		int a = (int) arrayList.get(2);
//		
//		System.out.println(a);
		
		MyGeneric<String,Integer> g1 = new MyGeneric(23, "MyString is my String: ", 45);
		g1.setT1("I,m String ");
		String str = g1.getT1();
		int int1 = g1.getT2();
		
		System.out.println(str + int1);
		
		
	}
}
