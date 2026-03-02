package Usecases;

import java.util.HashMap;
import java.util.Map;

class Patient {
    int patientId;
    String name;
    int age;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }
}

public class HospitalSystemHashMaps {

    // HashMap to store patient records
    private static Map<Integer, Patient> patients = new HashMap<>();

    // Add Patient
    public static void addPatient(int id, String name, int age) {
        if (patients.containsKey(id)) {
            System.out.println("Patient already exists.");
            return;
        }
        patients.put(id, new Patient(id, name, age));
        System.out.println("Patient added successfully.");
    }

    // Update Patient
    public static void updatePatient(int id, String name, int age) {
        if (!patients.containsKey(id)) {
            System.out.println("Patient not found.");
            return;
        }
        patients.put(id, new Patient(id, name, age));
        System.out.println("Patient updated successfully.");
    }

    // Retrieve Patient
    public static void getPatient(int id) {
        Patient patient = patients.get(id);
        if (patient == null) {
            System.out.println("Patient not found.");
        } else {
            System.out.println(patient);
        }
    }

    // Remove Patient
    public static void removePatient(int id) {
        if (patients.remove(id) != null) {
            System.out.println("Patient removed successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    // List All Patients
    public static void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }
        for (Patient p : patients.values()) {
            System.out.println(p);
        }
    }

    // Check Existence
    public static void checkExistence(int id) {
        System.out.println(
            patients.containsKey(id)
                ? "Patient exists."
                : "Patient does not exist."
        );
    }

    // Count Patients
    public static void countPatients() {
        System.out.println("Total patients: " + patients.size());
    }

    // Clear System
    public static void clearSystem() {
        patients.clear();
        System.out.println("All patient records cleared.");
    }

    // Main (method calls only)
    public static void main(String[] args) {

        addPatient(101, "Anita", 25);
        addPatient(102, "Rahul", 30);

        listPatients();

        updatePatient(101, "Anita Sharma", 26);

        getPatient(101);

        checkExistence(103);

        removePatient(102);

        countPatients();

        clearSystem();

        listPatients();
    }
}
