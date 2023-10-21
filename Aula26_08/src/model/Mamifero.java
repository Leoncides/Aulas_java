package model;

public class Mamifero extends Animal{
	
	private String alimentacao;
	private boolean noturno;
	private int local;
	private int quantidade;
	
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public boolean isNoturno() {
		return noturno;
	}
	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		this.local = local;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}
