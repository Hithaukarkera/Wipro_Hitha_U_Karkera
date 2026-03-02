package Collections;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		//ArrayList<String> name= new ArrayList<>();
		names.add("Hitha");
		names.add("Karkera");
		names.add("Hitha");
		
		names.clear();
		names.addFirst("1");
		names.addLast("last");
		names.add(3,"Third");
		names.contains("hitha");
		names.equals("equal");
		names.get(1);
		names.getClass();
		names.getFirst();
		names.getLast();
		names.indexOf("equal");
		names.isEmpty();
		names.iterator();
		names.lastIndexOf(names);
		names.listIterator();
		names.notify();
		names.notifyAll();
		names.parallelStream();
		names.remove(1);
		names.removeFirst();
		names.removeLast();
		names.reversed();
		
		
		System.out.println(names);
	}

}
