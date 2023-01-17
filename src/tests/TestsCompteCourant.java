package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;

public class TestsCompteCourant {

	@Test  
	public void testConstructeur() 
	{
		CompteCourant courant = new CompteCourant();
		assertNotNull(courant);
	}
	
	@Test  
	public void testDeposerCourant() 
	{
		CompteCourant courant = new CompteCourant();
		courant.add_solde(100);
		assertEquals(100,courant.get_solde(),0);
	}
}
