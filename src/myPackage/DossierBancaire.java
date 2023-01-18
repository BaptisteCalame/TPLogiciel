package myPackage;

public class DossierBancaire {
	
	private CompteCourant m_courant;
	private CompteEpargne m_epargne;
	
	private double solde_total;
	
	//Constructeur
    public DossierBancaire()
    {
    	solde_total = 0; //ceci est un commentaire
    	m_courant = new CompteCourant();
    	m_epargne = new CompteEpargne();
    	//et ceci en est un autre
    	m_courant.solde_compte = 0;
    	m_epargne.solde_compte = 0;
    }

    public void deposer(double somme) {
    	m_courant.add_solde(somme * 0.4);
    	m_epargne.add_solde(somme * 0.6);
    }
    
    public double consulter() {
    	solde_total = m_epargne.solde_compte + m_courant.solde_compte;
    	return solde_total;
    }
    
    public void remunerer() {
    	m_epargne.add_solde(0.032 * m_epargne.solde_compte);
    }
    
    public CompteEpargne get_epargne() {
    	return m_epargne;
    }
    
    public CompteCourant get_courant() {
    	return m_courant;
    }
	
}
