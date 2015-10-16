package dao;

public interface DAOFactory {

	CompteDao getCompteDao();
	ClientDao getClientDao();
}
