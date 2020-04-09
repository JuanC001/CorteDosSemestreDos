package co.edu.unbosque.model;

import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private String cc;
	private String dia_expedicion;
	private String mes_expedicion;
	private String a�o_expedicion;
	private String lugar_expedicion;
	private String apellidos;
	private String nombres;
	private String dia_nacimiento;
	private String mes_nacimiento;
	private String a�o_nacimiento;
	private String lugar_nacimiento;
	private char Sexo;
	
	private Puesto Pst;
	
	public Persona(String cc2, String de, String me, String ae, String le, String apl, String nom, String dn, String mn,String an,String ln, char s) {
		
		cc = cc2;
		dia_expedicion = de;
		mes_expedicion = me;
		a�o_expedicion = ae;
		lugar_expedicion = le;
		
		apellidos = apl;
		nombres = nom;
		dia_nacimiento = dn;
		mes_nacimiento = mn;
		a�o_nacimiento = an;
		lugar_nacimiento = ln;
		
		Sexo = s;
		
		Pst = null;
		
	}
	
	public Persona() {
		
		System.out.println("Modificar Persona");
		
	}
	
	@Override
	public String toString() {
		return "Persona [cc=" + cc + ", dia_expedicion=" + dia_expedicion + ", mes_expedicion=" + mes_expedicion
				+ ", a�o_expedicion=" + a�o_expedicion + ", lugar_expedicion=" + lugar_expedicion + ", apellidos="
				+ apellidos + ", nombres=" + nombres + ", dia_nacimiento=" + dia_nacimiento + ", mes_nacimiento="
				+ mes_nacimiento + ", a�o_nacimiento=" + a�o_nacimiento + ", lugar_nacimiento=" + lugar_nacimiento
				+ ", Sexo=" + Sexo + ", Pst=" + Pst + "]";
	}

	public Puesto getPst() {
		return Pst;
	}

	public void setPst(Puesto pst) {
		Pst = pst;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getDia_expedicion() {
		return dia_expedicion;
	}

	public void setDia_expedicion(String dia_expedicion) {
		this.dia_expedicion = dia_expedicion;
	}

	public String getMes_expedicion() {
		return mes_expedicion;
	}

	public void setMes_expedicion(String mes_expedicion) {
		this.mes_expedicion = mes_expedicion;
	}

	public String getA�o_expedicion() {
		return a�o_expedicion;
	}

	public void setA�o_expedicion(String a�o_expedicion) {
		this.a�o_expedicion = a�o_expedicion;
	}

	public String getLugar_expedicion() {
		return lugar_expedicion;
	}

	public void setLugar_expedicion(String lugar_expedicion) {
		this.lugar_expedicion = lugar_expedicion;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDia_nacimiento() {
		return dia_nacimiento;
	}

	public void setDia_nacimiento(String dia_nacimiento) {
		this.dia_nacimiento = dia_nacimiento;
	}

	public String getMes_nacimiento() {
		return mes_nacimiento;
	}

	public void setMes_nacimiento(String mes_nacimiento) {
		this.mes_nacimiento = mes_nacimiento;
	}

	public String getA�o_nacimiento() {
		return a�o_nacimiento;
	}

	public void setA�o_nacimiento(String a�o_nacimiento) {
		this.a�o_nacimiento = a�o_nacimiento;
	}

	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	
	
	
	
	
}
