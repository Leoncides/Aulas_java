package view;

import javax.swing.JOptionPane;

import model.Tabuada;

public class TelaTabuada {

	public static void main(String[] args) {
		
		Tabuada tabuada=new Tabuada();
		boolean teste=true;
		while(teste==true) {
		try {
			teste=false;
			tabuada.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para tabuada: ")));
		}catch (Exception e) {
			teste=true;
			JOptionPane.showMessageDialog(null, "Deveria ser um numero!");
		}/*finally {
			teste=false;
		}*/
	}
		String result="";
		int[] resultado=tabuada.calcular();
		int cont=0;
		for (int i : resultado) {
			result=result+"\n"+tabuada.getNumero()+" x "+cont+" = "+i;
			cont++;
			
		}
	/*	for(int i=0;i<=10;i++) {
			JOptionPane.showMessageDialog(null, tabuada.getNumero()+" x "+i+" = "+tabuada.calcular(i));
			result=result+"\n"+tabuada.getNumero()+" x "+i+" = "+tabuada.calcular(i);
			
		}*/
		JOptionPane.showMessageDialog(null, result);
		/*}catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Deveria ser um número!");*/
		
	}

}
