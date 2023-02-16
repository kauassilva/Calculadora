package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OperationPanel extends JPanel implements ActionListener {

	private char op;
	private double value1;
	private double value2;
	
	private JTextField displayField;
	private JButton btAdd;
	private JButton btSub;
	private JButton btMul;
	private JButton btDiv;
	private JButton btClear;
	private JButton btEqual;
	
	public OperationPanel(JTextField displayField) {
		this.displayField = displayField;
		
		setBackground(Color.DARK_GRAY);
		setLayout(new GridLayout(3,2,2,2));
		
		// Instancia os botões
		btAdd = new JButton("+");
		btSub = new JButton("-");
		btMul = new JButton("x");
		btDiv = new JButton("/");
		btClear = new JButton("AC");
		btEqual = new JButton("=");
		
		// Adiciona eventos nos botões
		btAdd.addActionListener(this);
		btSub.addActionListener(this);
		btMul.addActionListener(this);
		btDiv.addActionListener(this);
		btClear.addActionListener(this);
		btEqual.addActionListener(this);
		
		
		// ========== Estilização dos botões ==========
		// Retira a borda
		btAdd.setBorder(null);
		btSub.setBorder(null);
		btMul.setBorder(null);
		btDiv.setBorder(null);
		btClear.setBorder(null);
		btEqual.setBorder(null);
		
		// Define o tamanho preferivel para os botões
		btAdd.setPreferredSize(new Dimension(50,50));

		// remove o foco dos botões
		btAdd.setFocusable(false);
		btSub.setFocusable(false);
		btMul.setFocusable(false);
		btDiv.setFocusable(false);
		btClear.setFocusable(false);
		btEqual.setFocusable(false);
		
		// Define a cor de fundo
		btAdd.setBackground(new Color(0xa1aad3));
		btSub.setBackground(new Color(0xa1aad3));
		btMul.setBackground(new Color(0xa1aad3));
		btDiv.setBackground(new Color(0xa1aad3));
		btClear.setBackground(new Color(0x9d306f));
		btEqual.setBackground(new Color(0x6a6ce1));

		// Define a cor da fonte
		btAdd.setForeground(Color.WHITE);
		btSub.setForeground(Color.WHITE);
		btMul.setForeground(Color.WHITE);
		btDiv.setForeground(Color.WHITE);
		btClear.setForeground(Color.WHITE);
		btEqual.setForeground(Color.WHITE);

		// Define a fonte
		btAdd.setFont(new Font("Roboto",Font.BOLD,16));
		btMul.setFont(new Font("Roboto",Font.BOLD,16));
		btSub.setFont(new Font("Roboto",Font.BOLD,16));
		btDiv.setFont(new Font("Roboto",Font.BOLD,16));
		btClear.setFont(new Font("Roboto",Font.BOLD,16));
		btEqual.setFont(new Font("Roboto",Font.BOLD,16));
		
		
		// Adiciona os botões no panel
		add(btEqual);
		add(btClear);
		add(btDiv);
		add(btMul);
		add(btSub);
		add(btAdd);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Se não houver um número, não faça algo
		if (displayField.getText().isEmpty()) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();
		
		if (btn == btClear) {
			op = '\u0000';
			displayField.setText("");
		} else if (btn == btEqual) {
			value2 = Double.parseDouble(displayField.getText());
			
			double result = 0;
			
			if (op == '+') {
				result = value1 + value2;
			} else if (op == '-') {
				result = value1 - value2;
			} else if (op == 'x') {
				result = value1 * value2;
			} else if (op == '/') {
				result = value1 / value2;
			}
			
			displayField.setText(String.valueOf(result));
			op = '\u0000';
			value1 = result;
			value2 = 0;
		} else {
			op = btn.getText().charAt(0);
			value1 = Double.parseDouble(displayField.getText());
			displayField.setText("");
		}
	}
	
	
}
