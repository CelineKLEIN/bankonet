package dao.client;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bankonet.Client;
import com.bankonet.CompteCourant;

public class ClientDaoJpa implements ClientDao {
	
	private EntityManagerFactory emf;
	
	

	public ClientDaoJpa() {
		super();
		emf = Persistence.createEntityManagerFactory("bankonet-conseiller");
	}

	@Override
	public List<Client> findAll() {
		EntityManager em = emf.createEntityManager();
		List<Client> resultList = em.createQuery("select h from Client h", Client.class).getResultList();
		em.close();
		return resultList;
	}

	@Override
	public void save(Client client1, CompteCourant compte1) throws SQLException {
		//System.out.println("ClientDaoJpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(client1);
		et.commit();
		em.close();
	}

}
