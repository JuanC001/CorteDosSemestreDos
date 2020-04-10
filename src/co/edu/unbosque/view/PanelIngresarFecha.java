package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelIngresarFecha extends JPanel{

	public JComboBox iDia;
	public JComboBox iMes;
	public JComboBox iAño;
	
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
		
		String iAños[] = new String[151];
		
		iAños[0] = "Año...";
		
		int año = 2021;
		
		for(int i = 1; i<=150;i++) {
				
			año = año-1;
			iAños[i] = año + "";
				
			
		}
		
		
		
		iDia = new JComboBox<Object>(iDiads);
		iMes = new JComboBox<Object>(iMess);
		iAño = new JComboBox<Object>(iAños);
		
		add(iDia);
		add(iMes);
		add(iAño);
		
	}
	
}
