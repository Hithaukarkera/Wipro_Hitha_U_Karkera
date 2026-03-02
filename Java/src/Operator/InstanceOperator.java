package Operator;//instance operator

class animal{
	
}
class Dogesh extends animal{
	
}
public class InstanceOperator {

	public static void main(String[] args) {
		Dogesh d= new Dogesh();
		System.out.println(d instanceof Dogesh);
		System.out.println(d instanceof animal);
	}

}
