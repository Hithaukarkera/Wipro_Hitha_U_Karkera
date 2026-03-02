package Interface;

interface vehicle{
	void start();
	default void fuelType() {
		System.out.println("Fueled");
	}
}
class cars implements vehicle{
	public void start(){
		System.out.println();
	}
}
public class TestDefault{
	public static void main(String[] args) {
		vehicle v=new cars();
		v.start();
		v.fuelType();
	}
}