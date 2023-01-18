package myPackage;

public class CompteCourant extends Compte{

	public CompteCourant() {
		super();
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
