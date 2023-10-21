package model;

public class Notas {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public boolean verificarNota(double nota) {
		if(nota>=0.0&&nota<=10.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public double calculaMedia() {
		return (this.nota1+this.nota2+this.nota3+this.nota4)/4;
	}
	
	public String resultado(double media) {
		if(media>=6.0) {
			return "Média "+media+" está aprovado!";
		}else {
			return "Média "+media+" está reprovado!";
		}
	}
	
	public boolean resultadoCor(double media) {
		if(media>=6.0) {
			return true;
		}else {
			return false;
		}
	}
	

}
