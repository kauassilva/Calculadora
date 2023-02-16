package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener {

	private JTextField displayField;
	
	public NumberPanel(JTextField displayField) {
		this.displayField = displayField;
		
		setBackground(Color.DARK_GRAY);
		setLayout(new GridLayout(4,3,2,2));
		
		// Instacia os botões
		JButton bt9 = new JButton("9");
		JButton bt8 = new JButton("8");
		JButton bt7 = new JButton("7");
		JButton bt6 = new JButton("6");
		JButton bt5 = new JButton("5");
		JButton bt4 = new JButton("4");
		JButton bt3 = new JButton("3");
		JButton bt2 = new JButton("2");
		JButton bt1 = new JButton("1");
		JButton btEmpty1 = new JButton();
		JButton bt0 = new JButton("0");
		JButton btEmpty2 = new JButton();
		
		// Desativa os botões invisíveis
		btEmpty1.setEnabled(false);
		btEmpty2.setEnabled(false);
		
		// Adiciona eventos nos botões
		bt9.addActionListener(this);
		bt8.addActionListener(this);
		bt7.addActionListener(this);
		bt6.addActionListener(this);
		bt5.addActionListener(this);
		bt4.addActionListener(this);
		bt3.addActionListener(this);
		bt2.addActionListener(this);
		bt1.addActionListener(this);
		bt0.addActionListener(this);
		
		
		// ========== Estilização dos botões ==========
		// Retira a borda
		bt9.setBorder(null);
		bt8.setBorder(null);
		bt7.setBorder(null);
		bt6.setBorder(null);
		bt5.setBorder(null);
		bt4.setBorder(null);
		bt3.setBorder(null);
		bt2.setBorder(null);
		bt1.setBorder(null);
		bt0.setBorder(null);
		btEmpty1.setBorder(null);
		btEmpty2.setBorder(null);
		// Define a cor de fundo
		bt9.setBackground(Color.GRAY);
		bt8.setBackground(Color.GRAY);
		bt7.setBackground(Color.GRAY);
		bt6.setBackground(Color.GRAY);
		bt5.setBackground(Color.GRAY);
		bt4.setBackground(Color.GRAY);
		bt3.setBackground(Color.GRAY);
		bt2.setBackground(Color.GRAY);
		bt1.setBackground(Color.GRAY);
		bt0.setBackground(Color.GRAY);
		btEmpty1.setBackground(Color.DARK_GRAY);
		btEmpty2.setBackground(Color.DARK_GRAY);
		// Define a cor da fonte
		bt9.setForeground(Color.WHITE);
		bt8.setForeground(Color.WHITE);
		bt7.setForeground(Color.WHITE);
		bt6.setForeground(Color.WHITE);
		bt5.setForeground(Color.WHITE);
		bt4.setForeground(Color.WHITE);
		bt3.setForeground(Color.WHITE);
		bt2.setForeground(Color.WHITE);
		bt1.setForeground(Color.WHITE);
		bt0.setForeground(Color.WHITE);
		// Define a fonte
		bt9.setFont(new Font("Roboto",Font.BOLD,16));
		bt8.setFont(new Font("Roboto",Font.BOLD,16));
		bt7.setFont(new Font("Roboto",Font.BOLD,16));
		bt6.setFont(new Font("Roboto",Font.BOLD,16));
		bt5.setFont(new Font("Roboto",Font.BOLD,16));
		bt4.setFont(new Font("Roboto",Font.BOLD,16));
		bt3.setFont(new Font("Roboto",Font.BOLD,16));
		bt2.setFont(new Font("Roboto",Font.BOLD,16));
		bt1.setFont(new Font("Roboto",Font.BOLD,16));
		bt0.setFont(new Font("Roboto",Font.BOLD,16));
		
		
		// Adiciona os botões no panel
		add(bt7);
		add(bt8);
		add(bt9);
		add(bt4);
		add(bt5);
		add(bt6);
		add(bt1);
		add(bt2);
		add(bt3);
		add(btEmpty1);
		add(bt0);
		add(btEmpty2);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Limitar quantidade de caracteres
		/*if (displayField.getText().length() == 10) {
			return;
		}*/
		
		JButton btn = (JButton) e.getSource();
		String number = btn.getText();
		displayField.setText(displayField.getText()+number);
	}
}
