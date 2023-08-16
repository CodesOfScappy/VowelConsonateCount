package de.codeofscappy.counting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Diese Klasse zählt die Anzahl der Vokale und Konsonanten in einem vom
 * Benutzer eingegebenen Text.
 * 
 * @author David Maurin
 * @version 1.0
 */
public class VowelAndConsonateCount {

	String input;
	int totalCountVowels = 0;
	int stringLength;

	// Array zum Zählen der Vokale. 0=a, 1=e, 2=i, 3=o, 4=u
	int[] vowelsCount = { 0, 0, 0, 0, 0 }; // Alle Werte auf 0 setzen

	int totalConsonants;

	/**
	 * Methode zum Einlesen der Benutzereingabe.
	 */
	private void readIn() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			input = br.readLine();
		} catch (IOException e) {
		}
	}

	/**
	 * Zählt die Anzahl der Vokale und Konsonanten im eingegebenen Text.
	 */
	public final void vowelsInside() {
		System.out.println("##############################");
		System.out.println(" Vocal und Konsonanten Zähler ");
		System.out.println("##############################");
		System.out.println("Bitte einen Text eingeben: ");
		readIn();
		stringLength = input.length();

		// Zurücksetzen der Vokalzählung vor jedem Durchlauf
		for (int i = 0; i < vowelsCount.length; i++) {
			vowelsCount[i] = 0;
		}

		// Zähle Vokale
		for (int i = 0; i < stringLength; i++) {
			switch (input.charAt(i)) {
			case 'a':
			case 'A':
				vowelsCount[0]++;
				break;
			case 'e':
			case 'E':
				vowelsCount[1]++;
				break;
			case 'i':
			case 'I':
				vowelsCount[2]++;
				break;
			case 'o':
			case 'O':
				vowelsCount[3]++;
				break;
			case 'u':
			case 'U':
				vowelsCount[4]++;
				break;
			}
		}

		// Zusammenzählen aller Vokale im Array
		for (int i = 0; i < vowelsCount.length; i++) {
			totalCountVowels += vowelsCount[i];
		}

		// Berechnung der Konsonanten im Text
		totalConsonants = stringLength - totalCountVowels;

		// Ausgabe der Ergebnisse
		System.out.println("Länge der Eingabe: " + stringLength);
		System.out.println("Anzahl der Konsonanten: " + totalConsonants);
		System.out.println("Anzahl der Vokale: " + totalCountVowels);
		System.out.println("a = " + vowelsCount[0] + " mal!");
		System.out.println("e = " + vowelsCount[1] + " mal!");
		System.out.println("i = " + vowelsCount[2] + " mal!");
		System.out.println("o = " + vowelsCount[3] + " mal!");
		System.out.println("u = " + vowelsCount[4] + " mal!");
	}

	public static void main(String[] args) {
		VowelAndConsonateCount test = new VowelAndConsonateCount();
		test.vowelsInside();
	}
}
