package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {

	public  JLabel labnombre2;
	private JLabel labapellidos2;
	private JLabel labcedula2;
	private JLabel labfechaExpCed2;
	private JLabel lablugarExpCed2;
	private JLabel labfechaNac2;
	private JLabel lablugarNac2;
	private JLabel labsexo2;

	public PanelDatos() {

		

		setBorder(new TitledBorder("Datos"));

		setLayout(new GridLayout(8, 2));

		labnombre2 = new JLabel("nombre");
		add(labnombre2);

		labapellidos2 = new JLabel("apellidos");
		add(labapellidos2);

		labcedula2 = new JLabel("cedula");
		add(labcedula2);

		labfechaExpCed2 = new JLabel("Fecha expedicion cedula");
		add(labfechaExpCed2);

		lablugarExpCed2 = new JLabel("Lugar Expedicion cedula");
		add(lablugarExpCed2);

		labfechaNac2 = new JLabel("Fecha Nacimiento");
		add(labfechaNac2);

		lablugarNac2 = new JLabel("Lugar Nacimiento");
		add(lablugarNac2);

		labsexo2 = new JLabel("Sexo");
		add(labsexo2);
		
		setVisible(false);

	}

	public JLabel getLabnombre2() {
		return labnombre2;
	}

	public void setLabnombre2(JLabel labnombre2) {
		this.labnombre2 = labnombre2;
	}

	public JLabel getLabapellidos2() {
		return labapellidos2;
	}

	public void setLabapellidos2(JLabel labapellidos2) {
		this.labapellidos2 = labapellidos2;
	}

	public JLabel getLabcedula2() {
		return labcedula2;
	}

	public void setLabcedula2(JLabel labcedula2) {
		this.labcedula2 = labcedula2;
	}

	public JLabel getLabfechaExpCed2() {
		return labfechaExpCed2;
	}

	public void setLabfechaExpCed2(JLabel labfechaExpCed2) {
		this.labfechaExpCed2 = labfechaExpCed2;
	}

	public JLabel getLablugarExpCed2() {
		return lablugarExpCed2;
	}

	public void setLablugarExpCed2(JLabel lablugarExpCed2) {
		this.lablugarExpCed2 = lablugarExpCed2;
	}

	public JLabel getLabfechaNac2() {
		return labfechaNac2;
	}

	public void setLabfechaNac2(JLabel labfechaNac2) {
		this.labfechaNac2 = labfechaNac2;
	}

	public JLabel getLablugarNac2() {
		return lablugarNac2;
	}

	public void setLablugarNac2(JLabel lablugarNac2) {
		this.lablugarNac2 = lablugarNac2;
	}

	public JLabel getLabsexo2() {
		return labsexo2;
	}

	public void setLabsexo2(JLabel labsexo2) {
		this.labsexo2 = labsexo2;
	}

	
	
}
