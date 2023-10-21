package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Imc;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaImc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaImc frame = new telaImc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public telaImc() throws ParseException {
		setBackground(new Color(0, 255, 64));
		setTitle("Calcula Imc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Calculo do IMC");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 37, 337, 45);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Digite seu Nome:");
		lblNewLabel_1.setBounds(75, 108, 122, 32);
		contentPane.add(lblNewLabel_1);

		JFormattedTextField ftfnome = new JFormattedTextField();
		ftfnome.setHorizontalAlignment(SwingConstants.CENTER);
		ftfnome.setFont(new Font("Leelawadee", Font.PLAIN, 13));
		ftfnome.setBounds(212, 114, 184, 20);
		contentPane.add(ftfnome);

		JFormattedTextField ftfpeso = new JFormattedTextField(new MaskFormatter("###.#"));
		ftfpeso.setHorizontalAlignment(SwingConstants.CENTER);
		ftfpeso.setFont(new Font("Leelawadee", Font.PLAIN, 13));
		ftfpeso.setBounds(212, 178, 184, 20);
		contentPane.add(ftfpeso);

		JLabel lblNewLabel_1_1 = new JLabel("Digite seu peso:");
		lblNewLabel_1_1.setBounds(75, 172, 122, 32);
		contentPane.add(lblNewLabel_1_1);

		JFormattedTextField ftfaltura = new JFormattedTextField(new MaskFormatter("#.##"));
		ftfaltura.setHorizontalAlignment(SwingConstants.CENTER);
		ftfaltura.setFont(new Font("Leelawadee", Font.PLAIN, 13));
		ftfaltura.setBounds(212, 256, 184, 20);
		contentPane.add(ftfaltura);

		JLabel lblNewLabel_1_2 = new JLabel("Digite sua altura:");
		lblNewLabel_1_2.setBounds(75, 250, 122, 32);
		contentPane.add(lblNewLabel_1_2);

		JLabel lbresultado = new JLabel("");
		lbresultado.setBackground(new Color(0, 0, 255));
		lbresultado.setForeground(new Color(0, 0, 255));
		lbresultado.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lbresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lbresultado.setBounds(97, 417, 490, 45);
		contentPane.add(lbresultado);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imc imc = new Imc();
				imc.setNome(ftfnome.getText());
				imc.setAltura(Double.parseDouble(ftfaltura.getText()));
				imc.setPeso(Double.parseDouble(ftfpeso.getText()));
				lbresultado.setText(imc.getNome() + " Imc: " + imc.formata(imc.calculaImc()) + " Clacificado como "
						+ imc.classifica(imc.calculaImc()));
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
		btnNewButton.setBounds(289, 334, 89, 23);
		contentPane.add(btnNewButton);

	}
}
