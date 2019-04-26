package com.marcos.ficheros_coche.play;

import java.util.ArrayList;

import com.marcos.ficheros_coche.beans.Propietario;
import com.marcos.ficheros_coche.beans.Vehiculo;
import com.marcos.ficheros_coche.file.PropietariosReader;
import com.marcos.ficheros_coche.file.VehiculosReader;
import com.marcos.ficheros_coche.file.VinculacionesReader;

public class Start {

	public static void main(String[] args) {
		
		
		ArrayList<Vehiculo> listaCoches;
		listaCoches = VehiculosReader.getDatos();
		System.out.println(listaCoches+"\n");
		
		
		ArrayList<Propietario> listaPersonas;
		listaPersonas = PropietariosReader.getDatos();
		//System.out.println(listaPersonas);
		
		
		ArrayList<Vehiculo> listaCochesVinculados;
		listaCochesVinculados = VinculacionesReader.getDatos(listaCoches,listaPersonas);
		System.out.println(listaCochesVinculados);
		
		
		
	}

	
}
