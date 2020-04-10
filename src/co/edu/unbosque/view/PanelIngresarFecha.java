package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelIngresarFecha extends JPanel{

	public JComboBox iDia;
	public JComboBox iMes;
	public JComboBox iA�o;
	
	public PanelIngresarFecha() {
		
		setLayout(new GridLayout(1,3));
		
		String iDiads[] = new String[32];
		
		iDiads[0] = "Dia...";
		
		for(int i = 1; i<=31;i++) {
			
			if(i<10) {
				
				iDiads[i] = 0 + "" + i + "";
				
			}else {
				
				iDiads[i] = i + "";
				
			}
			
		}
		
		String iMess[] = new String[13];
		
		iMess[0] = "Mes...";
		
		for(int i = 1; i<=12;i++) {
			
			if(i<10) {
				
				iMess[i] = 0 + "" + i + "";
				
			}else {
				
				iMess[i] = i + "";
				
			}
		}
		
		String iA�os[] = new String[151];
		
		iA�os[0] = "A�o...";
		
		int a�o = 2021;
		
		for(int i = 1; i<=150;i++) {
				
			a�o = a�o-1;
			iA�os[i] = a�o + "";
				
			
		}
		
		
		
		iDia = new JComboBox<Object>(iDiads);
		iMes = new JComboBox<Object>(iMess);
		iA�o = new JComboBox<Object>(iA�os);
		
		add(iDia);
		add(iMes);
		add(iA�o);
		
	}
	
}
