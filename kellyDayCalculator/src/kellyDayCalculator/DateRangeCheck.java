package kellyDayCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class DateRangeCheck {
	DateRangeCheck(String userEnteredDate, Integer iterationCount){
		
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);
		LocalDate enteredDate = LocalDate.parse(userEnteredDate,formatter);
		
		System.out.println("The current date is: " +formattedDate);
		
		LocalDate oneYearLater = currentDate.plus(1, ChronoUnit.YEARS);
		LocalDate oneYearEarlier = currentDate.minus(1,ChronoUnit.YEARS);
		
		if(enteredDate.isAfter(oneYearLater) || enteredDate.isBefore(oneYearEarlier))
		{
			JOptionPane.showMessageDialog(null, "Please enter a date within a year of the current date.");
			System.out.println("The entered date is greater/lesser than a year from system current date.");
		}
		else
		{
			System.out.println("The entered date is within a year from system current date.");
			new WedSatCheck(userEnteredDate, iterationCount, enteredDate);
		}
		
	}
}
