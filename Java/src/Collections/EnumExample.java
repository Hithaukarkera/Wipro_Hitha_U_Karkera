package Collections;

enum Day{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class EnumExample {

	public static void main(String[] args) {
		//Day today= Day.Monday;
		//System.out.println(today);
		
		Day[] allDays=Day.values();
		 
		System.out.println("All Days of the Week:");
		for(Day d: allDays)
		{
			System.out.println(d);
			Day[] WorkingDays=new Day[5];
			WorkingDays[0]= Day.Monday;
		}
			
			

	}

}
