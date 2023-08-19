package model;

public class Funcionario extends Pessoa{
	
	private int horast;
	private double valorh;
	private String setor;
	
	public double calcularSalario() {
		return this.horast*this.valorh;
	}
	
	public int getHorast() {
		return horast;
	}
	public void setHorast(int horast) {
		this.horast = horast;
	}
	public double getValorh() {
		return valorh;
	}
	public void setValorh(double valorh) {
		this.valorh = valorh;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	

}
