package myPackage;

public class Compte {
	protected double solde;
	
	public Compte()
	{
		solde = 0;
	}
	
	public double get_solde()
	{
		return solde;
	}
	public void add_solde(double somme)
	{
		solde = solde + somme;
	}
}
