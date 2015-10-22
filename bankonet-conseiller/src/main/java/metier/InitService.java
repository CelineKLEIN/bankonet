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
			clientService.creerClient("Gu", "Sophie", "psswsd",Civilite.MADEMOISELLE, "id111");
			clientService.creerClient("Lins", "Elodie", "psswsd1",Civilite.MADEMOISELLE, "id222");

			clientService.creerClient("Duc", "Mickael", "psswsd2",Civilite.MONSIEUR, "id333");
			
			clientService.creerClient("Fro", "Flavie", "psswsd3",Civilite.MADEMOISELLE, "id444");

			clientService.creerClient("Wass", "Clement", "psswsd4",Civilite.MONSIEUR, "id555");
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
