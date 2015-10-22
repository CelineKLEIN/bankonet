package dao;

import dao.client.ClientDao;
import dao.client.ClientDaoFile;
import dao.compte.CompteDao;
import dao.compte.CompteDaoFile;

public class DaoFactoryFile implements DaoFactory{

	@Override
	public CompteDao getCompteDao() {
		// TODO Auto-generated method stub
		return new CompteDaoFile();
	}

	@Override
	public ClientDao getClientDao() {
		// TODO Auto-generated method stub
		return new ClientDaoFile();
	}

}
