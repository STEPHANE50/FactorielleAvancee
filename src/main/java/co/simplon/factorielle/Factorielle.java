package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle {
	public Factorielle() {
		super();
	}

	public long calculer(long n) {

		if (n > 1) {
			long fact = n * calculer(n - 1);
			if (fact > 0) {
				return fact;
			}
			throw new UnsupportedOperationException();
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1;

	}

}
