package com.marcos.ficheros_coche.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.marcos.ficheros_coche.beans.*;


public class VehiculosReader {

	
	private static String fichero = "vehiculos.txt";
	
	
	public static ArrayList<Vehiculo> getDatos() {
		

		// el arrayList que pretendo devolver
        ArrayList<Vehiculo> datos = new ArrayList<Vehiculo>();

        
        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
 
            
            // leo el codigo a ver si existe          
            String linea=ficheroEntrada.readLine();
            // mientras que las lineas existan
            while(linea!=null){

            	Vehiculo vehiculo = new Vehiculo();
            	
            	// escribo en el bean el codigo
            	vehiculo.setMatrícula(linea);

            	// escribo en el bean  el nombre
            	linea=ficheroEntrada.readLine();
            	vehiculo.setMarca(linea);
            	
            	// escribo en el bean  la cantidad
            	linea=ficheroEntrada.readLine();
            	vehiculo.setModelo(linea);
            	
            	
            	// escribo en el bean  el precio
                linea=ficheroEntrada.readLine();
                vehiculo.setColor(linea);
            	
                

                datos.add(vehiculo);
                
                
                // lectura del siguiente artículo
                linea=ficheroEntrada.readLine();
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
        
        // devolvemos el arraylist generado
        return datos;
		
		
	}
	
	
	
	
	
}
