package com.marcos.ficheros_coche.beans;

public class Propietario {

	private String DNI;
	private String nombre;
	private String fechaNacimiento;
	
	
	
	
	
	@Override
	public String toString() {
		return "PROP [" + DNI + "," + nombre + "," + fechaNacimiento + "]";
	}
	
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
