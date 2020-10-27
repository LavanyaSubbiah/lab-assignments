/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc method to accept date and print the duration in days, months and years 
 */
import java.time.LocalDate;
import java.time.Period;

public class Duration {

	public static void main(String[] args) {
		LocalDate userDate = LocalDate.of(2025, 05, 8); //user date
		LocalDate currentDate = LocalDate.now();  // Current system date
		Period duration =Period.between(currentDate, userDate); //calculation the duration
		System.out.println("The duration is: "+duration.getYears()+" Years "
		+duration.getMonths()+" Months "+duration.getDays()+" Days");
	}

}
