package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Puesto;

public class PersonaDAO {

	private Archivo archivo;
	
	public PersonaDAO(Archivo eArchivo) {
		
		archivo = eArchivo;
		
	}
	
	public void agregarPersona(String cc, String de, String me, String ae, String le, String apll, String nom, String dn, String mn, String an, String ln, char sex, ArrayList<Persona> persona){
		
		System.out.println("Entro AP");
		
		Persona uno = new Persona(cc,de,me,ae,le,apll,nom,dn,mn,an,ln,sex);
		
		if(buscar(cc, persona)==null) {
			
			System.out.println("Agregado");
			
			persona.add(uno);
			archivo.escribirPersona(persona);
			
			JOptionPane.showMessageDialog(null, "Se ha agregado " + uno);
			
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
	
	public void eliminarpsto(Persona persona,ArrayList<Puesto> puestos) {
		
		if(persona.getPst()!=null) {
			
			String ciudad = persona.getPst().getCiudad();
			String depto = persona.getPst().getDept();
			String nombre = persona.getPst().getNombre();
			
			for(int i = 0; i<puestos.size();i++) {
				
				if(puestos.get(i).getDept().equals(depto)) {
					
					if(puestos.get(i).getCiudad().equals(ciudad)) {
						
						if(puestos.get(i).getNombre().equals(nombre)) {
							
							
							
							
							try {
								
								puestos.get(i).getPersona().remove(persona);
								archivo.getPuestosDat().delete();
								archivo.getPuestosDat().createNewFile();
								archivo.escribirPuestos(puestos);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
						}
						
					}
					
				}
				
			}
			
		}else {
			
			System.out.println("la persona no tenia puesto asignado");
			
		}
		
	}
	
	public void agregarPuesto(String dpt, String mun, String nombrepst, String cce, ArrayList<Puesto> puesto, ArrayList<Persona> personas) {
		
		Persona persona = buscar(cce,personas);
		
		eliminarpsto(persona, puesto);
		
		
		
		Puesto puestoAdd = null;
		
		for(int i = 0; i<puesto.size();i++) {
			
			if(puesto.get(i).getDept().equals(dpt)) {
				
				if(puesto.get(i).getCiudad().equals(mun)) {
					
					if(puesto.get(i).getNombre().equals(nombrepst)) {
						
						puesto.get(i).getPersona().add(persona);
						puestoAdd = puesto.get(i);
						
						System.out.println("Se ha agregador la persona al puesto " + puesto.get(i).getNombre());
						
						System.out.println(puesto.get(i));
						
					}
					
				}
				
			}
			
		}
		
		for(int i = 0; i<personas.size();i++) {
			
			if(personas.get(i).getCc().equals(cce)) {
				
				personas.get(i).setPst(puestoAdd);
				
			}
			
		}
		
		archivo.escribirPersona(personas);
		archivo.escribirPuestos(puesto);
		
	}
	
	public boolean  modificarPersona(String cc, String apll, String nom, String dn, String mn, String an, String ln, char sex, ArrayList<Persona> persona) {
		Persona per= buscar(cc, persona);
		if(per!=null){
			
			per.setNombres(nom);
			per.setApellidos(apll);
			
			per.setDia_nacimiento(dn);
			per.setMes_nacimiento(mn);
			per.setAño_nacimiento(an);
			
			per.setLugar_nacimiento(ln);
			per.setSexo(sex);
			
			System.out.println("Persona: " + persona);
			
			archivo.escribirPersona(persona);
			return true;
			
		}else {
			JOptionPane.showMessageDialog(null, "No existe la persona con el numero de cedula"+cc+ "en el sistema");
			
		}
		
		return true ;
		
	}
	
	public void eliminarPersona(String cc, ArrayList<Persona> personas, ArrayList<Puesto> puestos) {
		
		Persona uno = buscar(cc,personas);
		
		if(uno != null) {
			

			try {
				
				personas.remove(uno);
				System.out.println("Se ha eliminado a la personas con el documento " + cc);
				archivo.getPersonaDat().delete();
				archivo.getPersonaDat().createNewFile();
				archivo.escribirPersona(personas);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "No se ha podido eliminar a la persona,\nPor favor revise el documento","Whoops...",0);
			
		}
		
	}
	
	public void verPersona() {
		
	}
	
}
