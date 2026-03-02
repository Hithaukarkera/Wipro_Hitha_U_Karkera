package Usecases;
import java.util.*;

public class HospitalSystemHashMap {
	int patientId;
	private String name;
	private int age;
	
	private static Map<Integer, HospitalSystemHashMap> patients = new HashMap<>();
	
	public HospitalSystemHashMap(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public static void registrationPatient(HospitalSystemHashMap patient) {
		if(patients.containsKey(patient.patientId)) {
			System.out.println("Patient ID " +patient.patientId + "is already registered");
		}
		else {
			patients.put(patient.patientId, patient);
			System.out.println("Patient added to the system: " +patient);
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
		HospitalSystemHashMap p1 = new HospitalSystemHashMap(101, "Ravi", 30);
		HospitalSystemHashMap p2 = new HospitalSystemHashMap(102, "Ram", 30);
		HospitalSystemHashMap p3 = new HospitalSystemHashMap(103, "Ramesh", 35);
		
		registrationPatient(p1);
		registrationPatient(p2);
		registrationPatient(p3);
		
		displayPatients();
	}

}
