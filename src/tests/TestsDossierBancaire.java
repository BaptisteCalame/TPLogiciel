package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	
	@Test  
	public void testConstructeur() 
	{
		DossierBancaire dossier = new DossierBancaire();
		assertNotNull(dossier.get_courant());
		assertNotNull(dossier.get_epargne());
		assertNotNull(dossier);
	}
	
	
	@Test  
	public void testDeposer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(200);
		assertEquals(80, dossier.get_courant().get_solde(), 0);
		assertEquals(120, dossier.get_epargne().get_solde(), 0);
		assertEquals(200,dossier.consulter(),0);
	}

	@Test
	public void testRemunerer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(60, dossier.get_epargne().get_solde(), 0);
		dossier.remunerer();
		assertEquals(61.92, dossier.get_epargne().get_solde(), 0);
		assertEquals(101.92,dossier.consulter(),0);
	}
	
	@Test  
	public void testGetSolde() 
	{
		DossierBancaire dossier = new DossierBancaire();
		try {
			dossier.deposer(150);
			assertEquals(150,dossier.consulter(),0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testRetirer()
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.get_courant().add_solde(100);
		try
		{
			dossier.retirer(60);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		assertEquals(dossier.get_courant().get_solde(), 40, 0);
	}
	
	@Test
	public void testRetraitVerif()
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.get_courant().add_solde(40);
		try
		{
			dossier.retirer(50);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		assertEquals(dossier.get_courant().get_solde(), 40, 0);
	}		
}
