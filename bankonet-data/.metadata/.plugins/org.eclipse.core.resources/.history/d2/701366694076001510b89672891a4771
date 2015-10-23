package dao.client;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import com.bankonet.Client;
import com.bankonet.CompteCourant;

public class ClientDaoFile  implements ClientDao{

	@Override
	public List<Client> findAll() {
		/*try{
			
		}catch (IOException e){
			throw new CompteException("", e);
		}*/
		return null;
	}

	@Override
	public void save(Client client1, CompteCourant compte1) {
		Properties prop = new Properties();
		OutputStream output = null;
		InputStream input = null;

		try {

			input = new FileInputStream("clients.properties");

			// load a properties file
			prop.load(input);

			// 
			prop.setProperty(client1.getIdentifiant(), structure(client1.getNom(), client1.getPrenom(), client1, compte1));
			
			output = new FileOutputStream("clients.properties");
			prop.store(output, null);
			

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}
	
	private String structure(String nom, String prenom, Client client1, CompteCourant compte1) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("=nom:");
		sb.append(nom);
		sb.append("&prenom:");
		sb.append(prenom);
		sb.append("&comptes_courant:");
		sb.append(compte1);
	
		return sb.toString();

		

	}

	

}
