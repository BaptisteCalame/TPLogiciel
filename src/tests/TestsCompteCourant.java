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
	
	@Test
	public void testRetrait()
	{
		CompteCourant courant = new CompteCourant();
		courant.add_solde(100);
		try
		{
			courant.retrait(60);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		assertEquals(courant.get_solde(), 40, 0);
	}
	
	@Test
	public void testRetraitVerif()
	{
		CompteCourant courant = new CompteCourant();
		courant.add_solde(40);
		try
		{
			courant.retrait(50);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		assertEquals(courant.get_solde(), 40, 0);
	}	
}
