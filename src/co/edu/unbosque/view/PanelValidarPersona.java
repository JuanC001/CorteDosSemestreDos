package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelValidarPersona extends JPanel{

	public JButton validar;
	public JTextField iccant;
	
	public PanelValidarPersona() {
		
		setLayout(new GridLayout(1,2));
		
		iccant = new JTextField();
		validar = new JButton("");
		
		add(iccant);
		add(validar);
		
		setVisible(true);
		
	}
	
}
