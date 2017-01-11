package co.simplon.factorielle;

/**
 * Factorielle
 */
public class FactorielleUnvailableException extends Exception {
	
	private static final long serialVersionUID = 1L;


	public FactorielleUnvailableException() {
		super();
	}

	
	public String monException (){
		
			String messageException = "La factorielle est en erreur";
			return messageException;

	}
}

