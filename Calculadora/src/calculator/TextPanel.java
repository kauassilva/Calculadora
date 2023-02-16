package calculator;

import java.awt.*;
import javax.swing.*;

public class TextPanel extends JPanel {
	
	private JTextField displayField;
	
	public TextPanel() {
		setLayout(new BorderLayout());
		
		displayField = new JTextField();
		displayField.setPreferredSize(new Dimension(100,130));
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		displayField.setEditable(false);
		displayField.setBackground(Color.DARK_GRAY);
		displayField.setBorder(null);
		displayField.setForeground(Color.WHITE);
		displayField.setFont(new Font("Roboto",Font.PLAIN,30));
		
		add(displayField);
	}
	
	public JTextField getDisplayField() {
		return displayField;
	}
	
}
