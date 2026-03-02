package Interface;

//Functional Interface -> Annotation 
//lambda expression
interface validator{
	boolean validator(String input);
}

public class FunctionalDemo {

	public static void main(String[] args) {
		validator emailCheck = email -> email.contains("@");
		System.out.println(emailCheck.validator("test@gmail.com"));

	}

}