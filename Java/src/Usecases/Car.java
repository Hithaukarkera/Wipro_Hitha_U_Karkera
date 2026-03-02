package Usecases;


//Use Case: Car class: encapsulate engine status, speed, fuelLevel


public class Car {
	private boolean engine;
	private int speed;
	private int fuelLevel;
	
	public void setEngine(boolean engine) {
		this.engine= engine;
	}
	public void setSpeed(int speed) {
		this.speed= speed;
	}
	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel= fuelLevel;
	}
	
	public boolean getEngine() {
		return engine;
	}
	public int getSpeed() {
		return speed;
	}
	public int getFuelLevel() {
		return fuelLevel;
	}

	public static void main(String[] args) {
		Car c= new Car();
		c.setEngine(true);
		c.setSpeed(50);
		c.setFuelLevel(70);
		
		System.out.println("Engine Status:" +c.getEngine());
		System.out.println("Speed:" +c.getSpeed());
		System.out.println("Feul Level:" +c.getFuelLevel());		
		
	}

}
