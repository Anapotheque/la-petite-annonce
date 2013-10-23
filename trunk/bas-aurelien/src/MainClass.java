import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Controler.Controle;
import Model.Banque;
import Model.Compte;
import View.InterfaceUtilisateur;


public class MainClass {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Banque CurrentBank;
		Compte CurrentAccount;
		int ecranCourant;
		int saisie;
		
		//Initialisation des variables
		InterfaceUtilisateur ecrans = new InterfaceUtilisateur();
		Controle controleur = new Controle();
		CurrentBank = new Banque();
		CurrentAccount = new Compte();
		ecranCourant = 0;
		
		//Chargement des données
		/*File Datas = new File("Datas");
		File[] Comptes = Datas.listFiles();
		for (File compte : Comptes)
		{
			System.out.println("Compte : "+compte.getName());
			try
			{
				Scanner scanFile = new Scanner (compte);
					Double montant = Double.parseDouble(scanFile.next());
					String nom =  scanFile.nextLine();
					String commentaire = scanFile.nextLine();
					String DateCreationStr = scanFile.nextLine();
					SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
					Date DateCreation = DateFormat.parse(DateCreationStr);
					CurrentBank.AddAccount(nom, montant, commentaire, DateCreation);
				scanFile.close();

			}
			catch (FileNotFoundException exception)
			{System.out.println ("Le fichier n'a pas été trouvé");}
			
		}*/
		
		//Données de test
		CurrentBank.AddAccount("Aurélien Faure","Premier compte");
		CurrentBank.AddAccount("Romain Raballand","Premier compte");
		CurrentBank.AddAccount("Safaa Sabri","Premier compte");
		CurrentBank.AddAccount("Cédric Désiré","DRIXXXX");
		
		
		//Boucle d'interface
		saisie = ecrans.EcranBanque(CurrentBank);
		while (saisie > 0) {
		
		if (ecranCourant == 0 && saisie == 1) {
			controleur.AjouterCompte(CurrentBank);
			ecranCourant = 1;
			saisie = ecrans.EcranBanque(CurrentBank);
		}
		
		if (ecranCourant == 1 && saisie == 1) {
			controleur.AjouterCompte(CurrentBank);
			ecranCourant = 1;
			saisie = ecrans.EcranBanque(CurrentBank);
		}
		
		if (ecranCourant == 1 && saisie > 1) {
			int temp = saisie - 2;

			CurrentAccount = CurrentBank.getAccount(temp);
			ecranCourant = 2;
			saisie = ecrans.EcranCompte(CurrentAccount);
		}
		
		if (ecranCourant == 2 && saisie == 1) {
			CurrentAccount.AfficherHistorique();
			ecranCourant = 2;
			saisie = ecrans.EcranCompte(CurrentAccount);
		}
		
		if (ecranCourant == 2 && saisie == 2) {
			controleur.CrediterCompte(CurrentAccount);
			ecranCourant = 2;
			saisie = ecrans.EcranCompte(CurrentAccount);
		}
		
		if (ecranCourant == 2 && saisie == 3) {
			controleur.DebiterCompte(CurrentAccount);
			ecranCourant = 2;
			saisie = ecrans.EcranCompte(CurrentAccount);
		}
		
		if (ecranCourant == 2 && saisie == 4) {
			controleur.SupprimerCompte(CurrentBank,CurrentAccount);
			ecranCourant = 1;
			saisie = ecrans.EcranBanque(CurrentBank);		
		}
		
		if (ecranCourant == 2 && saisie == 5) {
			ecranCourant = 1;
			saisie = ecrans.EcranBanque(CurrentBank);
		}
		
	}
		
		//Sauvegarde des données dans des fichiers texte
		for (Compte c : CurrentBank.getAccountList())
		{ c.FileWriteAccount();}
		
		System.out.println("Fin de la session");
		

	}

}
