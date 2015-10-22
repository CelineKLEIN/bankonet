package dao;

import dao.client.ClientDao;
import dao.client.ClientDaoJpa;
import dao.client.ClientDaoMySQL;
import dao.compte.CompteDao;
import dao.compte.CompteDaoJpa;
import dao.compte.CompteDaoMySQL;

public class DaoFactoryJpa implements DaoFactory{

	
	@Override
	public CompteDao getCompteDao() {
		// TODO Auto-generated method stub
		return new CompteDaoJpa();
	}

	@Override
	public ClientDao getClientDao() {
		// TODO Auto-generated method stub
		return new ClientDaoJpa();
	}

}
