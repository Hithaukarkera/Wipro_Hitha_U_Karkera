package Hitha;

import java.util.Scanner;

public class WeatherAnalyzer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the city name:");
		String city= sc.next();
		
		System.out.println("Enter the Temperature:");
		float temperature=sc.nextFloat();
		
		final int threshold=30;
		
		System.out.println("City:" + city);
		System.out.println("Temperature" +temperature + " C");
		
		if(temperature>threshold) {
			System.out.println("Hot Day");
			
		}
		else {
			System.out.println("Normal Day");
		}
		WeatherRecord w= new WeatherRecord();
		w=null;
		sc.close();
	}
	

}
class WeatherRecord {
}

