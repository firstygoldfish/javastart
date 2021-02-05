import java.time.LocalDate; // import the LocalDate class  
import java.time.LocalTime; // import the LocalTime class
public class DateTime {
   public static void main(String[] args) {
        LocalDate myDate = LocalDate.now(); // Create a date object
	System.out.println("Date is " + myDate); // Display the current date
	LocalTime myTime = LocalTime.now();
	System.out.println("Time is " + myTime); // Display current time
   }
 }
