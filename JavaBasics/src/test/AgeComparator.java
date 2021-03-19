package test;
import java.util.*;
public class AgeComparator implements Comparator<Employee> {
	
	public int compare(Employee a1, Employee a2) {
		
	Employee e1 = (Employee) a1;
	Employee e2 = (Employee) a2;
	
	if(e1.age == e2.age)
		return 0;
	
	 else if(e1.age > e2.age)
		 return 1;
	 
	 else
		 return -1;

}
}