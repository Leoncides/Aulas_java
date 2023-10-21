package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data {
	
	private String data1;
	private String data2;
	
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	public LocalDate transforma(String data) {
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate dataf=LocalDate.parse(data,formatador);
		return dataf;
	}
	
	public long retornaAnos(LocalDate d1, LocalDate d2) {
		return ChronoUnit.YEARS.between(d1, d2);
	}
	
	public long retornaDias(LocalDate d1, LocalDate d2) {
		return ChronoUnit.DAYS.between(d1, d2);
	}
	
	public String exibeData(LocalDate data) {
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("d/MM/yyyy");
		return formatador.format(data);
	}
	public Period retornaTempoCompleto(LocalDate d1, LocalDate d2) {
		return Period.between(d1, d2);
	}
	

}