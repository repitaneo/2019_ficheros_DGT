package com.marcos.ficheros_coche.beans;

public class Vehiculo {

	private String matr�cula;
	private String marca;
	private String modelo;
	private String color;
	
	
	
	
	
	@Override
	public String toString() {
		return "VHC [" + matr�cula + "," + marca + "," + modelo + "," + color+ "]";
	}
	
	
	
	public String getMatr�cula() {
		return matr�cula;
	}
	public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
