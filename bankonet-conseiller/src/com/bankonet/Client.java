package com.bankonet;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="client")
public class Client<E> {
	
	@Id
	private String identifiant;
	
	private String nom;
	
	private String prenom;
	//@ToString private String identifiant;
	@Transient private Civilite civil;
	
	private String login;
	
	private String password;
	
	@Transient private Map<String, Compte> comptesMap  = new HashMap<String, Compte>();
	
	public Client(){
		
	}

	public Client(String nom, String prenom, String login, Civilite civil, String identifiant) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.setCivil(civil);
		
		this.password = "azerty";
	}
	
/*	public void creerCompte(Compte compte) {
		comptesMap.put(compte.getNumero(), compte);
	}
	*/
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

	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder("Client[");
//		for(Field champ : Client.class.getDeclaredFields()){
//			ToString toStringAnn = champ.getAnnotation(ToString.class);
//			if(toStringAnn != null){
//				sb.append(champ.getName());
//				sb.append("=");
//				try{
//					if(toStringAnn.uppercase()){
//						sb.append(champ.get(this).toString().toUpperCase());
//					} else{
//						sb.append(champ.get(this));		
//					}
//				}catch(IllegalArgumentException | IllegalAccessException e){
//					e.printStackTrace();
//				}
//				
//			}
//			sb.append("=");
//		}
//			return sb.toString();
//		}

	
	
		
		static {
			
		}


		@Override
		public String toString() {
			return String.format(
					"Client [identifiant=%s, nom=%s, prenom=%s, civil=%s, login=%s, password=%s, comptesMap=%s]",
					identifiant, nom, prenom, civil, login, password, comptesMap);
		}

		public Object nbCompte() {
			
			return comptesMap.size();
		}

		public Civilite getCivil() {
			return civil;
		}

		public void setCivil(Civilite civil) {
			this.civil = civil;
		}
		
		
		}