package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {

		int lønn = parseInt(showInputDialog("Skriv årslønnen din"));
		int grense = 208050;

		double trinn1 = (lønn / 100) * 1.7;
		double trinn2 = (lønn / 100) * 4;
		double trinn3 = (lønn / 100) * 13.6;
		double trinn4 = (lønn / 100) * 16.6;
		double trinn5 = (lønn / 100) * 17.6;

		if (lønn > grense) {
			if (lønn <= 292850) {
				int heltall1 = (int) trinn1;
				showMessageDialog(null, "Din trinskatt er på 1.7%. Beløp: " + heltall1 + "kr");
			} else if (lønn <= 670000) {
				int heltall2 = (int) trinn2;
				showMessageDialog(null, "Din trinnskatt er på 4%. Beløp: " + heltall2 + "kr");
			} else if (lønn <= 937900) {
				int heltall3 = (int) trinn3;
				showMessageDialog(null, "Din trinnsaktt er 13.6%. Beløp: " + heltall3 + "kr");
			} else if (lønn <= 1350000) {
				int heltall4 = (int) trinn4;
				showMessageDialog(null, "Din trinnskatt er 16.6%. Beløp: " + heltall4 + "kr ");
			} else if (lønn >= 1350001) {
				int heltall5 = (int) trinn5;
				showMessageDialog(null, "Din trinnskatt er på 17.6%. Beløp: " + heltall5 + "kr");
			}
		}

		else if (lønn < grense) {
			showMessageDialog(null, "Ingen trinnskatt");
		}

	}

}
