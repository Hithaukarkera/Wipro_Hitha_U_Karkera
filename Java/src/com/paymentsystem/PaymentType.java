package com.paymentsystem;
@FunctionalInterface
public interface PaymentType{
	//boolean validator(int amount1);
	public boolean validate(int amount);
		//return amount > 1000;
	//}
	default void check() {
		System.out.println("Validating Payment");
	}
	static void paymentstatus() {
		System.out.println("Amount should be greater than Rs.1000");
	}
	
}
	