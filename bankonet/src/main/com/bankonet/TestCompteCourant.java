package src.main.com.bankonet;

public class TestCompteCourant {
	
	public static void main(String[] args) {
		
		 CompteCourant compteCourant1 = new CompteCourant("1215616", "economique", 5.20, 100);
		

		 CompteCourant compteCourant2 = new CompteCourant("1255654", "economique", 100.00, 3000.00); 

		 
		 CompteCourant compteCourant3 = new CompteCourant("1313131", "economique", 15.20, 1000.00);

		 System.out.println(compteCourant1.getSolde());
		 System.out.println(compteCourant2.getSolde());
		 System.out.println(compteCourant3.getSolde());

		 
		 
		 
		 compteCourant1.crediter(20);
		 System.out.println(compteCourant1.getSolde());
		 compteCourant2.debiter(10);
		 System.out.println(compteCourant2.getSolde());
		 
		 
		 CompteCourant[] compteCourantTab = {compteCourant1, compteCourant2, compteCourant3};
			for(CompteCourant cc : compteCourantTab) {
				System.out.println(cc);
		 }
		 
	
	}

}
