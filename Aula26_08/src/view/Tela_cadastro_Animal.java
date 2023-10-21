package view;

import javax.swing.JOptionPane;

import model.Mamifero;
import model.Peixe;

public class Tela_cadastro_Animal {

	public static void main(String[] args) {
		if(JOptionPane.showConfirmDialog(null, "É um mamifero?","escolha",JOptionPane.YES_NO_OPTION)==0) {
			Mamifero mamifero=new Mamifero();
			mamifero.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Mamifero:")));
			mamifero.setEspecie(JOptionPane.showInputDialog("Digite a espécie:"));
			mamifero.setFamilia(JOptionPane.showInputDialog("Digite a familia:"));
			mamifero.setAlimentacao(JOptionPane.showInputDialog("Digite qual a alimentação:"));
			if(JOptionPane.showConfirmDialog(null,"É noturno","escolha",JOptionPane.YES_NO_OPTION)==0) {
				mamifero.setNoturno(true);
			}else {
				mamifero.setNoturno(false);
			}
			mamifero.setLocal(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do local:")));
			mamifero.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")));
			 JOptionPane.showMessageDialog(null, "Id: "+mamifero.getId()+"\n Especie: "+mamifero.getEspecie()+"\n Familia: "+mamifero.getFamilia()+"\n alimentação: "+mamifero.getAlimentacao()
			 +"\n Alimentação: "+mamifero.getAlimentacao()+"\n Se é noturno: " +(mamifero.isNoturno()?"sim":"Não")+"\n Local: "+mamifero.getLocal()+"\n Quantidade: "+mamifero.getQuantidade());
		}else {
			Peixe peixe=new Peixe();
			peixe.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do peixe:")));
			peixe.setEspecie(JOptionPane.showInputDialog("Digite a espécie:"));
			peixe.setFamilia(JOptionPane.showInputDialog("Digite a familia:"));
			peixe.setAquario(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aquario:")));
			peixe.setInd_agua(Double.parseDouble(JOptionPane.showInputDialog("Digite o indicador da agua:")));
			peixe.setData_limpeza(JOptionPane.showInputDialog("Digite a data da limpeza:"));
			peixe.setElementos(Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos:")));
			
			JOptionPane.showMessageDialog(null, "Id: "+peixe.getId()+"\n Especie: "+peixe.getEspecie()+"\n Familia: "+peixe.getFamilia()+"\n Aquario: "+peixe.getAquario()
			+"\n Ind agua: "+peixe.getInd_agua()+"\n Data da limpeza: "+peixe.getData_limpeza()+"\n Elementos: "+peixe.getElementos());
		}

	}

}
