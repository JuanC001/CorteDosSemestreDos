package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Puesto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Dept;
	private String Ciudad;
	private String nombre;
	private String Direccion;
	
	private ArrayList<Persona> persona;
	
	public Puesto(String dpt, String Cit, String name, String ddr) {
		
		Dept = dpt;
		Ciudad = Cit;
		nombre = name;
		Direccion = ddr;
		
		persona = new ArrayList<Persona>();
		
	}
	
	public ArrayList<Persona> getPersona() {
		return persona;
	}



	public void setPersona(ArrayList<Persona> persona) {
		this.persona = persona;
	}



	public String getDept() {
		return Dept;
	}



	public void setDept(String dept) {
		Dept = dept;
	}



	public String getCiudad() {
		return Ciudad;
	}



	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return Direccion;
	}



	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	@Override
	public String toString() {
		return "\nDepartamento=" + Dept + ", Ciudad=" + Ciudad + ", nombre=" + nombre + ", Direccion=" + Direccion + "";
	}
	
	
	
}
