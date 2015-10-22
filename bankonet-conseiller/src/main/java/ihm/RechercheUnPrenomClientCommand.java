package ihm;

import java.sql.SQLException;
import java.util.Scanner;

import com.bankonet.Client;

import metier.ClientService;

public class RechercheUnPrenomClientCommand extends IhmCommand {

	
	private ClientService clientService;
	
	
	public RechercheUnPrenomClientCommand(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "Recherche d'un client par pr�nom";
	}

	@Override
	void execute() throws SQLException {
	
		Scanner sc = new Scanner(System.in);
		String prenom;
		
		System.out.println("Rechercher le pr�nom souhait�");
		prenom = sc.nextLine();
		
		Client c = clientService.rechercherClientPrenom(prenom);
		System.out.println(c.toString());
		
	}

	
}
