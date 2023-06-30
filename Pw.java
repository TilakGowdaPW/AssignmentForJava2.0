package ai.ineuron.trail;

import java.time.LocalDate;
import java.util.Hashtable;

public class Pw {
	

	public static void main(String[] args) {
		
	        LocalDate date = LocalDate.now();
	        System.out.println(date);
	        int day = date.getDayOfMonth();
	        int month = date.getMonthValue();
	        int year = date.getYear();
	        Integer d=(Integer)day;
	        Integer m=(Integer)month;
	        Integer y=(Integer)year;
	        System.out.println(d+"/"+m+"/"+y);

	    
	}
}
