package com.marcos.ficheros_coche.beans;

public class Vehiculo {

	private String matrícula;
	private String marca;
	private String modelo;
	private String color;
	
	
	
	
	
	@Override
	public String toString() {
		return "VHC [" + matrícula + "," + marca + "," + modelo + "," + color+ "]";
	}
	
	
	
	public String getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
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
