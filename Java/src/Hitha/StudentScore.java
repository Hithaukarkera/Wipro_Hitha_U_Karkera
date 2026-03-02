package Hitha;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		String name=sc.next();
		
		System.out.println("English:");
		int Emarks=sc.nextInt();
		
		System.out.println("Maths:");
		int Mmarks=sc.nextInt();
		
		System.out.println("Name:" +name);
		System.out.println("English:" +Emarks);
		System.out.println("Maths:" +Mmarks);
		
		int Total=Emarks +Mmarks;
		System.out.println("Total:" +Total);
		
		float percentage = (Total /2.0f);
		System.out.println("Percentage:" +percentage+ " %");
		
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}else if(percentage>=75) {
			System.out.println("Grade B");
		}else if(percentage>= 50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();	
	}

}
