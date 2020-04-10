package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {


	public PanelDatos venMod;
	public PanelModificar ven;
	public PanelRegistrar venReg;
	public Panelinicio venIni;
	public PanelPuesto puesto;
	public PanelMostrarLista puestoLis;

	public VentanaPrincipal() {

		setTitle("...: Puesto Votación  :...");
		setSize(1000, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		setLayout(null);

		venIni = new Panelinicio();
		venIni.setLocation(10, 10);
		venIni.setSize(300, 400);
		add(venIni);
		
		venReg = new PanelRegistrar();
		venReg.setLocation(360, 10);
		venReg.setSize(600, 400);
		add(venReg);
		
		ven = new PanelModificar();
		ven.setLocation(360, 10);
		ven.setSize(600, 400);
		add(ven);
		
		venMod = new PanelDatos();
		venMod.setLocation(360, 10);
		venMod.setSize(600, 400);
		add(venMod);
		
		puesto = new PanelPuesto();
		puesto.setLocation(360, 10);
		puesto.setSize(600, 400);
		puesto.setVisible(false);
		add(puesto);
		
		puestoLis = new PanelMostrarLista();
		puestoLis.setLocation(360,10 );
		puestoLis.setSize(600,400);
		add(puestoLis);
		
		setVisible(true);
		
		
	}

}
