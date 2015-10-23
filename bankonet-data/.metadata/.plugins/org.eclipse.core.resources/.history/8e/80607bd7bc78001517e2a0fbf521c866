package src.main.com.bankonet;

public class CompteEpargne extends Compte{
	
	private double tauxInteret;
	
	public CompteEpargne (String numero, String intitule, double solde, double tauxInteret){
		super(numero, intitule, solde);
		
		this.tauxInteret = tauxInteret;
		
	}
	
	
	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	public String toString() {
		return String.format("CompteEpargne [tauxInteret=%s, getNumero()=%s, getIntitule()=%s, getSolde()=%s]",
				tauxInteret, getNumero(), getIntitule(), getSolde());
	}


}
