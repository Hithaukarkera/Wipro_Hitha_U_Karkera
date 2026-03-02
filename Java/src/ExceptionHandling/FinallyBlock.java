package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int x=100/5;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		
		//finally block always execute
		
		finally {
			System.out.println("Finally block always executes");
		}
	}

}
