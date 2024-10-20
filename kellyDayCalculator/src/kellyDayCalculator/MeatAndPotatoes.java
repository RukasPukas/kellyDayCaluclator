package kellyDayCalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class MeatAndPotatoes {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	StringBuilder totalString = new StringBuilder();
	
	
	MeatAndPotatoes(String userEnteredDate, Integer iterationCount, LocalDate enteredDates, DayOfWeek dayOfWeek){
		totalString.append("Start Date: " + userEnteredDate);
		if(dayOfWeek == DayOfWeek.WEDNESDAY) 
		{
			int counter = 0;
			LocalDate nextKellyday = enteredDates;
			System.out.println("Initial: " + userEnteredDate);
			while(counter < iterationCount)
			{
				nextKellyday = nextKellyday.plus(45, ChronoUnit.DAYS); 
				counter = counter+1;
				System.out.println(counter+"."+nextKellyday.format(formatter));
				totalString.append("\n"+counter+"."+nextKellyday.format(formatter));
				if(counter < iterationCount) 	{
					nextKellyday = nextKellyday.plus(39, ChronoUnit.DAYS);
					counter = counter+1;
					System.out.println(counter+"."+nextKellyday.format(formatter));
					totalString.append("\n"+counter+"."+nextKellyday.format(formatter));
				}
				
			}
			new OutputDisplay(totalString);
		}
		else if(dayOfWeek ==DayOfWeek.SATURDAY) 
		{
			int counter =0;
			LocalDate nextKellyday = enteredDates;
			System.out.println("Initial: " + userEnteredDate);
			while(counter <iterationCount)
			{
				nextKellyday = nextKellyday.plus(39, ChronoUnit.DAYS);
				counter = counter+1;
				System.out.println(counter+"."+nextKellyday.format(formatter));
				totalString.append("\n"+counter+"."+nextKellyday.format(formatter));
				if(counter < iterationCount) {
					nextKellyday = nextKellyday.plus(45, ChronoUnit.DAYS);
					counter = counter+1;
					System.out.println(counter+"."+nextKellyday.format(formatter));
					totalString.append("\n"+counter+"."+nextKellyday.format(formatter));
				}
				
			}
			
			new OutputDisplay(totalString);
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "ALARM ALARM ALARM ALARM\n\nSECURITY BREACH DETECTED");
		}
		System.out.println(totalString);
		
	}

}
