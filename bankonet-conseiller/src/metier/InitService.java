package metier;

import java.sql.SQLException;

import com.bankonet.Civilite;
import com.bankonet.Client;

import dao.client.ClientDao;

public class InitService {

	private ClientDao clientDao;
	private ClientService clientService;
	
	
	
	public InitService(ClientDao clientDao, ClientService clientService) {
		super();
		this.clientDao = clientDao;
		this.clientService = clientService;
	}



	public void init(){
		
		try {
			clientService.creerClient("Guery", "Sophie", "psswsd",Civilite.MADEMOISELLE, "id11");
			clientService.creerClient("Lingois", "Elodie", "psswsd1",Civilite.MADEMOISELLE, "id22");

			clientService.creerClient("Ducamp", "Mickael", "psswsd2",Civilite.MONSIEUR, "id33");
			
			clientService.creerClient("Froger", "Flavie", "psswsd3",Civilite.MADEMOISELLE, "id44");

			clientService.creerClient("Wasselet", "Clement", "psswsd4",Civilite.MONSIEUR, "id55");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Client cl = new Client();
//		cl.setNom("Guery");
//		cl.setPrenom("Sophie");
//		try {
//			clientDao.save(cl, null);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
	}
}
