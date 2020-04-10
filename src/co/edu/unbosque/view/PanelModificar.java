package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelModificar extends JPanel {

	public JLabel ccant;
	public PanelValidarPersona iccant;
	private JLabel labnombres;
	private JTextField txtnombres;
	private JLabel labapellidos;
	private JTextField txtapellidos;
	private JLabel labcedula;
	private JLabel labfechaNac;
	private PanelIngresarFecha txtfechaNac;
	private JLabel lablugarNac;
	private JTextField txtlugarNac;
	private JLabel labsexo;
	private JComboBox txtsexo;
	
	private JButton modificar; 
		
	

	public PanelModificar() {

	

		setBorder(new TitledBorder("Modificar Persona"));

		setLayout(new GridLayout(13, 2));

		ccant = new JLabel("Inserte Cedula a modificar");
		add(ccant);
		
		iccant = new PanelValidarPersona();
		iccant.validar.setText("Buscar Persona");
		add(iccant);
		
		labnombres = new JLabel("Nuevos Nombres:  ");
		add(labnombres);

		txtnombres = new JTextField();
		add(txtnombres);

		labapellidos = new JLabel("Nuevos Apellidos:  ");
		add(labapellidos);

		txtapellidos = new JTextField();
		add(txtapellidos);

		labfechaNac = new JLabel("Nueva Fecha Nacimiento:  ");
		add(labfechaNac);

		txtfechaNac = new PanelIngresarFecha();
		add(txtfechaNac);

		lablugarNac = new JLabel("Nuevo Lugar Nacimiento:  ");
		add(lablugarNac);

		txtlugarNac = new JTextField();
		add(txtlugarNac);

		labsexo = new JLabel("Nuevo Sexo:  ");
		add(labsexo);

		String []sexo = {"Seleccione...","Femenino","Masculino"};
		
		txtsexo = new JComboBox<Object>(sexo);
		add(txtsexo);
		
		modificar = new JButton("Modificar");
		add(modificar);

		setVisible(false);
		
	}



	public JLabel getCcant() {
		return ccant;
	}



	public void setCcant(JLabel ccant) {
		this.ccant = ccant;
	}



	public PanelValidarPersona getIccant() {
		return iccant;
	}



	public void setIccant(PanelValidarPersona iccant) {
		this.iccant = iccant;
	}



	public JLabel getLabnombres() {
		return labnombres;
	}



	public void setLabnombres(JLabel labnombres) {
		this.labnombres = labnombres;
	}



	public JTextField getTxtnombres() {
		return txtnombres;
	}



	public void setTxtnombres(JTextField txtnombres) {
		this.txtnombres = txtnombres;
	}



	public JLabel getLabapellidos() {
		return labapellidos;
	}



	public void setLabapellidos(JLabel labapellidos) {
		this.labapellidos = labapellidos;
	}



	public JTextField getTxtapellidos() {
		return txtapellidos;
	}



	public void setTxtapellidos(JTextField txtapellidos) {
		this.txtapellidos = txtapellidos;
	}



	public JLabel getLabcedula() {
		return labcedula;
	}



	public void setLabcedula(JLabel labcedula) {
		this.labcedula = labcedula;
	}

	public JLabel getLabfechaNac() {
		return labfechaNac;
	}



	public void setLabfechaNac(JLabel labfechaNac) {
		this.labfechaNac = labfechaNac;
	}

	public PanelIngresarFecha getTxtfechaNac() {
		return txtfechaNac;
	}



	public void setTxtfechaNac(PanelIngresarFecha txtfechaNac) {
		this.txtfechaNac = txtfechaNac;
	}



	public JLabel getLablugarNac() {
		return lablugarNac;
	}



	public void setLablugarNac(JLabel lablugarNac) {
		this.lablugarNac = lablugarNac;
	}



	public JTextField getTxtlugarNac() {
		return txtlugarNac;
	}



	public void setTxtlugarNac(JTextField txtlugarNac) {
		this.txtlugarNac = txtlugarNac;
	}



	public JLabel getLabsexo() {
		return labsexo;
	}



	public void setLabsexo(JLabel labsexo) {
		this.labsexo = labsexo;
	}


	public JComboBox getTxtsexo() {
		return txtsexo;
	}



	public void setTxtsexo(JComboBox txtsexo) {
		this.txtsexo = txtsexo;
	}



	public JButton getModificar() {
		return modificar;
	}



	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}
	
	

}
