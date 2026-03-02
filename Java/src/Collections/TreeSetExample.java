package Collections;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> cities =new TreeSet<>();
		
		try {
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add(null);  //null pointer Exception because TreeSet does not allow null values
		
		}
		catch(NullPointerException e) {
			//System.out.println(cities);
			System.out.println("Null value not allowed in TreeSet ");
			
		}
		
	}

}
