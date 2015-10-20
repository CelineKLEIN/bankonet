package ihm;

import java.sql.SQLException;
import java.util.Set;

import javax.persistence.EntityTransaction;

import com.bankonet.Civilite;
import com.bankonet.Client;

import dao.client.ClientDao;
import metier.ClientService;
import metier.InitService;

public class InitCommand extends IhmCommand{

	private InitService initService;

	public InitCommand(InitService initService) {
		super();
		this.initService = initService;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "Initialisation de 5 nouveaux clients";
	}

	@Override
	void execute() throws SQLException {


		initService.init();
//		clientService.creerClient("Guery", "Sophie", "psswsd",Civilite.MADEMOISELLE, "id1");
//
//		clientService.creerClient("Lingois", "Elodie", "psswsd1",Civilite.MADEMOISELLE, "id2");
//
//		clientService.creerClient("Ducamp", "Mickael", "psswsd2",Civilite.MONSIEUR, "id3");
//
//		clientService.creerClient("Froger", "Flavie", "psswsd3",Civilite.MADEMOISELLE, "id4");
//
//		clientService.creerClient("Wasselet", "Clement", "psswsd4",Civilite.MONSIEUR, "id5");

	}


}
