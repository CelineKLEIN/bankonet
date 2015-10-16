package dao.client;

import java.util.List;

import com.bankonet.Client;
import com.bankonet.CompteCourant;

public interface ClientDao {

	List<Client> findAll();

	void save(Client client1, CompteCourant compte1);

}
 