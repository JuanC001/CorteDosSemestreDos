package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.FormatoCedulaException;
import co.edu.unbosque.model.FormatoNombreException;
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
		
		personadao = new PersonaDAO(archivo);
		
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
		ventana.venIni.eliminarPersona.addActionListener(this);
		ventana.puestoLis.buscar.addActionListener(this);
		ventana.venReg.Agregar.addActionListener(this);
		
		ventana.ven.getModificar().addActionListener(this);
		ventana.ven.iccant.validar.addActionListener(this);
		
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

	public void checkAgregarPersona() {
		
		boolean completo = true;

		String de = (String) ventana.venReg.txtfechaExpCed.iDia.getSelectedItem();
		String me = (String) ventana.venReg.txtfechaExpCed.iMes.getSelectedItem();
		String ae = (String) ventana.venReg.txtfechaExpCed.iAño.getSelectedItem();
		
		String le = ventana.venReg.txtlugarExpCed.getText();
		
		String dn = (String) ventana.venReg.txtfechaNac.iDia.getSelectedItem();
		String mn = (String) ventana.venReg.txtfechaNac.iMes.getSelectedItem();
		String an = (String) ventana.venReg.txtfechaNac.iAño.getSelectedItem();
		
		String ln = (String) ventana.venReg.txtlugarNac.getText();
		
		String sexo = (String) ventana.venReg.txtsexo.getSelectedItem();
		char sex = sexo.charAt(0);
		
		if(ventana.venReg.txtsexo.getSelectedItem().equals("Seleccione...")) {
			
			completo = false;
			
		}
		
		String cc;
		String nom = ventana.venReg.txtnombres.getText();
		String apll = ventana.venReg.txtapellidos.getText();
		try {
			cc = checkCedulaException(ventana.venReg.txtcedula.getText());
			nom = checknombre(ventana.venReg.txtnombres.getText());
			apll = checknombre(ventana.venReg.txtapellidos.getText());
			
			if(completo == true) {
				personadao.agregarPersona(cc, de, me, ae, le, apll, nom, dn, mn, an, ln, sex, personas);
			}
		
		} catch (FormatoCedulaException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (FormatoNombreException e2) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e2.getMessage());
		}
		
		
		
		System.out.println("Finalizo");
		
	}
	
	public String checknombre(String nombre) throws FormatoNombreException{
		
		String nombre1 = nombre;
		
		if(!(nombre1.matches("[0-9]*"))) {
			
			return nombre1;
			
		}else {
			
			throw new FormatoNombreException("Creo que un nombre o apellido no contiene numeros");
			
		}
		
	}
	
	public String checkCedulaException(String cedula) throws FormatoCedulaException{
		
		String cc = cedula;

		if(cc.length()>5&&!(cc.matches("[A-Za-z]"))&&cc.length()<10) {
			
			return cc;
			
		}else {
			
			throw new FormatoCedulaException("La cedula no es valida");
			
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
		
	if(e.getActionCommand().equals("Eliminar Persona")) {
			
			String aux = JOptionPane.showInputDialog("Ingrese el numero de Cedula para eliminar");
			personadao.eliminarPersona(aux, personas, puestos);
			
		}
		
		if(e.getActionCommand().equals("Modificar Persona")) {
			
			ventana.venMod.setVisible(false);
			ventana.ven.setVisible(true);
			ventana.venReg.setVisible(false);
			ventana.puesto.setVisible(false);
			ventana.puestoLis.setVisible(false);
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
			
			checkAgregarPersona();
			
		}
		
		//Botones panel modificar persona
		
		if(e.getActionCommand().equals("Buscar Persona")) {
			
			System.out.println(ventana.ven.iccant.iccant.getText());
			
			Persona buscar=personadao.buscar(ventana.ven.iccant.iccant.getText(), personas);
			
			if(buscar!=null) {
				
				ventana.ven.iccant.iccant.setEnabled(false);
				
			}
			
			System.out.println(buscar);
				try {
					ventana.ven.getTxtnombres().setText(buscar.getNombres());
					ventana.ven.getTxtapellidos().setText(buscar.getApellidos());
					
					ventana.ven.getTxtlugarNac().setText(buscar.getLugar_nacimiento());
					
				}catch (Exception a){
					JOptionPane.showMessageDialog(null, "Cedula no registrada");
			
				}
			
		}
		
		if(e.getActionCommand().equals("Modificar")) {
			
			boolean check = true;
			
			String cc = ventana.ven.getIccant().iccant.getText();
			
			String apll = ventana.ven.getTxtapellidos().getText();
			String nom = ventana.ven.getTxtnombres().getText();
			
			String dn = (String) ventana.ven.getTxtfechaNac().iDia.getSelectedItem(); 
			String mn = (String) ventana.ven.getTxtfechaNac().iMes.getSelectedItem(); 
			String an = (String) ventana.ven.getTxtfechaNac().iAño.getSelectedItem();
			
			String sexo = (String) ventana.ven.getTxtsexo().getSelectedItem();
			
			if(sexo.equals("Seleccione...")) {
				
				check = false;
				
			}
			
			char sex = sexo.charAt(0);
			
			String ln = ventana.ven.getTxtlugarNac().getText();
			
			if(dn.equals("Dia...")||mn.equals("Mes...")||an.equals("Año...")) {
				
				JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha completa");
				check = false;
				
			}
			
			if(check == true&&ventana.ven.getIccant().iccant.isEnabled()==false) {
				
				personadao.modificarPersona(cc, apll, nom, dn, mn, an, ln, sex, personas);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe dar click a buscar persona. \nTambien debe revisar que esten completos todos los campos");
				
			}
			
			
			
		}
		
		//Botones panel seleccion puesto
		
		if(e.getActionCommand().equals("Validar")) {
			
			String cc = ventana.puesto.getTxtcedula().iccant.getText();
			
			if(personadao.buscar(cc, personas)!=null) {
				
				ventana.puesto.getTxtcedula().iccant.setEnabled(false);
				
			}
			
		}
		
		if(e.getActionCommand().equals("Seleccionar")) {
			
			String cce = ventana.puesto.getTxtcedula().iccant.getText();
			
			String dpt = ventana.puesto.getDepartamento().getSelectedItem().toString();
			String mun = ventana.puesto.getMunicipio().getSelectedItem().toString();
			String nombrepst = ventana.puesto.getNombrePuesto().getSelectedItem().toString();
			
			if(!(dpt.equals("Selecciona..."))||!mun.equals("Selecciona...")||!mun.equals("Selecciona...")) {
				
				personadao.agregarPuesto(dpt, mun, nombrepst, cce, puestos, personas);
				
			}
			
			
		}
		
		//botones panel mostrar lista
		
		if(e.getActionCommand().equals("Buscar")) {
			
		}
		
	}

}
