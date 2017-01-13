package co.simplon.factorielle;

import co.simplon.factorielle.FactorielleUnvailableException;

public class Main2 {

	public static void main(String[] arguments) {
		try {
			String input = arguments[0];
			long entier = Long.parseLong(input);
			calculerEtAfficherFactorielle(entier);
		} catch (NumberFormatException e) {
			System.out.println("Cas erreur 1");
		} catch (IllegalArgumentException e) {
			System.out.println("Cas erreur 2");
		} catch (FactorielleUnvailableException e) {
			System.out.println("Cas erreur 3 value string");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cas erreur 4 value null");
		}
	}

	private static void calculerEtAfficherFactorielle(long entier) {
		Factorielle factorielleUtil = new Factorielle();
		long resultat = factorielleUtil.calculer(entier);
		System.out.println("Cas nominal, résultat = " + resultat);
	}

}