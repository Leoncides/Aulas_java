package model;

import java.text.DecimalFormat;

public class Imc {

	private String nome;
	private double altura;
	private double peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calculaImc() {

		return this.peso / Math.pow(this.altura, 2);
	}
	
	public String formata(double imc) {
		
		DecimalFormat df=new DecimalFormat("0.00");
		return df.format(imc);
	}

	public String classifica(double imc) {
		
		if (imc<18.5){
			return "Baixo peso!";
		}else if (imc >= 18.5 && imc<=24.9) {
			return "Peso normal!";
		}else if (imc >= 25 && imc<=29.9) {
			return "Sobrepeso!";
		}else if (imc >= 30 && imc<=34.9) {
			return "Obesidade grau I!";
		}else if (imc >= 35 && imc<=39.9) {
			return "Obesidade grau II!";
		}else {
			return "Obesidade grau III!";
		}
	}

}
