package Usecases;
import java.util.*;

public class HospitalSystemTreeMap {
	private int patientId;
	private String name;
	private int age;
	
	private static Map<Integer, HospitalSystemHashMap> patients = new TreeMap<>();
	
	public HospitalSystemTreeMap(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public static void registrationPatient(HospitalSystemTreeMap p1) {
		if(patients.containsKey(p1.patientId)) {
			System.out.println("Patient ID " +p1.patientId + "is already registered");
		}
		else {
			//patients.put(p1.patientId, p1);
			System.out.println("Patient added to the system: " +p1);
		}
	}
	public static void displayPatients() {
		System.out.println("List of registered Patients (HashMap):");
		for(HospitalSystemHashMap p : patients.values()) {
			System.out.println(p);
		}
	}
	
	public String toString() {
		return "Patient [ID=" +patientId + ", Name=" +name + ",Age=" +age +"]"; 
	}

	public static void main(String[] args) {
		HospitalSystemTreeMap p1 = new HospitalSystemTreeMap(101, "Ravi", 30);
		HospitalSystemTreeMap p2 = new HospitalSystemTreeMap(102, "Ram", 30);
		HospitalSystemTreeMap p3 = new HospitalSystemTreeMap(103, "Ramesh", 35);
		
		registrationPatient(p1);
		registrationPatient(p2);
		registrationPatient(p3);
		
		displayPatients();
	}

}
