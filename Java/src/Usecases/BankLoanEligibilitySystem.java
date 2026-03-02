package Usecases;
import java.util.*;

public class BankLoanEligibilitySystem {

	public static void main(String[] args) {
		ArrayList<Integer> age = new ArrayList();
		ArrayList<Integer> cibilScore = new ArrayList<>();
		ArrayList<Double> income = new ArrayList<>();
		
		//Autoboxing
		age.add(21);
		cibilScore.add(780);
		income.add(60000.0);
		
		//Unboxing
		System.out.println("Loan Eligibility");
	
		for(Integer Age:age) {
			if(Age>21) {
				System.out.println(age +"is eligibile age for loan");
			}
			else {
				System.out.println(age +"is not eligible age for applying Loan");
			}
		}
		
		for(Integer Cibil:cibilScore) {
			if(Cibil>650) {
				System.out.println(cibilScore +"cibil Score is eligible to take loan");
			}
			else {
				System.out.println(cibilScore +"cibil score is not eligible to take laon");
			}
		}
		
		for(Double MonthlyIncome:income) {
			if(MonthlyIncome>20000.0) {
				System.out.println(income +"is the eligible income to take loan");
			}
			else {
				System.out.println(income +"is not eligble income to take loan");
			}
		}
		
		//wrapper methods
		System.out.println("\n Bank Loan values as String:");
		for(Integer Age:age) {
			String value= Integer.toString(Age);    //wrapper method
			System.out.println(value);
		}
		for(Integer Cibil:cibilScore) {
			String value2= Integer.toString(Cibil);    //wrapper method
			System.out.println(value2);
		}
		for(Double MonthlyIncome:income) {
			String value3= Double.toString(MonthlyIncome);    //wrapper method
			System.out.println(value3);
		}
	}

}
