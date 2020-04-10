package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelPuesto extends JPanel{

	public JLabel labcedula;
	public PanelValidarPersona txtcedula;
	public JLabel labdepartamento;
	public JComboBox<String>departamento;
	public JLabel labmunicipio;
	public JComboBox<String>municipio;
	public JLabel labnombrePuesto;
	public JComboBox<String>nombrePuesto;
	JLabel labdireccion;
	JLabel txtlabDireccion;
	
	JButton Seleccionar;
	
	public PanelPuesto() {
		
	
		setLayout(new GridLayout(7, 1));
		setBorder(new TitledBorder("Modificar/Seleccionar Puesto"));
		
		labcedula = new JLabel("Cedula:");
		add(labcedula);
		
        txtcedula = new PanelValidarPersona();
        txtcedula.validar.setText("Validar");
        add(txtcedula);
        
        labdepartamento = new JLabel("Departamento:");
        add(labdepartamento);
		
        departamento= new JComboBox<String>();
		departamento.setBounds(80, 40,100, 20);
		departamento.addItem("Selecciona...");
		add(departamento);
		
		
		labmunicipio = new JLabel("Municipio:");
		add(labmunicipio);
		
		municipio= new JComboBox<String>();
		municipio.addItem("Selecciona...");
		municipio.setBounds(80, 40,100, 20);
		add(municipio);
		
		labnombrePuesto = new JLabel("Nombre puesto votacion");
		add(labnombrePuesto);
		
		nombrePuesto= new JComboBox<String>();
		nombrePuesto.setBounds(80, 40,100, 20);
		nombrePuesto.addItem("Selecciona...");
		add(nombrePuesto);
		
		labdireccion = new JLabel("Direccion:");
		add(labdireccion);
		
		txtlabDireccion = new JLabel("");
		add(txtlabDireccion);
		
		Seleccionar = new JButton("Seleccionar");
		add(Seleccionar);
		
		setVisible(false);
	
	}
	
	public void ponerMunicipio(String mun) {
		
		municipio.addItem(mun);
		
	}
	
	public void ponerNombre(String name) {
		
		nombrePuesto.addItem(name);
		
	}
	
	public void limpiarMun() {
		
		municipio.removeAllItems();
		municipio.addItem("Selecciona...");
		
		
	}
	
	public void limpiarNombres() {
			
		nombrePuesto.removeAllItems();
		nombrePuesto.addItem("Selecciona...");
		
	}
	

	public JLabel getLabcedula() {
		return labcedula;
	}

	public void setLabcedula(JLabel labcedula) {
		this.labcedula = labcedula;
	}

	public PanelValidarPersona getTxtcedula() {
		return txtcedula;
	}

	public void setTxtcedula(PanelValidarPersona txtcedula) {
		this.txtcedula = txtcedula;
	}

	public JLabel getLabdepartamento() {
		return labdepartamento;
	}

	public void setLabdepartamento(JLabel labdepartamento) {
		this.labdepartamento = labdepartamento;
	}

	public JComboBox<String> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(JComboBox<String> departamento) {
		this.departamento = departamento;
	}

	public JLabel getLabmunicipio() {
		return labmunicipio;
	}

	public void setLabmunicipio(JLabel labmunicipio) {
		this.labmunicipio = labmunicipio;
	}

	public JComboBox<String> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(JComboBox<String> municipio) {
		this.municipio = municipio;
	}

	public JLabel getLabnombrePuesto() {
		return labnombrePuesto;
	}

	public void setLabnombrePuesto(JLabel labnombrePuesto) {
		this.labnombrePuesto = labnombrePuesto;
	}

	public JComboBox<String> getNombrePuesto() {
		return nombrePuesto;
	}

	public void setNombrePuesto(JComboBox<String> nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}

	public JLabel getLabdireccion() {
		return labdireccion;
	}

	public void setLabdireccion(JLabel labdireccion) {
		this.labdireccion = labdireccion;
	}

	public JLabel getTxtlabDireccion() {
		return txtlabDireccion;
	}

	public void setTxtlabDireccion(JLabel txtlabDireccion) {
		this.txtlabDireccion = txtlabDireccion;
	}

	public JButton getSeleccionar() {
		return Seleccionar;
	}

	public void setSeleccionar(JButton seleccionar) {
		Seleccionar = seleccionar;
	}
	
	
	
	
		
}
