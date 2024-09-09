package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			int karakter = parseInt(showInputDialog("Skriv inn poengscore"));
			if (karakter <= 100) {
				if (karakter >= 90) {
					showMessageDialog(null, " Karakter A");
				} else if (karakter >= 80) {
					showMessageDialog(null, " Karakter B");
				} else if (karakter >= 60) {
					showMessageDialog(null, " Karakter C");
				} else if (karakter >= 50) {
					showMessageDialog(null, " Karakter D");
				} else if (karakter >= 40) {
					showMessageDialog(null, " Karakter E");
				} else if (karakter >= 0) {
					showMessageDialog(null, " Karakter F // Stryk");
				} else {
					showMessageDialog(null, " Ugyldig karakter ");
					i -= 1;
				}
			} else if (karakter > 100) {
				showMessageDialog(null, " Ugyldig karakter");
				i -= 1;
			}

		}
	}

}
