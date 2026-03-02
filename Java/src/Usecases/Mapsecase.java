package Usecases;
import java.util.TreeMap;

public class Mapsecase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Hitha");
		tm.put(2, "Aanchal");
		tm.put(3, "Shresta");
		tm.put(4, "Abijna");
		tm.put(10, "Sneha");
		tm.put(21, "Kavya");
		tm.put(11, "Athmika");
		//tm.put(null, null);
		
		String a=tm.get(1);
	     System.out.println("First Patient: "+a);
		if(tm.containsKey(10))
		{
			tm.put(12,"Akshatha");
		}
		System.out.println("List of patients: "+tm);
		
		System.out.println("The following Patient's id 101: "+tm.containsKey(101));
		System.out.println("The following Patient's name Hitha: "+tm.containsValue("Hitha"));
		System.out.println("Total no.of patients: "+tm.size());
		tm.remove(21);
		
	    System.out.println("After updating: "+tm);
		tm.clear();
		System.out.println("After clearing the system: "+tm);

	}

}

