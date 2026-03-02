package Keywords;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			int bal=2000;
			if(bal<5000) {
				throw new Exception("Insufficient Bal");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
