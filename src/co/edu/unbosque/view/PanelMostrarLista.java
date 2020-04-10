package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelMostrarLista extends JPanel {
	
	public JLabel labdepar;
	public JComboBox<String>depar;
    public JLabel labmuni;
	public JComboBox<String>muni;
	public JLabel labnombrePu;
	public JComboBox<String>puestovot;
	public  JLabel labPu;
	
	public JButton  buscar;
	private JTextArea informacion;
	

	public PanelMostrarLista() {
		
		
		setBorder(new TitledBorder("Mostrar Lista"));
		
		
		  labdepar = new JLabel("Departamento:");
	        add(labdepar);
			
	        depar= new JComboBox<String>();
			depar.setBounds(0, 40,50, 20);
			depar.addItem("Selecciona...");
			add(depar);
			
			
			labmuni = new JLabel("Municipio:");
			add(labmuni);
			
			muni= new JComboBox<String>();
			muni.addItem("Selecciona...");
			muni.setBounds(80, 40,50, 20);
			add(muni);
			
			labPu = new JLabel("Puesto");
			add(labPu);
			
			puestovot= new JComboBox<String>();
			puestovot.setBounds(80, 40,50, 20);
			puestovot.addItem("Selecciona...");
			add(puestovot);
			
			buscar = new JButton("Buscar");
			add(buscar);
			 
			informacion = new JTextArea(19,55);
			add(informacion);
			
			setVisible(false);
		
	}

	public void limpiarMun() {
		
		muni.removeAllItems();
		muni.addItem("Selecciona...");
		
	}
	public void limpiarNombres() {
		
		puestovot.removeAllItems();
		puestovot.addItem("Selecciona...");
	}

	public JLabel getLabdepar() {
		return labdepar;
	}


	public void setLabdepar(JLabel labdepar) {
		this.labdepar = labdepar;
	}


	public JComboBox<String> getDepar() {
		return depar;
	}


	public void setDepar(JComboBox<String> depar) {
		this.depar = depar;
	}


	public JLabel getLabmuni() {
		return labmuni;
	}


	public void setLabmuni(JLabel labmuni) {
		this.labmuni = labmuni;
	}


	public JComboBox<String> getMuni() {
		return muni;
	}


	public void setMuni(JComboBox<String> muni) {
		this.muni = muni;
	}


	public JLabel getLabnombrePu() {
		return labnombrePu;
	}


	public void setLabnombrePu(JLabel labnombrePu) {
		this.labnombrePu = labnombrePu;
	}


	public JComboBox<String> getPuestovot() {
		return puestovot;
	}


	public void setPuestovot(JComboBox<String> puestovot) {
		this.puestovot = puestovot;
	}


	public JLabel getLabPu() {
		return labPu;
	}


	public void setLabPu(JLabel labPu) {
		this.labPu = labPu;
	}


	public JButton getBuscar() {
		return buscar;
	}


	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}


	public JTextArea getInformacion() {
		return informacion;
	}


	public void setInformacion(JTextArea informacion) {
		this.informacion = informacion;
	}


}
