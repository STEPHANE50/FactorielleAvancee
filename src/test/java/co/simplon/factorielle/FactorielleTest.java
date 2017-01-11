package co.simplon.factorielle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.*;

public class FactorielleTest {

	private Factorielle factorielle;

	@Before
	public void initialiserUtilitaireFactorielle() {
		// je peux faire ca car mon objet peut être mutualisé pour tous les
		// scénarios de test et n'a donc besoin d'être instancié qu'une fois
		this.factorielle = new Factorielle();
	}

	@Test
	public void factorielle_de_1_doit_renvoyer_1() throws FactorielleUnvailableException {
		// GIVEN
		long entier = 1;
		long resultatAttendu = 1;

		// WHEN
		long resultat = factorielle.calculer(entier);

		// THEN
		assertEquals(resultatAttendu, resultat);
	}

	@Test
	public void factorielle_de_2_doit_renvoyer_2() throws FactorielleUnvailableException {
		long resultat = factorielle.calculer(2);

		assertEquals(2, resultat);
	}

	@Test
	public void factorielle_de_3_doit_renvoyer_6() throws FactorielleUnvailableException {
		// Si le test échoue, je peux afficher un message personnalisé
		assertEquals("Le résultat pour 3 devrait être 6.", 6, factorielle.calculer(3));
	}

	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000() throws FactorielleUnvailableException {
		assertEquals(6402373705728000l, factorielle.calculer(18));
	}

	@Test
	public void factorielle_de_0_doit_renvoyer_1() throws FactorielleUnvailableException {
		// si le test ne passe pas, je n'ai pas de message clair m'indiquant ce
		// qui était attendu et ce qui a été évalué
		assertTrue(factorielle.calculer(0) == 1);
		assertFalse(factorielle.calculer(0) != 1);
	}

	@Ignore("test incomplet")
	@Test
	public void test_en_cours_de_construction() {
		// je verrais ca demain
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorielle_d_un_nombre_negatif_doit_declencher_une_exception() throws FactorielleUnvailableException {
		factorielle.calculer(-1);
	}

	@Test(timeout = 1)
	public void factorielle_18_repete_100_fois_doit_sexecuter_en_moints_de_10_ms() throws FactorielleUnvailableException {
		for (int i = 1; i <= 100; i++)
			factorielle.calculer(18);
	}

	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000_avec_hamcrest() throws FactorielleUnvailableException {
		// GIVEN
		long entier = 18;
		long resultatAttendu = 6402373705728000l;

		// WHEN
		long resultat = factorielle.calculer(entier);

		// THEN
		assertThat(resultat, equalTo(resultatAttendu));
		assertThat(resultat == resultatAttendu, is(true));
	}

	@Test(expected = FactorielleUnvailableException .class)
	public void factorielle_d_un_long_out_of_range_doit_declencher_une_exception() throws FactorielleUnvailableException {
		//long n = 50;
		try {
			factorielle.calculer(50);
			
		} catch  (FactorielleUnvailableException exception){
			assertThat(exception.monException(), equalTo("La factorielle est en erreur"));
			throw exception;
			
			
		}
		
	}

}
