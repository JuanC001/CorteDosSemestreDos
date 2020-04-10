package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
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
	private JTextField txtcedula;
	private JLabel labfechaExpCed;
	private JTextField txtfechaExpCed;
	private JLabel lablugarExpCed;
	private JTextField txtlugarExpCed;
	private JLabel labfechaNac;
	private JTextField txtfechaNac;
	private JLabel lablugarNac;
	private JTextField txtlugarNac;
	private JLabel labsexo;
	private JTextField txtsexo;
	
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

		labcedula = new JLabel("Nueva Cedula:  ");
		add(labcedula);

		txtcedula = new JTextField();
		add(txtcedula);

		labfechaExpCed = new JLabel("Nueva Fecha expedición cedula:  ");
		add(labfechaExpCed);

		txtfechaExpCed = new JTextField();
		add(txtfechaExpCed);

		lablugarExpCed = new JLabel("Nuevo Lugar de expedeción cedula:  ");
		add(lablugarExpCed);

		txtlugarExpCed = new JTextField();
		add(txtlugarExpCed);

		labfechaNac = new JLabel("Nueva Fecha Nacimiento:  ");
		add(labfechaNac);

		txtfechaNac = new JTextField();
		add(txtfechaNac);

		lablugarNac = new JLabel("Nuevo Lugar Nacimiento:  ");
		add(lablugarNac);

		txtlugarNac = new JTextField();
		add(txtlugarNac);

		labsexo = new JLabel("Nuevo Sexo:  ");
		add(labsexo);

		txtsexo = new JTextField();
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



	public JTextField getTxtcedula() {
		return txtcedula;
	}



	public void setTxtcedula(JTextField txtcedula) {
		this.txtcedula = txtcedula;
	}



	public JLabel getLabfechaExpCed() {
		return labfechaExpCed;
	}



	public void setLabfechaExpCed(JLabel labfechaExpCed) {
		this.labfechaExpCed = labfechaExpCed;
	}



	public JTextField getTxtfechaExpCed() {
		return txtfechaExpCed;
	}



	public void setTxtfechaExpCed(JTextField txtfechaExpCed) {
		this.txtfechaExpCed = txtfechaExpCed;
	}



	public JLabel getLablugarExpCed() {
		return lablugarExpCed;
	}



	public void setLablugarExpCed(JLabel lablugarExpCed) {
		this.lablugarExpCed = lablugarExpCed;
	}



	public JTextField getTxtlugarExpCed() {
		return txtlugarExpCed;
	}



	public void setTxtlugarExpCed(JTextField txtlugarExpCed) {
		this.txtlugarExpCed = txtlugarExpCed;
	}



	public JLabel getLabfechaNac() {
		return labfechaNac;
	}



	public void setLabfechaNac(JLabel labfechaNac) {
		this.labfechaNac = labfechaNac;
	}



	public JTextField getTxtfechaNac() {
		return txtfechaNac;
	}



	public void setTxtfechaNac(JTextField txtfechaNac) {
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



	public JTextField getTxtsexo() {
		return txtsexo;
	}



	public void setTxtsexo(JTextField txtsexo) {
		this.txtsexo = txtsexo;
	}



	public JButton getModificar() {
		return modificar;
	}



	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}
	
	

}
