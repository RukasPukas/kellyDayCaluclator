package kellyDayCalculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class OutputDisplay {
    OutputDisplay(StringBuilder totalString) {
        JFrame finalGUI = new JFrame("Kelly Day Calculator");
        JPanel panel = new JPanel();
        
    
        finalGUI.add(panel);
        finalGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        finalGUI.setSize(275, 275);
        finalGUI.setLocationRelativeTo(null);


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.DARK_GRAY);
        
 
        String htmlString = "<html>" + totalString.toString().replace("\n", "<br>") + "</html>";


        JLabel finalDisplay = new JLabel(htmlString);
        finalDisplay.setFont(new Font("MonoScript", Font.PLAIN, 12));
        finalDisplay.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        finalDisplay.setForeground(Color.WHITE);
        finalDisplay.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        
      
        panel.add(finalDisplay);

     
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        finalGUI.add(scrollPane);
        
      
        finalGUI.setVisible(true);
    }
}