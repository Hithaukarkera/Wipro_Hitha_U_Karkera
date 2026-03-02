package Oops;
class animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog1 extends animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}



class cat extends animal{
void sound() {
	System.out.println("Cat Meows");
}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a= new Dog1();
		a.sound();

	}

}
