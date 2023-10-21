package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Data;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDatas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDatas frame = new TelaDatas();
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
	public TelaDatas() {
		setBackground(new Color(0, 255, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contador de datas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(6, 206, 162));
		lblNewLabel.setBounds(244, 11, 210, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite uma data inicial:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(171, 74, 154, 39);
		contentPane.add(lblNewLabel_1);
		
		JFormattedTextField ftfData1;
		try {
			ftfData1 = new JFormattedTextField(new MaskFormatter("##/##/####"));
			ftfData1.setHorizontalAlignment(SwingConstants.CENTER);
			ftfData1.setToolTipText("30/09/2023");
			ftfData1.setColumns(10);
			ftfData1.setBounds(338, 84, 116, 20);
			contentPane.add(ftfData1);
			
			JLabel lblNewLabel_2 = new JLabel("Digite uma data final:");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(181, 124, 141, 20);
			contentPane.add(lblNewLabel_2);
			
			JFormattedTextField ftfData2 = new JFormattedTextField(new MaskFormatter("##/##/####"));
			ftfData2.setHorizontalAlignment(SwingConstants.CENTER);
			ftfData2.setToolTipText("01/10/2023");
			ftfData2.setColumns(10);
			ftfData2.setBounds(338, 125, 116, 20);
			contentPane.add(ftfData2);
			
			JLabel lbResultado = new JLabel("");
			lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
			lbResultado.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 17));
			lbResultado.setBounds(136, 223, 395, 46);
			contentPane.add(lbResultado);
			
			JButton btCalcular = new JButton("Calcular");
			btCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Data data=new Data();
					data.setData1(ftfData1.getText());
					data.setData2(ftfData2.getText());
					try {
						/*
						long anos=data.retornaAnos(data.transforma(data.getData1()), data.transforma(data.getData2()));
						long dias=data.retornaDias(data.transforma(data.getData1()), data.transforma(data.getData2()));
						lbResultado.setText("Foram "+anos+" anos e "+dias+" dias");
						*/
						lbResultado.setText("Foram "+data.retornaTempoCompleto(data.transforma(data.getData1()),data.transforma(data.getData2())).getYears()+" anos "
								+data.retornaTempoCompleto(data.transforma(data.getData1()),data.transforma(data.getData2())).getMonths()+" meses e "
										+data.retornaTempoCompleto(data.transforma(data.getData1()),data.transforma(data.getData2())).getDays()+" dias ");
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane, "verificar as dats digitadas! Devem ser no formato dd/mm/aaaa");
					}
				}
			});
			btCalcular.setBackground(new Color(0, 255, 255));
			btCalcular.setForeground(new Color(0, 0, 255));
			btCalcular.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
			btCalcular.setBounds(353, 167, 89, 23);
			contentPane.add(btCalcular);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
