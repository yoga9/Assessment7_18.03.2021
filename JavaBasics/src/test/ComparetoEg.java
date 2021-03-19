package test;

public class ComparetoEg {
	
	public static void main(String[] args) {
		
		String a = "Yoga";
		String b = "Nithya";
		String c = "Vizhali";
		String d = "Yoga";
		
		System.out.println(b.compareTo(a));          //String - Different - (> - (-ve))
		System.out.println(a.compareTo(d));         //String - Same - 0 
		System.out.println(a.compareTo(c));         //String - Different -(<- (+ve))
		
	}

}
