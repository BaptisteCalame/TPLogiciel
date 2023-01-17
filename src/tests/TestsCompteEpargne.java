package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.CompteEpargne;

public class TestsCompteEpargne {

	@Test  
	public void testConstructeur() 
	{
		CompteEpargne epargne = new CompteEpargne();
		assertNotNull(epargne);
	}

	@Test  
	public void testDeposerEpargne() 
	{
		CompteEpargne epargne = new CompteEpargne();
		epargne.add_solde(100);
		assertEquals(100, epargne.get_solde(),0);
	}
}
