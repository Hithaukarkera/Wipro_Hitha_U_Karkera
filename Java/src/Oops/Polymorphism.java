package Oops;

public class Polymorphism {
	int add(int a, int b) {
		return a+b;
		
	}
	double add(double a, double b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Polymorphism e= new Polymorphism();
		System.out.println(e.add(2,3));
		System.out.println(e.add(2, 5,3));
		System.out.println(e.add(2, 3,6));
		
		
	}

}
