package kellyDayCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class DateFormatCheck {
	
	DateFormatCheck(String userEnteredDate, Integer iterationCount){
		
		System.out.println("The user entered date is: "+ userEnteredDate);
		System.out.println("The user requested "+ iterationCount +" additional Kelly days to be viewed");

		if (isDateValid(userEnteredDate)) 
		{
		    System.out.println("The date format is valid.");
		    new DateValidationCheck(userEnteredDate, iterationCount);
		}
		else 
		{
		    System.out.println("The date format is invalid. Please enter the date in the format mm/dd/yyyy.");
		    JOptionPane.showMessageDialog(null,"The date format is invalid." );
		   
		}
	}

	private boolean isDateValid(String userEnteredDate) {
	    String datePattern = "^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/\\d{4}$";
	    Pattern pattern = Pattern.compile(datePattern);
	    Matcher matcher = pattern.matcher(userEnteredDate);
	    return matcher.matches();
	}

		
	}


