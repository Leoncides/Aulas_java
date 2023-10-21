package view;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Notas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaNotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MaskFormatter mascara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNotas frame = new TelaNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaNotas() {
		setForeground(new Color(0, 255, 255));
		try {
			mascara = new MaskFormatter("##.#");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBackground(new Color(0, 0, 255));
		setTitle("Controle de Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 603);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Digite a 1ª  nota:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 44, 118, 22);
		contentPane.add(lblNewLabel);

		JFormattedTextField ftfnota1 = new JFormattedTextField(mascara);
		ftfnota1.setHorizontalAlignment(SwingConstants.CENTER);
		ftfnota1.setColumns(4);
		ftfnota1.setBounds(255, 45, 66, 20);
		contentPane.add(ftfnota1);

		JFormattedTextField ftfnota2 = new JFormattedTextField(mascara);
		ftfnota2.setHorizontalAlignment(SwingConstants.CENTER);
		ftfnota2.setColumns(4);
		ftfnota2.setBounds(255, 78, 66, 20);
		contentPane.add(ftfnota2);

		JLabel lblDigiteA = new JLabel("Digite a 2ª  nota:");
		lblDigiteA.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteA.setBounds(82, 77, 118, 22);
		contentPane.add(lblDigiteA);

		JFormattedTextField ftfnota3 = new JFormattedTextField(mascara);
		ftfnota3.setHorizontalAlignment(SwingConstants.CENTER);
		ftfnota3.setColumns(4);
		ftfnota3.setBounds(255, 110, 66, 20);
		contentPane.add(ftfnota3);

		JLabel lblDigiteA_1 = new JLabel("Digite a 3ª  nota:");
		lblDigiteA_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteA_1.setBounds(82, 109, 118, 22);
		contentPane.add(lblDigiteA_1);

		JFormattedTextField ftfnota4 = new JFormattedTextField(mascara);
		ftfnota4.setHorizontalAlignment(SwingConstants.CENTER);
		ftfnota4.setColumns(4);
		ftfnota4.setBounds(255, 142, 66, 20);
		contentPane.add(ftfnota4);

		JLabel lblDigiteA_2 = new JLabel("Digite a 4ª  nota:");
		lblDigiteA_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteA_2.setBounds(82, 141, 118, 22);
		contentPane.add(lblDigiteA_2);

		JLabel lbresoltado = new JLabel("");
		lbresoltado.setHorizontalAlignment(SwingConstants.CENTER);
		lbresoltado.setBounds(45, 392, 606, 52);
		contentPane.add(lbresoltado);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Notas notas = new Notas();
				try {
					notas.setNota1(Double.parseDouble(ftfnota1.getText()));
					if (notas.verificarNota(notas.getNota1())) {
						notas.setNota2(Double.parseDouble(ftfnota2.getText()));
						if (notas.verificarNota(notas.getNota2())) {
							notas.setNota3(Double.parseDouble(ftfnota3.getText()));
							if (notas.verificarNota(notas.getNota3())) {
								notas.setNota4(Double.parseDouble(ftfnota4.getText()));
								if (notas.verificarNota(notas.getNota4())) {
									ftfnota1.setValue(null);
									ftfnota2.setValue(null);
									ftfnota3.setValue(null);
									ftfnota4.setValue(null);
									lbresoltado.setText(notas.resultado(notas.calculaMedia()));
									if (notas.resultadoCor(notas.calculaMedia())) {
										lbresoltado.setForeground(new Color(0, 0, 255));
									} else {
										lbresoltado.setForeground(new Color(255, 0, 0));
									}
								} else {
									JOptionPane.showMessageDialog(btnNewButton,
											"A nota 4 deve estar entre 00.0 e 10.0");
								}
							} else {
								JOptionPane.showMessageDialog(btnNewButton, "A nota 3 deve estar entre 00.0 e 10.0");
							}
						} else {
							JOptionPane.showMessageDialog(btnNewButton, "A nota 2 deve estar entre 00.0 e 10.0");
						}

					} else {
						JOptionPane.showMessageDialog(btnNewButton, "A nota 1 deve estar entre 00.0 e 10.0");
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(btnNewButton, "Favor digitar todas as notas!");
				}

			}
		});
		btnNewButton.setBounds(285, 238, 89, 23);
		contentPane.add(btnNewButton);
	}
}
