package com.bankonet.test;

import com.bankonet.CompteCourant;
import com.bankonet.CompteStat;


public class DonneesTest {
	
		
	public CompteStat[] construitEchantillonComptes(){
	CompteStat[] comptes = new CompteStat[5];
	
	comptes[0] = new CompteCourant("1215616", "economique", 5.2, 100.0);
	comptes[1] = new CompteCourant("1255654", "economique", 100.0, 3000.0);
	comptes[2] = new CompteCourant("1313131", "economique", 15.2, 1000.0);
	comptes[3] = new CompteCourant("1313131", "economique", 2320.0, 10.0);
	comptes[4] = new CompteCourant("1313131", "economique", 1520.0, 2.0);
	return comptes;
}
	
	
}
