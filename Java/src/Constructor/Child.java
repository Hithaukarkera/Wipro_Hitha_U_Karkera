package Constructor;

class Parent{
	Parent(){
		System.out.println("Parent Class Constructor");
	}
}
public class Child extends Parent {
	Child(){
		super();
		System.out.println("Child class Constructor");
	}


	public static void main(String[] args) {
		Child a1= new Child();

	}

}
