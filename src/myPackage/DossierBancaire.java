package myPackage;

public class DossierBancaire {
	
	private CompteCourant m_courant;
	
	private double solde_tot;
	
	//Constructeur
    public DossierBancaire()
    {
    	solde_tot = 0;
    }

    public void deposer(double somme) {
    	solde_tot = solde_tot + somme;
    	m_courant.add_solde(somme);
    	// m_courant.add_solde(somme * 0.4);
    }
    
    public double consulter() {
    	return solde_tot;
    }
    
    public void remunerer() {
    }
	
}
