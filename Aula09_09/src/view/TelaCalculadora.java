package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCalculadora extends JFrame {
	private JPanel contentPane;
	private JLabel titulo,resultado,texto1,texto2;
	private JTextField num1,num2;
	private JButton botao;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
			TelaCalculadora frame = new TelaCalculadora();
			frame.setVisible(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		}

	});

}

	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		titulo=new JLabel("Calculadora");
		titulo.setForeground(new Color(12, 200, 255));
		titulo.setFont(new Font("Stencil", Font.PLAIN, 18));
		contentPane.add(titulo);
		texto1=new JLabel("Digite o Primeiro número:");
		contentPane.add(texto1);
		num1=new JTextField();
		num1.setColumns(4);
		contentPane.add(num1);
		
		
		setContentPane(contentPane);
		
	}
}