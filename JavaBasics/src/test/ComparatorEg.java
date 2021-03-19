package test;
import java.util.*;

public class ComparatorEg {
   
	public static void main(String args[]) {
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		
		a.add(new Employee(1,"Rose",30));
		a.add(new Employee(2,"Jack",45));
		a.add(new Employee(3,"Francy",20));
		
		System.out.println("Sorting by AGE");
	
		Collections.sort(a, new AgeComparator());                  
		
//		Iterator i = a.iterator();                           //Using iterator
//		while(i.hasNext()) {
//			Employee Emp1 = (Employee)i.next();
//			System.out.println(Emp1.EmpId+ " " +Emp1.Name+ " " +Emp1.age);
//	}
	
	    for(Employee Emp : a) {
	    	System.out.println(Emp.EmpId+ " " +Emp.Name+ " "+Emp.age);
	    }
	    
System.out.println();

	    System.out.println("Sorting by NAME");
		
		Collections.sort(a, new NameComparator());  
		
		 for(Employee Emp : a) {
		    	System.out.println(Emp.EmpId+ " " +Emp.Name+ " "+Emp.age);
		    }
	
}
}
