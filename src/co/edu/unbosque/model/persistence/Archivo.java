package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Puesto;

public class Archivo {

	private File archivoCSV;
	private File personaDat = new File("data/persona.dat");
	private File puestosDat = new File("data/puestos.dat");
	
	private boolean existe;
	
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public Archivo() {
		
		if(personaDat.exists()&&puestosDat.exists()) {
			
			System.out.println("Los archivos ya existen... cargando");
			existe = true;
			
		}else {
			
			System.out.println("Creando archivos '.dat'");
			
			personaDat.delete();
			puestosDat.delete();
			
		}
		
	}
	
	public ArrayList<Puesto> leer_arhivoCSV() {
		
		ArrayList<Puesto> 
		
	}
	
}
