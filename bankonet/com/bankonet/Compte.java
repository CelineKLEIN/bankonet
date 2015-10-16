package com.bankonet;

public abstract class Compte implements CompteStat {

	private String numero;
	private String intitule;
	private double solde;
	
	public Compte(String numero, String intitule, double solde){
		super();
		this.setNumero(numero);
		this.setIntitule(intitule);
		this.setSolde(solde);
		
		if(solde>=0.0){
			this.solde =solde;
		}else {
			System.out.println("Impossible de créer un compte avec un solde négatif");
			}
			
	}

	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
	public void crediter(double montantcrediter){
		this.solde += montantcrediter;
		
	}
	
	public void debiter(double montantdebiter){
		this.solde -= montantdebiter;
		
	}
	

	public String toString() {
		return String.format("Compte [numero=%s, intitule=%s, solde=%s]", numero,
				intitule, solde);
	
	}
}
