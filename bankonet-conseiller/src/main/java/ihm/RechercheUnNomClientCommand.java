package ihm;

import java.sql.SQLException;
import java.util.Scanner;

import com.bankonet.Client;

import metier.ClientService;

public class RechercheUnNomClientCommand extends IhmCommand{

	private ClientService clientService;
	
	
	public RechercheUnNomClientCommand(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "Recherche d'un client par nom";
	}

	@Override
	void execute() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String nom;
		
		System.out.println("recherchez le nom souhaité");
		nom = sc.nextLine();
		
	
		Client c = clientService.rechercherClientNom(nom);
		System.out.println(c.toString());
		
	}

	
}
