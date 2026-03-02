package Oops;//hiding implementation. only showing essential features/functionality

abstract class vehicle{  //example of car break
	abstract void start();
}
class car extends vehicle{
	void start() {
		System.out.println("Car starts with key");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		
		vehicle v= new car();
		v.start();

	}

}
