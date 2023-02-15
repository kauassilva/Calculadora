package calculator_view;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	private JTextField displayField;
	private JButton[] buttons;
	
	public Calculator() {
		
		
		// Configuração do JFrame
		ImageIcon symbolIcon = new ImageIcon("src\\icon\\symbol.png");
		setIconImage(symbolIcon.getImage());
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(340,530);
		setLayout(new BorderLayout());
		
		
		// ========== Campo de Texto (JTextField) ==========
		displayField = new JTextField();
		displayField.setEditable(false);
		displayField.setPreferredSize(new Dimension(100,140));
		displayField.setBackground(Color.darkGray);
		displayField.setBorder(null);
		displayField.setForeground(Color.white);
		displayField.setFont(new Font("Roboto",Font.PLAIN, 50));
		
		add(displayField,BorderLayout.NORTH);
		
		
		// ========== Painel de Botões ==========
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4,2,2));
		buttonPanel.setBackground(Color.darkGray);
		
		buttons = new JButton[20];
		
		// Instancia os botões númericos
		for (int i=0; i<10; i++) {
			buttons[i] = new JButton(String.valueOf(i));
		}
		// Instancia os botões matemáticos
		buttons[10] = new JButton("+");
		buttons[11] = new JButton("-");
		buttons[12] = new JButton("x");
		buttons[13] = new JButton("/");
		buttons[14] = new JButton("=");
		buttons[15] = new JButton("C");
		buttons[16] = new JButton("AC");
		buttons[17] = new JButton(".");
		buttons[18] = new JButton("+/-");
		buttons[19] = new JButton("%");
		
		// Formatação padrão dos botões
		for (JButton button : buttons) {
			button.setBorder(null);
			button.setForeground(Color.white);
			button.setBackground(Color.gray);
			button.setFocusable(false);
		}
		// Formatação específica dos botões
		buttons[19].setBackground(new Color(0xa1b6d4));
		buttons[18].setBackground(new Color(0xa1b6d4));
		buttons[16].setBackground(new Color(0xad2b89));
		buttons[14].setBackground(new Color(0x038aa1));
		buttons[13].setBackground(new Color(0xa1b6d4));
		buttons[12].setBackground(new Color(0xa1b6d4));
		buttons[11].setBackground(new Color(0xa1b6d4));
		buttons[10].setBackground(new Color(0xa1b6d4));
		
		// Adiciona os botões de forma organizada
		buttonPanel.add(buttons[16]);
		buttonPanel.add(buttons[18]);
		buttonPanel.add(buttons[19]);
		buttonPanel.add(buttons[13]);
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(buttons[12]);
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(buttons[11]);
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(buttons[10]);
		buttonPanel.add(buttons[0]);
		buttonPanel.add(buttons[17]);
		buttonPanel.add(buttons[15]);
		buttonPanel.add(buttons[14]);
		
		add(buttonPanel,BorderLayout.CENTER);
		setVisible(true);
	}

}
