package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Puesto;

public class PersonaDAO {

	private Archivo archivo;
	
	public PersonaDAO(Archivo eArchivo) {
		
		archivo = eArchivo;
		
	}
	
	public void agregarPersona(String cc, String de, String me, String ae, String le, String apll, String nom, String dn, String mn, String an, String ln, char sex, ArrayList<Persona> persona){
		
		Persona uno = new Persona(cc,de,me,ae,le,apll,nom,dn,mn,an,ln,sex);
		
		if(buscar(cc, persona)!=null) {
			
			persona.add(uno);
			archivo.escribirPersona(persona);
			
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
	
	public void agregarPuesto(String dpt, String mun, String nombrepst, String ddr, String cce, ArrayList<Puesto> puesto, ArrayList<Persona> personas) {
		
		Persona persona = buscar(cce,personas);
		
		Puesto puestoAdd = null;
		
		for(int i = 0; i<puesto.size();i++) {
			
			if(puesto.get(i).getDept().equals(dpt)) {
				
				if(puesto.get(i).getCiudad().equals(mun)) {
					
					if(puesto.get(i).getNombre().equals(nombrepst)) {
						
						puesto.get(i).getPersona().add(persona);
						puestoAdd = puesto.get(i);
						
						System.out.println("Se ha agregador la persona al puesto " + puesto.get(i).getNombre());
						
					}
					
				}
				
			}
			
		}
		
		for(int i = 0; i<personas.size();i++) {
			
			if(personas.get(i).getCc().equals(cce)) {
				
				personas.get(i).setPst(puestoAdd);
				
			}
			
		}
		
		
		
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
