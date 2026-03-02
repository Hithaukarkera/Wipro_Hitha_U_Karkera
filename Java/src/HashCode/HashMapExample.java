package HashCode;
import java.util.*; //or Map, HashMap

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> Employee = new HashMap<>();
		
		//HashMap<Integer, String> Employee1 = new HashMap<>();
		
		Employee.put(101, " Hitha");
		Employee.put(102, " Sonali");
		Employee.put(103, " Renu");
		System.out.println(Employee);
		
		System.out.println("Initial Map:" +Employee);
		
		String EmployeeName = Employee.get(102);
		System.out.println("Value for key 102:" +EmployeeName);
		
		System.out.println("Contain key 101" +Employee.containsKey(101));
		System.out.println("Contain Value Hitha? " +Employee.containsValue("Hitha"));
		
		Set<Integer>keys = Employee.keySet();
		System.out.println("All keys: " +keys);
	}

}
