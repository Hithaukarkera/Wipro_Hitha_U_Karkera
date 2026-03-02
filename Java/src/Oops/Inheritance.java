package Oops;//child inherits the properties of parent class

class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.bark();
	}

}
