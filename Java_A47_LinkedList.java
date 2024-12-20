import java.util.LinkedList;

public class Java_A47_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
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
		l1.addFirst(788);
		l1.addLast(655);
		
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
