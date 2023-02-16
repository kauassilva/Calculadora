package calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	public Calculator() throws Exception {
		
		// ========== Configuração do frame ==========
		ImageIcon symbol = new ImageIcon("src\\icon\\symbol.png");
		setIconImage(symbol.getImage());
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(340,450);
		setLayout(new BorderLayout());
		
		TextPanel textPanel = new TextPanel();
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(new NumberPanel(textPanel.getDisplayField()), BorderLayout.CENTER);
		buttonPanel.add(new OperationPanel(textPanel.getDisplayField()), BorderLayout.EAST);
		
		add(textPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		setVisible(true);
	}

	
	// ========== Executar o sistema  ==========
	public static void main(String[] args) throws Exception {
		new Calculator();
	}

}
