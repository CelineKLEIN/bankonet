package dao.compte;

import java.util.List;

import com.bankonet.Compte;


public interface CompteDao {

	List<Compte> findAll();

	void save(Compte compte1);
		
//	void save(Compte compte) throws CompteException;
}
