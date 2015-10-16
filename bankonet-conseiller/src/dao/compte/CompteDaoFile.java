package dao.compte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import com.bankonet.Client;
import com.bankonet.Compte;
import com.bankonet.CompteCourant;

public class CompteDaoFile implements CompteDao {

	@Override
	public List<Compte> findAll() {
		// chercher dans les fichiers
		return null;
	}

	@Override
	public void save(Compte compte1) {

		Properties prop = new Properties();
		OutputStream output = null;
		InputStream input = null;

		try {

			input = new FileInputStream("clients.properties");

			// load a properties file
			prop.load(input);

			// 
			prop.setProperty(compte1.getNumero(), compte1.getIntitule());
			
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
}
