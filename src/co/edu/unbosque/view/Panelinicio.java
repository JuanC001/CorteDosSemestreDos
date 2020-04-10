package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panelinicio extends JPanel {

	public JButton registrarCedula;
	public JButton modificarPersona;
	public JButton modificarPuesto;
	public JButton generarReporte;
	public JButton mostrarLista;
	public JButton mostrarInformacion;

	public Panelinicio() {

		setBorder(new TitledBorder("Puesto Votación"));
		setLayout(new GridLayout(6,1));

		
    	
    	registrarCedula = new JButton("Registrar Cedula");
    	add(registrarCedula);
    	
    	modificarPersona= new JButton("Modificar Persona");
    	add(modificarPersona);
    	
    	modificarPuesto = new JButton("Modificar/Seleccionar Puesto");
    	add(modificarPuesto);
    	
    	generarReporte = new JButton("Generar Reporte");
    	add(generarReporte);
    	
    	mostrarLista = new JButton("Mostrar Lista");
    	add(mostrarLista);
    	
    	mostrarInformacion = new JButton("Mostrar Informacion");
    	add(mostrarInformacion);
    	
    	setVisible(true);
    	
    }
	}
