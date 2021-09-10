package no.hvl.dat100;

import static java.lang.System.*;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txtN = showInputDialog("velg et tall over 0: ");
		int n = parseInt(txtN);
		int fakultet = 1;
		
		for(int i=1; i<=n; i++) {
			fakultet = fakultet * i;
		}
		
		
			out.println(fakultet);
		}
	}


