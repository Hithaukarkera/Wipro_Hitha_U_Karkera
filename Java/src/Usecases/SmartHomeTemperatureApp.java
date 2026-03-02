package Usecases;

import java.util.*;

public class SmartHomeTemperatureApp {

	public static void main(String[] args) {
		
		//store room temperature(sensor give double)
		
		ArrayList<Double> temperature = new ArrayList<>();
		
		//Autoboxing double-> Double
		
		temperature.add(26.8);
		temperature.add(30.2);
		temperature.add(22.8);
		temperature.add(29.8);
		
		//Analyzer temperatures (Unboxing)
		System.out.println("Temparature Analysis");
		for(Double temp:temperature) {
			if(temp>28.0) {						//Unboxing to Double-> double
				System.out.println("High temparature alert:" +temp +" Celsius");
			}
			else {
				System.out.println("Normal Temparature:"+temp+" Celsius");
			}
		}
		
		//Convert temperature values to string
		System.out.println("\n Temparature Values as String:");
		for(Double temp:temperature) {
			String value= Double.toString(temp);    //wrapper method
			System.out.println(value);
		}
	}

}
