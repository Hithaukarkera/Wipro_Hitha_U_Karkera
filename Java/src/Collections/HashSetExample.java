package Collections;
import java.util.*;
//import java.util.HashSet;
//import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		names.add("Hitha");
		names.add("Hitha");    //no duplicates output
		names.add("U");
		names.add("Karkera");
		names.add("sonali");
		
		System.out.println(names);
	}

}
