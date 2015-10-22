package com.bankonet;

public enum Civilite {
	
	MONSIEUR("Monsieur"), 
	MADAME("Madame"), 
	MADEMOISELLE("Mademoiselle");
	

	private String name="";
	
	Civilite(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
