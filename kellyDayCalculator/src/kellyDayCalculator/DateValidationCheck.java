package kellyDayCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class DateValidationCheck {

    DateValidationCheck(String userEnteredDate, Integer iterationCount) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try 
        {
            LocalDate parsedDate = LocalDate.parse(userEnteredDate, formatter);
            if (parsedDate.getDayOfMonth() != Integer.parseInt(userEnteredDate.substring(3, 5))) 
            {
            	
                throw new DateTimeParseException("Invalid day of month", userEnteredDate, 0);
                
            }

            System.out.println("The date exists.");
            new DateRangeCheck(userEnteredDate, iterationCount);
        } 
        catch (DateTimeParseException e) 
        {
            System.out.println("The date does not exist");
            JOptionPane.showMessageDialog(null,"The date entered does not exist." );
        }
        
    }
}