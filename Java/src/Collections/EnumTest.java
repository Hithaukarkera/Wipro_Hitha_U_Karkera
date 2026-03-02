package Collections;

enum Status{
	SUCCESS(200),
	ERROR(500);
	
	private final int code;
	Status(int code){
		this.code=code;
	}
	public int getCode() {
		return code;
	}
}

public class EnumTest {

	public static void main(String[] args) {
		Status status=Status.SUCCESS;
		System.out.println(status);
		System.out.println(status.getCode());
	}

}
