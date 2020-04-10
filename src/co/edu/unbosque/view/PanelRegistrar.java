package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelRegistrar extends JPanel {

	private JLabel labnombres;
	public JTextField txtnombres;
	private JLabel labapellidos;
	public JTextField txtapellidos;
	private JLabel labcedula;
	public JTextField txtcedula;
	private JLabel labfechaExpCed;
	public PanelIngresarFecha txtfechaExpCed;
	private JLabel lablugarExpCed;
	public JTextField txtlugarExpCed;
	private JLabel labfechaNac;
	public PanelIngresarFecha txtfechaNac;
	private JLabel lablugarNac;
	public JTextField txtlugarNac;
	private JLabel labsexo;
	public JComboBox txtsexo;
	public JButton Agregar;

	private JButton RegistrarDatos;

	public PanelRegistrar() {
        
		setLayout(new GridLayout(9, 2));

		setBorder(new TitledBorder("Registrar Persona"));

		

		labnombres = new JLabel("Nombres:  ");
		add(labnombres);

		txtnombres = new JTextField();
		add(txtnombres);

		labapellidos = new JLabel("Apellidos:  ");
		add(labapellidos);

		txtapellidos = new JTextField();
		add(txtapellidos);

		labcedula = new JLabel("Cedula:  ");
		add(labcedula);

		txtcedula = new JTextField();
		add(txtcedula);

		labfechaExpCed = new JLabel("Fecha expedición cedula:  ");
		add(labfechaExpCed);

		txtfechaExpCed = new PanelIngresarFecha();
		add(txtfechaExpCed);

		lablugarExpCed = new JLabel("Lugar de expedeción cedula:  ");
		add(lablugarExpCed);

		txtlugarExpCed = new JTextField();
		add(txtlugarExpCed);

		labfechaNac = new JLabel("Fecha Nacimiento:  ");
		add(labfechaNac);

		txtfechaNac = new PanelIngresarFecha();
		add(txtfechaNac);

		lablugarNac = new JLabel("Lugar Nacimiento:  ");
		add(lablugarNac);

		txtlugarNac = new JTextField();
		add(txtlugarNac);

		labsexo = new JLabel("Sexo:  ");
		add(labsexo);

		String []sexo = {"Seleccione...","Femenino","Masculino"};
		
		txtsexo = new JComboBox<Object>(sexo);
		add(txtsexo);

		Agregar = new JButton("Agregar");
		add(Agregar);
	
		setVisible(false);

	}
}
