package test;
import java.util.*;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee n1, Employee n2) {
		// TODO Auto-generated method stub
		
		Employee e1 = (Employee) n1;
		Employee e2 = (Employee) n2;
		
		return e1.Name.compareTo(e2.Name);                 //String
	}
  
}
