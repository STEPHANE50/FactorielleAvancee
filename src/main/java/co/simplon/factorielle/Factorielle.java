package co.simplon.factorielle;

public class Factorielle {
	public Factorielle() {
		super();
	}

	public long calculer(long n) throws FactorielleUnvailableException {

		if (n > 1) {
			long fact = n * calculer(n - 1);
			if (fact > 0) {
				return fact;
			}
			throw new FactorielleUnvailableException();
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1;

	}

}
/*import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = s.nextInt();
       String fact = factorial(n);
       System.out.println("Factorial is " + fact);
   }

   public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
}
*/