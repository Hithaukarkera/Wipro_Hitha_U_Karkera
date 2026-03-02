package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int arr[]= {10,20,30};
			
			System.out.println(arr[5]);// output will be array out of bound bcz array size is 5 but original size is 0,1,2
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		
		catch(Exception e) {
			System.out.println("Generic Exception");
		}

	}

}
