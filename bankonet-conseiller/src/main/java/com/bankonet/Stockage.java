package com.bankonet;

import java.util.HashMap;
import java.util.Map;

public class Stockage <T,E>{

	T cle;
	E element;
	
	private Map<T,E> stock = new HashMap<>();
	

	public E retournerElement(T cle){
		return stock.get(cle);
		
	}
	
	public void ajouter(T cle, E element){
		stock.put(cle, element);
		
	}
	
	public void supprimer(T cle){
		stock.remove(cle);
	}

}
