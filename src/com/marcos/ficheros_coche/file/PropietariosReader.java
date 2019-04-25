package com.marcos.ficheros_coche.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.marcos.ficheros_coche.beans.Propietario;


public class PropietariosReader {


	private static String fichero = "propietarios.txt";
	
	
	public static ArrayList<Propietario> getDatos() {
		

		// el arrayList que pretendo devolver
        ArrayList<Propietario> datos = new ArrayList<Propietario>();

        
        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
 
            
            // leo el codigo a ver si existe          
            String linea=ficheroEntrada.readLine();
            // mientras que las lineas existan
            while(linea!=null){

            	Propietario propietario = new Propietario();
            	
            	// escribo en el bean el codigo
            	propietario.setDNI(linea);

            	// escribo en el bean  el nombre
            	linea=ficheroEntrada.readLine();
            	propietario.setNombre(linea);
            	
            	// escribo en el bean  la cantidad
            	linea=ficheroEntrada.readLine();
            	propietario.setFechaNacimiento(linea);
            	
                

                datos.add(propietario);
                
                
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
