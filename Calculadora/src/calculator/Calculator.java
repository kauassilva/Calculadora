package calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	ImageIcon icon;
	
	Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setSize(340,530);
		
		icon = new ImageIcon("src\\icon\\symbol.png");
		setIconImage(icon.getImage());
		
		setLayout(null);
		setVisible(true);
	}

}
