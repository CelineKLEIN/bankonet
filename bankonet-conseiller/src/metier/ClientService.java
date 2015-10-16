package metier;

import java.util.Set;

import com.bankonet.Civilite;
import com.bankonet.Client;

public interface ClientService {

	void creerClient(String nom, String prenom, String identifiant, Civilite civilite);
		Set<Client> findAll();
		void delete();
	
}
