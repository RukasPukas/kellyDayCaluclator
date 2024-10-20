package kellyDayCalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;


import javax.swing.JOptionPane;

public class WedSatCheck {

	WedSatCheck(String userEnteredDate, Integer iterationCount, LocalDate enteredDates){
		
		
		 DayOfWeek dayOfWeek = enteredDates.getDayOfWeek();
		 System.out.println(dayOfWeek);
		 
		 if(dayOfWeek == DayOfWeek.WEDNESDAY ||dayOfWeek == DayOfWeek.SATURDAY) {
			 System.out.println("Date entered is a " + dayOfWeek);
			 new MeatAndPotatoes(userEnteredDate, iterationCount, enteredDates, dayOfWeek);
		 }
		 else
		 {
			 System.out.println("Date entered is not a Wednesday or Saturday.");
			 JOptionPane.showMessageDialog(null, "This program is only designed to handle Kelly days on rotating WEDNESDAY or SATURDAY entries.\n\n Please enter a date that falls on a WEDNESDAY or SATURDAY");
		 }
	}
	
	
}
