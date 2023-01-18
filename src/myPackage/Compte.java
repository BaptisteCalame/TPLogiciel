package myPackage;

public class Compte {
	protected double solde_compte;
	
	public Compte()
	{
		solde_compte = 0;
	}
	
	public double get_solde()
	{
		return solde_compte;
	}
	public void add_solde(double somme)
	{
		solde_compte = solde_compte + somme;
	}
}
