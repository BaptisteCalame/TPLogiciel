package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Test  
	public void testDeposer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(200);
		assertEquals(200,dossier.get_solde(),0);
	}
	
	@Test
	public void testRemunerer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		dossier.remunerer();
		assertEquals(101.92,dossier.get_solde(),0);
	}
	
	@Test  
	public void testGetSolde() 
	{
		DossierBancaire dossier = new DossierBancaire();
		try {
			dossier.deposer(150);
			assertEquals(150,dossier.get_solde(),0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}