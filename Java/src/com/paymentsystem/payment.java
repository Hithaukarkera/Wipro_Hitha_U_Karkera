package com.paymentsystem;

abstract class payment {
	public int amount;
	public payment(int amount) {
		this.amount= amount;
	}
	abstract void paymentprocess();
}
class CreditCardPayment extends payment{
	public CreditCardPayment(int amount) {
		super(amount);
	}
	void paymentprocess() {
		System.out.println("Credit Card Payment:" +amount);
	}
}
class UpiPayment extends payment{
	public UpiPayment(int amount) {
		super(amount);
	}
	void paymentprocess() {
		System.out.println("UPI Payment done by UPI:" +amount);
	}
	
}