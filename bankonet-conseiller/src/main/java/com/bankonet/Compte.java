package com.bankonet;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="client")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")



public abstract class Compte implements CompteStat {
	
	//private EntityManagerFactory emf;

	
	private String numero;
	private String intitule;
	private double solde;
	@Transient private String type;
	
	@Id 
	@GeneratedValue
	private Integer IdCompte;
	
	
		
	public Compte() {
		super();
	}

	public Compte(String numero, String intitule, double solde, Integer IdCompte, String type) {
		super();
		this.setType(type);
		this.IdCompte = IdCompte;
		this.numero = numero;
		this.intitule = intitule;
		if(solde >= 0.0) {
			this.solde = solde;
		} else {
			System.out.println("Impossible de cr�er un compte avec un solde n�gatif");
		}
	}
	
	abstract protected double calculerDebitMaximum();
	
	public String getNumero() {
		return numero;
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
	
	public void crediter(double montant) throws CompteException {
		solde = solde + montant;
	}
	
	public void debiter(double montant) throws CompteException {
		double debitMax = calculerDebitMaximum();
		if(montant <= debitMax) {
			solde = solde - montant;
		} else {
			throw new DebitException("Débit maximum atteint : " + debitMax);
		}
	}
	
	public void effectuerVirement(Compte compte, double montant) throws CompteException {
		this.debiter(montant);
		compte.crediter(montant);
	}
	
	@Override
	public String toString() {
		return String.format("CompteCourant [numero=%s, intitule=%s, solde=%s]", numero,
				intitule, solde);
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
/*	
	public void testUneTableParClasse(){
		CompteCourant c = new CompteCourant();
		c.setNumero("1");
		c.setIntitule("CCC");
		c.setSolde(12220);
		c.setMontantDecouvertAutorise(100);
		c.setType("C");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(c);
		
		CompteEpargne e = new CompteEpargne();
		e.setNumero("2");
		e.setIntitule("CEE");
		e.setSolde(150);
		e.setTauxInteret(5);
		e.setType("E");
		em.persist(e);
		
		transaction.commit();
		CompteCourant c1 = (CompteCourant) em.find(AbstractCompte.class, )
		
		
		
	}*/
}