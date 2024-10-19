package kellyDayCalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class kellyDayCalculatorGUI {
	
	kellyDayCalculatorGUI(){
	
		JFrame mainGUI = new JFrame("Kelly Day Calculator");
		JPanel panel = new JPanel();
		mainGUI.add(panel);
		mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGUI.setSize(350,275);
		
		mainGUI.setLocationRelativeTo(null);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.DARK_GRAY);
		
		
		JLabel kellyDayLabel = new JLabel("Kelly Day Calculator");
		kellyDayLabel.setFont(new Font("MonoScript", Font.PLAIN, 32));
		kellyDayLabel.setForeground(Color.WHITE);
		kellyDayLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(kellyDayLabel);
		
		JLabel promptOne = new JLabel("Enter initial Kelly Day Date.");
		promptOne.setFont(new Font("MonoScript", Font.PLAIN, 12));
		promptOne.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		promptOne.setForeground(Color.WHITE);
		promptOne.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		panel.add(promptOne);
		
        JTextArea dateEntry = new JTextArea();
        dateEntry.setPreferredSize(new Dimension(100, 25));  
        dateEntry.setMaximumSize(new Dimension(100, 25));    
        dateEntry.setMinimumSize(new Dimension(100, 25));    
        dateEntry.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        panel.add(dateEntry);
        
        JLabel formatLabel = new JLabel("mm/dd/yyyy");
        formatLabel.setFont(new Font("MonoSCript", Font.PLAIN, 10));
        formatLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        formatLabel.setForeground(Color.WHITE);
        panel.add(formatLabel);
        
        JLabel numberOfKellyDaysPrompt = new JLabel("Number of Kelly days to view:");
        numberOfKellyDaysPrompt.setFont(new Font("MonoScript", Font.PLAIN, 12));
        numberOfKellyDaysPrompt.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        numberOfKellyDaysPrompt.setForeground(Color.WHITE);
        numberOfKellyDaysPrompt.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        panel.add(numberOfKellyDaysPrompt);
        
        JComboBox<Integer> numberSelector = new JComboBox();
        
        for(int i=0; i<51; i++)
        {
        	numberSelector.addItem(i);
        }
        
        numberSelector.setPreferredSize(new Dimension(200,25));
        numberSelector.setMaximumSize(new Dimension(200,25));
        numberSelector.setMinimumSize(new Dimension(200,25));
        
        panel.add(numberSelector);
        
        panel.add(Box.createRigidArea(new Dimension(0, 20))); 
        
        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(200,25));
        submitButton.setMaximumSize(new Dimension(200,25));
        submitButton.setMinimumSize(new Dimension(200,25));
        submitButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userEnteredDate = dateEntry.getText().trim();
				int iterationCount = (Integer) numberSelector.getSelectedItem();
				new DateFormatCheck(userEnteredDate,iterationCount);
				
			}
        	
        });
        panel.add(submitButton);
        
		
		
		panel.setVisible(true);
		mainGUI.setVisible(true);
	}
}
