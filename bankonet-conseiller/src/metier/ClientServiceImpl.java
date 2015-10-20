package metier;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.bankonet.Civilite;
import com.bankonet.Client;
import com.bankonet.CompteCourant;

import dao.client.ClientDao;
import dao.compte.CompteDao;

public class ClientServiceImpl implements ClientService {
	
	
	private ClientDao clientDao;
	private CompteDao compteDao;

	public ClientServiceImpl(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public Set<Client> findAll() {
		// TODO Auto-generated method stub
		return new HashSet<>(clientDao.findAll());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creerClient(String nom, String prenom, String login, Civilite civilite, String identifiant) throws SQLException {
		// TODO Auto-generated method stub
		Client client1 = new Client(nom, prenom, login, civilite, identifiant);

		// rattacher le code au client
		clientDao.save(client1, null);
	}

}
