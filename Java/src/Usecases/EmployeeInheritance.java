package Usecases;

class employee{
	int id;
	String name;
	double salary;
	public employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
    
	}
}

class Developer extends employee{
	public Developer(int id, String name, double salary) {
		super(id, name, salary);
		
	}	
	void display() {
		super.display();
		System.out.println("I am a Developer");
	}
	
}
class Manager extends employee{
	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}
	void display() {
		super.display();
		System.out.println("I'm not a Manager");
	}
}

	public class EmployeeInheritance {

		public static void main(String[] args) {
			employee e1= new Developer(100, "Hitha", 25000);
			employee e2= new Manager(10, "Karkera", 50000);
			e1.display();
			e2.display();
	}

}
