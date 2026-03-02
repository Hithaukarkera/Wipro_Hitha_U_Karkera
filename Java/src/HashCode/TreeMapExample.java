package HashCode;
import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer, String>Employee = new TreeMap<>(Comparator.reverseOrder());
		
		Employee.put(101, " Hitha");
		Employee.put(102, " Renu");
		Employee.put(103, " Karkera");
		Employee.put(104, " Sonali");
		
		System.out.println(Employee);

	}

}
