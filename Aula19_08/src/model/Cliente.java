package model;

public class Cliente extends Pessoa{
	
	private long telefone;
	private String endereco_entrega;
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEndereco_entrega() {
		return endereco_entrega;
	}
	public void setEndereco_entrega(String endereco_entrega) {
		this.endereco_entrega = endereco_entrega;
	}
	
	

}
