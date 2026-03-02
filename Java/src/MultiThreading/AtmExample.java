package MultiThreading;

public class AtmExample {
	//Synchronized- one thread can execute at critical sections of time
	
	synchronized void withdraw(String name) {
		System.out.println(name +"is withdrawing money");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		System.out.println(name +"is withdrawal completed");
		
	}

	public static void main(String[] args) {
		AtmExample atm= new AtmExample();
		
		new Thread(() ->atm.withdraw("User-1:")).start();
		new Thread(() ->atm.withdraw("User-2:")).start();

	}

}
