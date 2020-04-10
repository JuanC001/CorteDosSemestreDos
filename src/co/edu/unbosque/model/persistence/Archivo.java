package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Persona;
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
			
			try {
				
				personaDat.createNewFile();
				puestosDat.createNewFile();
				
				existe = false;
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	public ArrayList<Puesto> leer_arhivoCSV() {
		
		ArrayList<Puesto> puestos = new ArrayList<Puesto>();
		
		Puesto nuevo = null;
		
		if(existe == false) {
			
			String ln = "";
			archivoCSV = new File("csv/Puestos_de_votacion.csv");
			String puesto[];
			
			try {
				
				FileReader lee = new FileReader(archivoCSV);
				BufferedReader buffer = new BufferedReader(lee);
				
				while(buffer.ready()) {
					
					if(!((ln = buffer.readLine()).equals("\000"))) {
						
						puesto = ln.split(";");
						
						String dpt = puesto[0];
						String cid = puesto[1];
						String nombre = puesto[2];
						String ddr = puesto[3];
						
						nuevo = new Puesto(dpt,cid,nombre,ddr);
						
						puestos.add(nuevo);
					
						
					}
					
				}

				escribirPuestos(puestos);
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		if(existe == true){
			
				try {
					entrada = new ObjectInputStream(new FileInputStream(puestosDat));
					puestos = (ArrayList<Puesto>) entrada.readObject();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		return puestos;
		
	}
	
	public ArrayList<Persona> leerPersona(){
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		if(existe == true && personaDat.length()!=0) {
			
			try {
				
				entrada = new ObjectInputStream(new FileInputStream(personaDat));
				personas = (ArrayList<Persona>) entrada.readObject();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			
			
		}
		
		return personas;

	}
	
	public void escribirPuestos(ArrayList<Puesto> puestos) {
		
		try {
			
			salida = new ObjectOutputStream(new FileOutputStream(puestosDat));
			salida.writeObject(puestos);
			salida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void escribirPersona(ArrayList<Persona> personas) {
		
		try {
			
			salida = new ObjectOutputStream(new FileOutputStream(personaDat));
			salida.writeObject(personas);
			salida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
