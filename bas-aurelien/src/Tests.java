import Model.Banque;
import Model.Compte;
import Model.EntreeComptable;


public class Tests {
	
public void TestBanque() {
	System.out.println("Démarrage");
	
	EntreeComptable entree1 = new EntreeComptable(1, 500.00);
	EntreeComptable entree2 = new EntreeComptable(2, -400.00, "Correctif");
	
	String Ligne1 = entree1.WriteEntry();
	String Ligne2 = entree2.WriteEntry();
	
	System.out.println(Ligne1);
	System.out.println(Ligne2);
	
	Banque MaBanque = new Banque("BNB : le pouvoir de cramer des vieux");
	
	MaBanque.AddAccount("Aurélien Faure","Premier compte");
	
	MaBanque.AddAccount("Romain Raballand","Premier compte");
	
	MaBanque.AddAccount("Safaa Sabri","Premier compte");
	
	MaBanque.AddAccount("Cédric Désiré","DRIXXXX");
	
	MaBanque.AfficherListe();
	
	Compte compte1 = MaBanque.getAccount(1);
	
	compte1.AddEntry(250.0);
	compte1.AddEntry(250.0);
	compte1.AddEntry(250.0);
	compte1.AddEntry(250.0);
	compte1.AddEntry(-500.0);
	
	Double Solde = compte1.getBalance();
	
	System.out.println("Solde : "+Solde);
	
	System.out.println(compte1.WriteAccount());
	
	compte1.AfficherHistorique();
	
	System.out.println("fin");
}

}
