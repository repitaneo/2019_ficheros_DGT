package com.marcos.ficheros_coche.play;

import java.util.ArrayList;

import com.marcos.ficheros_coche.beans.Propietario;
import com.marcos.ficheros_coche.beans.Vehiculo;
import com.marcos.ficheros_coche.file.PropietariosReader;
import com.marcos.ficheros_coche.file.VehiculosReader;

public class Start {

	public static void main(String[] args) {
		
		
		ArrayList<Vehiculo> listaCoches;
		listaCoches = VehiculosReader.getDatos();
		System.out.println(listaCoches);
		
		
		ArrayList<Propietario> listaPersonas;
		listaPersonas = PropietariosReader.getDatos();
		System.out.println(listaPersonas);
		
		
	}

	
}
