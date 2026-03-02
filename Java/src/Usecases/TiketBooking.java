package Usecases;
//Synchronization using this only 1 user can book seat at a time

class TicketCounter{
	int seats=1;
	synchronized void bookseat(String user) {  //one thread can execute
		if(seats > 0) {
			System.out.println(user +" is booking seat");
			seats --;  //race condition is used(decreases seat count from 1 to 0)
			System.out.println(user + " booked seat successfully");
		}else {
			System.out.println(user +" failed to book the seat");
		}
	}
}
class User extends Thread{
	TicketCounter counter;
	String user;
	
	User(TicketCounter counter, String user){
		this.counter=counter;
		this.user= user;
	}
	
	public void run() {
		counter.bookseat(user);
	}
}
public class TiketBooking {

	public static void main(String[] args) {
		TicketCounter counter= new TicketCounter();
		
		new User(counter, "User-1").start();
		new User(counter, "User-2").start();

	}

}
