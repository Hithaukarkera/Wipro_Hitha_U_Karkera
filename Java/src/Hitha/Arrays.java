package Hitha;

public class Arrays {

	public static void main(String[] args) {
		int[] marks= {50,40,60,80};
		int total=0;
		
		for(int i=0;i< marks.length; i++) {
			total+= marks[i];
		}
		System.out.println("Total marks:"+total);
	}

}
