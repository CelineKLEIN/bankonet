package dao;

import dao.client.ClientDao;
import dao.client.ClientDaoMySQL;
import dao.compte.CompteDao;
import dao.compte.CompteDaoMySQL;

public class DaoFactoryMySQL implements DaoFactory{

	
	@Override
	public CompteDao getCompteDao() {
		// TODO Auto-generated method stub
		return new CompteDaoMySQL();
	}

	@Override
	public ClientDao getClientDao() {
		// TODO Auto-generated method stub
		return new ClientDaoMySQL();
	}

}
