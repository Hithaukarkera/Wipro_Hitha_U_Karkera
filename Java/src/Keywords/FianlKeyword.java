package Keywords;

//final keyword cannot be changed
//method cannot be override 
// class cannot be extended
class students{
	final int rollNo;  // final keyword- cannot be modified because it will restrict from modifying
	String name;
	static String college="IIT Delhi";   
	
	students(int r, String n){   
		rollNo=r;                  
		name=n;
	}
	final void display() {
		System.out.println(rollNo +" " +name +" " +college);
	}
}
public class FianlKeyword {

	public static void main(String[] args) {
		student s1= new student(1, "Hitha");
		student s2= new student(2, "Renu");
		
		s1.display();
		s2.display();

	}

}
