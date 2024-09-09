package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Skriv inn et tall for n"));

		while (n < 0) {
			n = parseInt(showInputDialog("Ugyldig heltall, skriv inn på nytt"));
		}

		int fakultet = 1;

		for (int i = 1; i <= n; i++) {
			fakultet = fakultet * i;

		}

		showMessageDialog(null, "Fakultet for " + n + " er " + fakultet);

	}
}
