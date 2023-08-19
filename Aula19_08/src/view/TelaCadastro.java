package view;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Funcionario;

public class TelaCadastro {

	public static void main(String[] args) {
		if(JOptionPane.showConfirmDialog(null, "É um funcionario?","Escolha",JOptionPane.YES_NO_OPTION)==0) {
			Funcionario funcionario=new Funcionario();
			funcionario.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionario:")));
			funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
			funcionario.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o cpf:")));
			funcionario.setNascimento(JOptionPane.showInputDialog("Digite a data de nascimento:"));
			funcionario.setHorast(Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas")));
			funcionario.setValorh(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora R$:").replace(',', '.')));
			
			JOptionPane.showMessageDialog(null, "Id:" + funcionario.getId()+"\n Nome:"+funcionario.getNome()+"\n CPF:"+funcionario.getCpf()+
					"\n Nascimento"+funcionario.getNascimento()+"\n Salario R$"+funcionario.calcularSalario());
		} else {
			Cliente cliente=new Cliente();
			cliente.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente:")));
			cliente.setNome(JOptionPane.showInputDialog("Digito o nome do cliente:"));
			cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o cpf:")));
			cliente.setNascimento(JOptionPane.showInputDialog("Digite a data de nascimento:"));
			
			JOptionPane.showMessageDialog(null,"Id: "+cliente.getId()+ "\n Nome: "+cliente.getNome());
//cliente
		}
	}

}
