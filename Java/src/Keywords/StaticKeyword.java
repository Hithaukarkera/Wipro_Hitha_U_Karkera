package Keywords;

class student{
	int rollNo;
	String name;
	static String college="IIT Delhi";   //college is static
	
	student(int r, String n){   //constructor //if we other name then this keyword is not used, same name means it is used.
		rollNo=r;                  //int r is there and in the class it is rollNo, so the name is different then this keyword is not used.
		name=n;
	}
	void display() {
		System.out.println(rollNo +" " +name +" " +college);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		student s1= new student(1, "Hitha");
		student s2= new student(2, "Renu");
		
		s1.display();
		s2.display();

	}

}
