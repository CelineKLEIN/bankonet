package metier;

import java.sql.SQLException;
import java.util.Set;

import com.bankonet.Civilite;
import com.bankonet.Client;

public interface ClientService {

	void creerClient(String nom, String prenom, String login, Civilite civilite, String identifiant) throws SQLException;
		Set<Client> findAll();
		void delete();
	
}
