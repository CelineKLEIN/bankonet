package metier;

import java.util.Set;

import com.bankonet.Compte;

public interface CompteService {


	void creerCompte(String numero, String intitule, double solde, Integer IdCompte, String type, double montantDecouvertAutorise);
	Set<Compte> findAll();
	void delete();

}
