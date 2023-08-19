package view;

import javax.swing.JOptionPane;

import model.Aluno;

public class TelaAluno {

	public static void main(String[] args) {
		Aluno aluno=new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		aluno.setMatricola(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricola:")));
		aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1 :").replace(",", ".")));
		aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2 :").replace(",", ".")));
		aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 3 :").replace(",", ".")));
		aluno.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 4 :").replace(",", ".")));
		
		JOptionPane.showMessageDialog(null, 
			"\n Aluno: "+aluno.getNome()+
			"\n Matricola: "+aluno.getMatricola()+
			"\n Media: "+aluno.caucularMedia());
		
		if(aluno.caucularMedia()>=6.0) {
			JOptionPane.showMessageDialog(null, "APROVADO!");
		}else {
			JOptionPane.showMessageDialog(null, "REPROVADO!");
			
		}

	}

}
