package Interface;
//lambda expression for multiple variables
interface message{
	void show(String msg);
}

public class LambdaExample {

	public static void main(String[] args) {
		message m= (msg)->{
			System.out.println("Message is:");
			System.out.println(msg);
		};
		
		m.show("Welcome to Java");
	}

}
