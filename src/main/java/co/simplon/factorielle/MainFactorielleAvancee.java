package co.simplon.factorielle;
import co.simplon.factorielle.FactorielleUnvailableException;

public class MainFactorielleAvancee {

	public static void main(String[] args) throws RuntimeException {
		Factorielle factorielle = new Factorielle();

		try {

			long fact;

			if (args.length == 1) {
				fact = factorielle.calculer(Long.parseLong(args[0]));

				System.out.println("factoriel de " + args[0] + " = " + fact);

			}

		} catch (IllegalArgumentException exceptionnbrenegatif) {
			System.out.println("J'ai attrapé l'erreur negatif " + exceptionnbrenegatif);

		} catch (FactorielleUnvailableException exeptionmaxvalue) {
			System.out.println("J'ai attrapé l'erreur out of range" + exeptionmaxvalue);
        
		} catch (ArrayIndexOutOfBoundsException erreurNull){
			System.out.println("J'ai attrappé l'erreur null");
		}

	}
}
