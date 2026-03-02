package Interface;

interface Drawable{
	void draw();
}
public class LambdaInterface {
	public static void main(String[] args) {
		//with lambda expression
		
		Drawable d=() -> System.out.println("Drawing");
		d.draw();
	}

}
		
//without lambda expression
		
		/*Drawable d= new Drawable() {
			public void draw() {
				System.out.println("Drawing");
			}
			
		}; 
		d.draw();*/
		
		
