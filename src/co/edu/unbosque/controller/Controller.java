package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Puesto;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.PersonaDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private ArrayList<Persona> personas;
	private ArrayList<Puesto> puestos;
	private PersonaDAO personadao;
	private Archivo archivo;
	
	//Vista
	
	VentanaPrincipal ventana;
	
	public Controller() {
		
		archivo = new Archivo();
		
		puestos = archivo.leer_arhivoCSV();
		
		personas = archivo.leerPersona();
		
		System.out.println(puestos.size());
		
		iniciarVentana();
		
	}
	
	public void resetJpanel() {
		
	}
	
	public void iniciarVentana() {
		
		ventana = new VentanaPrincipal();
		ventana.venIni.registrarCedula.addActionListener(this);
		ventana.venIni.generarReporte.addActionListener(this);
		ventana.venIni.modificarPersona.addActionListener(this);
		ventana.venIni.modificarPuesto.addActionListener(this);
		ventana.venIni.mostrarLista.addActionListener(this);
		ventana.puestoLis.buscar.addActionListener(this);
		
		//Colocar departamentos
		
		jDepartamento();
		
		//puesto, seleccionar
		
		ventana.puesto.getSeleccionar().addActionListener(this);
		ventana.puesto.getTxtcedula().validar.addActionListener(this);
		ventana.puesto.getDepartamento().addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getStateChange()== e.SELECTED) {
					
					ventana.puesto.limpiarMun();
					
					String aux = (String) ventana.puesto.getDepartamento().getSelectedItem();
					
					jMunicipioPuesto(aux);
					
				}	
			}
		});
		ventana.puesto.getMunicipio().addItemListener(new ItemListener() {
			

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange()== e.SELECTED) {
					
					ventana.puesto.limpiarNombres();
					
					String dept = (String) ventana.puesto.getDepartamento().getSelectedItem();
					String mun = (String) ventana.puesto.getMunicipio().getSelectedItem();
					
					jNombrePuesto(dept,mun);
					
					
				}
				
			}
			
			
			
		});
		
		//Mostrar lista puestos
		
		ventana.puestoLis.getDepar().addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getStateChange()== e.SELECTED) {
					
					ventana.puestoLis.limpiarMun();
					
					String aux = (String) ventana.puestoLis.getDepar().getSelectedItem();
					jMunicipioPuesto(aux);	
				}	
			}
		});
		ventana.puestoLis.getMuni().addItemListener(new ItemListener() {
			

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange()== e.SELECTED) {
					
					ventana.puestoLis.limpiarNombres();
					
					String dept = (String) ventana.puestoLis.getDepar().getSelectedItem();
					String mun = (String) ventana.puestoLis.getMuni().getSelectedItem();
					
					jNombrePuesto(dept,mun);
					
					
				}
				
			}
			
			
			
		});

		
	}
	
	public void jDepartamento() {
		
		String dpts = "";
		String aux = "";
		
		for(int i = 0; i<puestos.size();i++) {
			
			aux = puestos.get(i).getDept();
			
			if(!(dpts.equals(aux))) {
				
				ventana.puesto.getDepartamento().addItem(aux);
				ventana.puestoLis.getDepar().addItem(aux);
				
			}
			
			dpts = aux;
			
		}
		
	}
	
	public void jMunicipioPuesto(String dpt) {
		
		String dpts = dpt;
		String mun = "";
		String aux = "";
		
		for(int i = 0; i<puestos.size();i++) {
			
			if(puestos.get(i).getDept().equals(dpts)) {
				
				mun = puestos.get(i).getCiudad();
				
				if(!mun.equals(aux)) {
					
					ventana.puesto.ponerMunicipio(mun);
					ventana.puestoLis.getMuni().addItem(mun);
					
				}
				
				aux = mun;
			
				
			}
			
		}
		
	}
	
	public void jNombrePuesto(String dpt, String cid) {
		
		String depto = dpt;
		String ciudad = cid;
		
		for(int i = 0; i<puestos.size();i++) {
			
			if(puestos.get(i).getDept().equals(depto)) {
				
				if(puestos.get(i).getCiudad().equals(cid)) {
					
					String n = puestos.get(i).getNombre();
					ventana.puesto.getNombrePuesto().addItem(n);
					ventana.puestoLis.getPuestovot().addItem(n);
					
				}
				
			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		// MENU
		
		if(e.getActionCommand().equals("Registrar Cedula")) {
			
			ventana.venMod.setVisible(false);
			ventana.ven.setVisible(false);
			ventana.venReg.setVisible(true);
			ventana.puesto.setVisible(false);
			ventana.puestoLis.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Modificar Persona")) {
			
			ventana.venMod.setVisible(false);
			ventana.ven.setVisible(true);
			ventana.venReg.setVisible(false);
			ventana.puesto.setVisible(false);
			ventana.puestoLis.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Modificar")) {
			
			ventana.venMod.setVisible(true);
			ventana.ven.setVisible(false);
			ventana.venReg.setVisible(false);
			ventana.puesto.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Modificar/Seleccionar Puesto")) {
			
			ventana.puesto.getTxtcedula().iccant.setEnabled(true);
			ventana.venMod.setVisible(false);
			ventana.ven.setVisible(false);
			ventana.venReg.setVisible(false);
			ventana.puesto.setVisible(true);
			ventana.puestoLis.setVisible(false);
			
		}
		
		if(e.getActionCommand().equals("Mostrar Lista")) {
			
			ventana.venMod.setVisible(false);
			ventana.ven.setVisible(false);
			ventana.venReg.setVisible(false);
			ventana.puesto.setVisible(false);
			ventana.puestoLis.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Generar Reporte")) {
			
		}
		
		if(e.getActionCommand().equals("Mostrar Informacion")) {
			
		}
		
		//Boton panel registro
		
		if(e.getActionCommand().equals("Agregar")) {
			
			
			
		}
		
		//Botones panel modificar persona
		
		if(e.getActionCommand().equals("Buscar Persona")) {
			
		}
		
		if(e.getActionCommand().equals("Modificar")) {
			
		}
		
		//Botones panel seleccion puesto
		
		if(e.getActionCommand().equals("Validar")) {
			
		}
		
		if(e.getActionCommand().equals("Seleccionar")) {
			
		}
		
		//botones panel mostrar lista
		
		if(e.getActionCommand().equals("Buscar")) {
			
		}
		
	}

}
