package dao.compte;

import java.util.List;

import com.bankonet.Compte;

public class CompteDaoJpa implements CompteDao {

	@Override
	public List<Compte> findAll() {
		System.out.println("CompteDaoJpa");
		return null;
	}

	@Override
	public void save(Compte compte1) {
		System.out.println("CompteDaoJpa");
	}

}
