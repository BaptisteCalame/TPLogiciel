package myPackage;

public class CompteCourant extends Compte{		// Hérite de la classe compte

	public CompteCourant() {
		super();	// Accède au constructeur de la classe parent (ici Compte)
	}
	
	public void retrait(double somme) throws Exception
	{
		if (this.get_solde() >= somme)
		{
			this.add_solde(-somme);
		}
		else
		{
			throw new Exception("Vous n'avez pas assez d'argent pour retirer une telle somme !");
		}
	}
}
