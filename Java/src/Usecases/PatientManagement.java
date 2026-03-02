package Usecases;
import java.util.*;
//collections


public class PatientManagement {

	public static void main(String[] args) {
		LinkedList<String>patients = new LinkedList<>();
		
		patients.add("Hitha");
		patients.add("sai");
		patients.add("krishna");
		
		patients.addFirst("Emegency Patient - Suresh");
		patients.addLast("Pooja");
		
	System.out.println("Patient List:" +patients);
	
	System.out.println("First Patient:" +patients.getFirst());
	
	System.out.println("Last Patient:" +patients.getLast());
	
	System.out.println("Is Pooja Present:" +patients.contains("Pooja"));
	
	System.out.println("Treated Patient:" +patients.removeFirst());
	
	System.out.println("Total Remaining Patients:" +patients.size());
	
	System.out.println("Updated Patient List:");
	for(String patient : patients) {
		System.out.println(patients);
	}
	
	
	
	
	}

}
