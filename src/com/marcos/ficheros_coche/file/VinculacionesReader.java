package com.marcos.ficheros_coche.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.marcos.ficheros_coche.beans.Propietario;
import com.marcos.ficheros_coche.beans.Vehiculo;

public class VinculacionesReader {

	

	private static String fichero = "vinculaciones.txt";
	
	
	public static ArrayList<Vehiculo> getDatos(ArrayList<Vehiculo> listaCoches,
								ArrayList<Propietario> listaPersonas) {
		
		ArrayList<Vehiculo> listaVinculada = new ArrayList<Vehiculo>();
		
        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
            
            // leo el codigo a ver si existe          
            String matricula=ficheroEntrada.readLine();
            // mientras que las lineas existan
            while(matricula!=null) {

            	String DNI=ficheroEntrada.readLine();
            	
            	Vehiculo vehiculoBuscado = new Vehiculo();
            	for(Vehiculo v:listaCoches) {
            		
            		if(v.getMatrícula().equals(matricula)) {
            			
            			vehiculoBuscado = v;
            		}
            	}

            	Propietario propietarioBuscado = new Propietario();
            	for(Propietario p:listaPersonas) {
            		
            		if(p.getDNI().equals(DNI)) {
            			
            			propietarioBuscado = p;
            		}
            	}           	
            	
            	vehiculoBuscado.setPropietario(propietarioBuscado);
            	listaVinculada.add(vehiculoBuscado);
            	
            	matricula=ficheroEntrada.readLine();
            }
            	
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return listaVinculada;
        
	}
		
	
	
}
