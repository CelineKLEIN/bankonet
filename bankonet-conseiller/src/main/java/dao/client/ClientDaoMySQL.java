package dao.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bankonet.Client;
import com.bankonet.CompteCourant;


public class ClientDaoMySQL implements ClientDao{

	private EntityManagerFactory emf;
	
	

	public ClientDaoMySQL() {
		super();
		emf = Persistence.createEntityManagerFactory("bankonet-conseiller");
	}
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Client client1, CompteCourant compte1) throws SQLException {
		// TODO Auto-generated method stub
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//DriverManager.registerDriver(new Driver());
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankonet","root","");
				
				Statement statement = connection.createStatement();
				
				// Supprimer tous les clients

				int nbClientInsere = statement.executeUpdate("INSERT INTO Client(Nom, Prenom, Identifiant) VALUES('"+client1.getNom()+"','"+client1.getPrenom()+"', "+client1.getIdentifiant()+")");

				System.out.println(nbClientInsere + " client ins�r�");
	
			
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

	
			
	}
	/*@Override
	public void rechercher(Client client1) {
		// TODO Auto-generated method stub
		
	}

*/
	@Override
	public Client findClientNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Client findClientPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}
}
