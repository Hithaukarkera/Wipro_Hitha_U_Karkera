package Interface;

interface A{
	void show();
}
interface B{
	void display();
}
public class Interface implements A, B{ //in the place of interface demo can be replaced
	public void show() {
		System.out.println("Show Method");
	}
	public void display() {
		System.out.println("Display Method");
	}


	public static void main(String[] args) {
		Interface d= new Interface();
		d.show();
		d.display();
	}
}
	
