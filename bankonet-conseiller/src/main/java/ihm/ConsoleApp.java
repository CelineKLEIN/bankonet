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


public class ConsoleApp {
	
	private DaoFactory daoFactory = new DaoFactoryJpa();
	private ClientService clientService = new ClientServiceImpl(daoFactory.getClientDao());
	private InitService initService = new InitService(daoFactory.getClientDao(), clientService);
	

	private List<IhmCommand> commands = Arrays.asList(
			new ExitCommand(), 
			new OuvrirCompteCourantCommand(clientService),
			new ListerTousLesClientsCommand(clientService),
			new InitCommand(initService),
			new RechercheUnNomClientCommand(clientService),
			new RechercheUnPrenomClientCommand(clientService)
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
	
		
		
	}
	
	
}