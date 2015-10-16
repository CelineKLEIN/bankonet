package ihm;

import java.io.IOException;
import java.util.Scanner;

import com.bankonet.Civilite;
import com.bankonet.Client;
import com.bankonet.CompteCourant;

import dao.DaoFactory;
import dao.DaoFactoryFile;
import metier.ClientService;
import metier.ClientServiceImpl;

public class ConsoleApp {
	
	private DaoFactory daoFactory = new DaoFactoryFile();
	private ClientService clientService = new ClientServiceImpl(daoFactory.getClientDao());
	
	

	//affiche l'application conseiller bancaire
	public static void main(String[] args) throws IOException {
		ConsoleApp app = new ConsoleApp();
		app.start();
	}
	
	private void start() {
		Scanner sc = new Scanner(System.in);
		int valueChoose = 0;

		
		
		
		do{
		System.out.println("***** APPLICATION CONSEILLER BANCAIRE *****");
		System.out.println("0. Arr�ter le programme");
		System.out.println("1. Ouvrir un compte courant");
		System.out.println("2. Lister tous les clients");
		System.out.println("Veuillez choisir une action");
		valueChoose =sc.nextInt();
	
	switch(valueChoose){

	case 1:
		System.out.println("Ouvrir un compte courant");
		renseignement();
		break;
		
	case 2:
		System.out.println("Lister tous les clients");
	/*listClient(args);*/
		break;
		
	
	}	
	
	}while (valueChoose !=0);
	
	System.out.println("Arr�t de l'application");
	}
	
	
	private void renseignement() {
		Scanner sc = new Scanner(System.in);
		String nom;
		String prenom;
		String login;

		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Saisie du nom du client");
		nom = sc.nextLine();
		System.out.println("Saisie du pr�nom du client");
		prenom = sc.nextLine();
		System.out.println("Saisie du login du client");
		login = sc.nextLine();
		System.out.println("Civilit� ? (1 si homme, 2 si femme, ...)");
		Integer civ = sc.nextInt();
		
		Civilite civilite = Civilite.MADEMOISELLE;
		if(civ == 1) {
			civilite = Civilite.MONSIEUR;
		}
		
		sb.append(nom.toUpperCase());
		sb.append('_');
		sb.append(prenom.toUpperCase());
		sb.append('_');
		sb.append("COURANT_1");

		
		System.out.println(sb);
		
			
		clientService.creerClient(nom, prenom, login, civilite);
		
		
		
	}

	
}
