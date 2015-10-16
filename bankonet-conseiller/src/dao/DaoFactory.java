package dao;

import dao.client.ClientDao;
import dao.compte.CompteDao;

public interface DaoFactory {

	CompteDao getCompteDao();
	ClientDao getClientDao();

}
