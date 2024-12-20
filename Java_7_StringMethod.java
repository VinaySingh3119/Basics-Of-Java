
public class Java_7_StringMethod {
	public static void main(String[] args) {
		String name = "Vinay";
		String Sname = name.substring(1,4);
		
		System.out.println(Sname);
		String a1 = new String("Vinay");	
		System.out.println(a1);
		
		System.out.println(a1!=name);
//		
//		System.out.println(name);
//
////		Return length of String name
//		
//		int value = name.length();
//		
//		System.out.println(value);
//		
////		new String which has all the lowercase charactor from the String name
//		
//		String lstring = name.toLowerCase();
//		
//		System.out.println(lstring);
//	
////		new String which has all the Uppercase charactor from the String name
		
//		String ustring = name.toUpperCase();
//		
//		System.out.println(ustring);
//		
////		Return a new String after remming all the leading and troling spaces from the original String
//		
//		String nonTrimString = "     Vinay    ";
//		
//		System.out.println(nonTrimString);
//		
//		String trimmedString = nonTrimString.trim();
//		
//		System.out.println(trimmedString);
		
//		Return a substring from to the end Substring(2) Return "nay"
		
		System.out.println(name.substring(2));
//		
////		Return a substring from short index to the end endex. Short index is included and end is exlucding
//		
		System.out.println(name.substring(2,4));
//		System.out.println(Sname);
//		
////		Return a new String after replacing n with j Vijay is return in this case
//		
//		System.out.println(name.replace('n','j'));
//		System.out.println(name.replace("ay","it"));
//		
////		Return true if name starts with String "Vin" true case in this case
//		
//		System.out.println(name.startsWith("Vin"));
//		System.out.println(name.startsWith("nay"));
//		
////		Return true if name ends with String "nay" true in this case
//		
//		System.out.println(name.endsWith("nay"));
//		System.out.println(name.endsWith("Vin"));
//		
////		Return character at a givin index name.charAt(3) position a in this case
//		
		System.out.println(name.charAt(4));
//		
////		Return the index of the giving String from index 3 (int) -1 is return in this case
//		
//		System.out.println(name.indexOf("nay"));
//		
		String modifiedName = "Harryrry";
//		
//		System.out.println(modifiedName.indexOf("rry",4));		
//		
		System.out.print(modifiedName.lastIndexOf("rry"));
		
		
	}
}
