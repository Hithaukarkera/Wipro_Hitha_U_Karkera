package Usecases;

//Use Case: Patient Record System: protect patient health info


public class PatientRecordSystem {
	private String name;
	private String status;
	private String healthIssue;
	
	public void setName(String name) {
		this.name= name;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public void setHealthIssue(String healthIssue) {
		this.healthIssue= healthIssue;
	}
	
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	public String getHealthissue() {
		return healthIssue;
	}

	public static void main(String[] args) {
		PatientRecordSystem p= new PatientRecordSystem();
		p.setName("Pateint 1");
		p.setStatus("Fine");
		p.setHealthIssue("Fever");
		
		System.out.println("Name:" +p.getName());
		System.out.println("Status:" +p.getStatus());
		System.out.println("Health Issue:" +p.getHealthissue());
	}

}
