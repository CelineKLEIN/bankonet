package com.bankonet;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client<E> {
	
	private String nom;
	@ToString (uppercase = true) private String prenom;
	@ToString private String identifiant;
	private Civilite civil;
	
	private Map<String, Compte> comptesMap  = new HashMap<String, Compte>();

	public Client(String nom, String prenom, String identifiant, Civilite civil) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.civil = civil;
	}
	
	public void creerCompte(Compte compte) {
		comptesMap.put(compte.getNumero(), compte);
	}
	
	public void supprimerCompte(Compte compte) {
		comptesMap.remove(compte.getNumero());
	}
	
	public Compte retournerCompte(String numero) throws CompteNonTrouveException {
		Compte compteRecherche = (Compte) comptesMap.get(numero);
	
		if(compteRecherche == null) {
			throw new CompteNonTrouveException();
		}
		
		return compteRecherche;
	}
	
	
	public void supprimerCompte(String numero) throws CompteNonTrouveException {
		Compte compteRecherche = retournerCompte(numero);
		comptesMap.remove(compteRecherche.getNumero());
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public Collection getComptesList() {
		return comptesMap.values();
	}

	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Client[");
		for(Field champ : Client.class.getDeclaredFields()){
			ToString toStringAnn = champ.getAnnotation(ToString.class);
			if(toStringAnn != null){
				sb.append(champ.getName());
				sb.append("=");
				try{
					if(toStringAnn.uppercase()){
						sb.append(champ.get(this).toString().toUpperCase());
					} else{
						sb.append(champ.get(this));		
					}
				}catch(IllegalArgumentException | IllegalAccessException e){
					e.printStackTrace();
				}
				
			}
			sb.append("=");
		}
			return sb.toString();
		}

		
		static {
			
		}


		public Object nbCompte() {
			
			return comptesMap.size();
		}
		
		
		}