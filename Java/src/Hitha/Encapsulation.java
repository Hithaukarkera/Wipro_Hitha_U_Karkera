package Hitha;

public class Encapsulation {
	private int salary;
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		Encapsulation e= new Encapsulation();
		e.setSalary(500000);
		System.out.println(e.getSalary());
	}

}
