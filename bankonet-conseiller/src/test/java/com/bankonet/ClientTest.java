package com.bankonet;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

	@Test
	public void testRetournerCompte(){
	
		Client client = new Client();
		try{
			client.retournerCompte("xxxx");
		Assert.fail("CompteNonTrouveException attendu");
		}catch (CompteNonTrouveException e){
		}
	}

}
