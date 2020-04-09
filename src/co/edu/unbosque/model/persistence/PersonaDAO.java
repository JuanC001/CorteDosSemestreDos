package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAO {

	private Archivo archivo;
	
	public PersonaDAO(Archivo eArchivo) {
		
		archivo = eArchivo;
		
	}
	
	public void agregarPersona(String cc, String de, String me, String ae, String le, String apll, String nom, String dn, String mn, String an, String ln, char sex, ArrayList<Persona> persona){
		
		Persona uno = new Persona(cc,de,me,ae,le,apll,nom,dn,mn,an,ln,sex);
		
		if(buscar(cc, persona)!=null) {
			
			persona.add(uno);
			
		}
		
	}
	
	public Persona buscar(String cc, ArrayList<Persona> persona) {
		
		Persona nuevo = null;
		
		for(int i = 0; i<persona.size();i++) {
			
			if(persona.get(i).getCc().equals(cc)) {
				
				nuevo = persona.get(i);
				
			}
			
		}
		
		return nuevo;
		
	}
	
	public void modificarPersona() {
		
	}
	
	public void eliminarPersona() {
		
	}
	
	public void verPersona() {
		
	}
	
	public void agregarPuesto() {
		
	}
	
}
