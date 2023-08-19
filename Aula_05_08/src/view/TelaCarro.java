package view;

import java.util.Scanner;

import model.Carro;

public class TelaCarro {
	
	public static void main(String[] args) {
		//instancia
		Carro carro=new Carro();
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("Digite o id do carro: ");
		carro.setId(leitor.nextInt());
		System.out.println("Digite a placa do carro: ");
		carro.setPlaca(leitor.next());
		System.out.println("digite o valor do carro: ");
		carro.setValor(leitor.nextDouble());
		System.out.println("Digite a cor do carro:");
		carro.setCor(leitor.next());
		System.out.println("Digite o modelo do carro:");
		carro.setModelo(leitor.next());
		System.out.println("Digite o ano do carro:");
		carro.setAno(leitor.nextInt());
		
		System.out.println("Placa "+carro.getPlaca()+
				"\n modelo: "+carro.getModelo()+
				"\n ano: "+carro.getAno()+
				"\n cor: "+carro.getCor()+
				"\n valor R$: "+carro.getValor()+
				"\n Id: "+carro.getId());
		
		
	}

}
