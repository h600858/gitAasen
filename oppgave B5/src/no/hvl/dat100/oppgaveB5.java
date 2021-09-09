package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgaveB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txtPoengsum = showInputDialog("Poengsum: ");
		int poengsum = parseInt(txtPoengsum);
		
		if (90 <= poengsum || poengsum >= 100) {
			showMessageDialog(null, "din karakter = A");
		}else if (80 <= poengsum || poengsum >= 89) {
			showMessageDialog(null, "din karakter er B");
		}else if(60 <= poengsum || poengsum >= 79) {
			showMessageDialog(null, "din karakter er C");
		}else if(50 <= poengsum || poengsum >= 59) {
			showMessageDialog(null, "din karakter er D");
		}else if(40 <= poengsum || poengsum >= 49) {
			showMessageDialog(null, "din karakter er E");
		}else if(0 <= poengsum || poengsum >= 39) {
			showMessageDialog(null, "din karakter er F");}
			
			
	}

}
