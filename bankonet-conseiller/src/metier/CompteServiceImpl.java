package metier;

import java.util.Set;

import com.bankonet.Compte;
import com.bankonet.CompteCourant;

import dao.compte.CompteDao;

public class CompteServiceImpl implements CompteService{

	private CompteDao compteDao;

	public CompteServiceImpl(CompteDao compteDao) {
		this.compteDao = compteDao;
	}


	@Override
	public Set<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void creerCompte(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		// TODO Auto-generated method stub
		Compte compte1 = new CompteCourant(numero, intitule, solde, montantDecouvertAutorise);
		// rattacher le code au client
		compteDao.save(compte1);
	}

}
