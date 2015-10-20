package ihm;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.DaoFactory;
import dao.DaoFactoryJpa;
import dao.DaoFactoryMySQL;
import metier.ClientService;
import metier.ClientServiceImpl;
import metier.InitService;

/*import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;*/

/*import java.util.Scanner;

import com.bankonet.Civilite;
import com.bankonet.Client;
import com.bankonet.CompteCourant;
*/
/*import dao.DaoFactory;
import dao.DaoFactoryFile;
import dao.DaoFactoryMySQL;
import metier.ClientService;
import metier.ClientServiceImpl;*/

public class ConsoleApp {
	
	private DaoFactory daoFactory = new DaoFactoryJpa();
	private ClientService clientService = new ClientServiceImpl(daoFactory.getClientDao());
	private InitService initService = new InitService(daoFactory.getClientDao(), clientService);
	

	private List<IhmCommand> commands = Arrays.asList(
			new ExitCommand(), 
			new OuvrirCompteCourantCommand(clientService),
			new ListerTousLesClientsCommand(clientService),
			new InitCommand(initService)
		);
	
	public static void main(String[] args) throws SQLException{
		
		ConsoleApp app = new ConsoleApp();
		app.start();
	}

	public void start() throws SQLException {
	
		do{
			Scanner sc = new Scanner(System.in);
		
		System.out.println("***** APPLICATION CONSEILLER BANCAIRE *****");
		for(IhmCommand command : commands){
			System.out.println(command.getId() + "." + command.getLibelle());
		
		}
		
		System.out.println("Veuillez saisir un chiffre");
		
		int id = sc.nextInt();
		commands.get(id).execute();
		
		}while(true);
	
		
		
//recuperer la saisie
		//trouver la commande
		//appeler la methode execute
	}
	
	
}
	
	/*private DaoFactory daoFactory = new DaoFactoryFile();
	private DaoFactory daoFactory1 = new DaoFactoryMySQL();
	private ClientService clientService = new ClientServiceImpl(daoFactory.getClientDao());
	private ClientService clientService1 = new ClientServiceImpl(daoFactory1.getClientDao());
	

	//affiche l'application conseiller bancaire
	public static void main(String[] args) throws IOException, SQLException {
		ConsoleApp app = new ConsoleApp();
		app.start();
	}
	
	private void start() throws SQLException {
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
		listClient();
		break;
		
	
	}	
	
	}while (valueChoose !=0);
	
	System.out.println("Arr�t de l'application");
	}
	
	
	private void listClient() {
	
		String chaine="";
		String fichier ="clients.properties";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				chaine+=ligne+"\n";
			
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	
		
		System.out.println("identifiant :");
		System.out.println("login :");
		System.out.println("nom :");
		System.out.println("prenom :");
		System.out.println("nombre de comptes courants :");
		System.out.println("nombre de comptes �pargnes :");
		
	}

	private void renseignement() throws SQLException {
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
		
			
		clientService1.creerClient(nom, prenom, login, civilite);
	
		
	}

	
}
*/