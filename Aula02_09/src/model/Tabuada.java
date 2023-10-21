package model;

public class Tabuada {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int calcular(int i) {
		return this.numero*i;
		
	}
	
	public int[] calcular() {
		int[] resultados=new int [11];
		for(int i =0;i<=10;i++) {
			resultados[i]=this.numero*i;
		}
		return resultados;
	}
	
}
