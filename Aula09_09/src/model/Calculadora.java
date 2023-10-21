package model;

public class Calculadora implements Calcuar {
	
	private double numero;
	private double numero2;
	
	
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	@Override
	public double somar() {
		// TODO Auto-generated method stub
		return this.numero+this.numero2;
	}
	@Override
	public double subitratir() {
		// TODO Auto-generated method stub
		return this.numero-this.numero2;
	}
	@Override
	public double multipilcar() {
		// TODO Auto-generated method stub
		return this.numero*this.numero2;
	}
	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		if (this.numero2==0) {
			return 0;
		}else {
			return this.numero/this.numero2;
		}
	}

}
