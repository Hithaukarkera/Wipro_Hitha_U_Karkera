package ExceptionHandling;

public class Scenario {

	public static void main(String[] args) {
		try {
			
			int arr[]= new int[3];
			arr[4]=10;
			int a=5/0; //here try only checks for the first exception then the other line will be skipped
		}
		catch(Exception e) {
			System.out.println("Exception handle:" + e);
		}
	}

}
