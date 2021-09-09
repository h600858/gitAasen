package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class trinnSkatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txtInntekt = showInputDialog("bruttoinntekt: ");
		int inntekt = parseInt(txtInntekt);
		String melding = "din trinnskatt er: ";
		double tr1 = 0.93;
		double tr2 = 2.41;
		double tr3 = 11.52;
		double tr4 = 14.52;
		if (inntekt <= 164100 ) {
			showMessageDialog(null, "du betaler ingen trinnskatt ");
			
		}else if (164101 <= inntekt )  {
			double trinnskatt1 = inntekt - (inntekt * tr1);
			showMessageDialog(null, melding + trinnskatt1);
		}else if (230951 <= inntekt) {
			double trinnskatt2 = inntekt - (inntekt * tr2);
			showMessageDialog(null, melding + trinnskatt2 );
		}else if (580651 <= inntekt) {
			double trinnskatt3 = inntekt - (inntekt * tr3);
			showMessageDialog(null, melding + trinnskatt3);
		}else if (934051 <= inntekt) {
			double trinnskatt4 = inntekt - (inntekt * tr4);
			showMessageDialog(null, melding + trinnskatt4);
		}

	}

}
