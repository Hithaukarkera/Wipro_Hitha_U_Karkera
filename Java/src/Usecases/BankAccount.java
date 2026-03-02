package Usecases;


// Use Case: Bank account: allow only secure deposit/withdrawal

class Account{
	private int deposit;
	private int withdrawal;
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	public int getDeposit() {
		return deposit;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
}


public class BankAccount {

	public static void main(String[] args) {
		Account a = new Account();
		a.setDeposit(1000);
		a.setWithdrawal(2000);
		System.out.println("Deposited Amount:" +a.getDeposit());
		System.out.println("Withdrawal Amount" +a.getWithdrawal());
		

	}

}
