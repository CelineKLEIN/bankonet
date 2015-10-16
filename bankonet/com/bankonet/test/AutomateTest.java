package com.bankonet.test;

import com.bankonet.CompteStat;

public class AutomateTest {

	public static void main(String args []){
		
		DonneesTest dt = new DonneesTest();
		CompteStat[] comptes = dt.construitEchantillonComptes();
		
		double somme =0.0;
		
		for(CompteStat compte : comptes){
			somme+= compte.getSolde();
		
		}
		double moyenne = somme/comptes.length;
		
		System.out.println("Moyenne = " + moyenne);
	
	}
}
