package ihm;

import java.util.Set;

import com.bankonet.Client;

import metier.ClientService;

public class ListerTousLesClientsCommand extends IhmCommand{
	
	private ClientService clientService;
	
	

	public ListerTousLesClientsCommand(metier.ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "Lister les clients";
	}

	@Override
	void execute() {
		Set<Client> clients = clientService.findAll();
		
		for(Client c : clients) {
		System.out.println(c);
		}		
	}

}
