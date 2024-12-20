
import java.lang.reflect.Array;
import java.util.*;

public class Java_A46_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>(5);
		
		l2.add(18);
		l2.add(16);
		l2.add(15);
		
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(5);
		l1.add(6);
		l1.add(0,9);
		l1.add(0,1);
		l1.addAll(l2); 
		
//		l1.remove(1);
		
		l1.set(1, 566);
		
//		l1.clear();
		
		System.out.println(l1.contains(27));
		System.out.println(l1.indexOf(6));
		System.out.println(l1.lastIndexOf(6));
		
//		System.out.println(l1.equals(2));
		
//		l1.removeAll(l1);
		System.out.println(l1.size());
		
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}
		
		
		
		
	}
}
