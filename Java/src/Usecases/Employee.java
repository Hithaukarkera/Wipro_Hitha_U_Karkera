package Usecases;  

//Employee class using getter and setter
//Use Case: Hide salary and allow access only through getter/setter

public class Employee {
	private int salary;
	void setSalary(int sal) {
		salary= sal;
	}
	int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setSalary(60000);
		System.out.println(obj.getSalary());
	}

}
