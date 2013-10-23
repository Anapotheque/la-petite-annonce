package View;
import java.util.Scanner;

import Model.Banque;
import Model.Compte;

public class InterfaceUtilisateur {
	
	
	public void Header() {
		System.out.println("-----------------------------------");
		System.out.println("--         MyCompte V1.0         --");
		System.out.println("-----------------------------------");
	}
	
	
	public int EcranBanque(Banque Bank) {
		
		int resultat;
		int nombreComptes = Bank.getAccountList().size();
		
		Header();
		System.out.println("Veuillez choisir l'une des actions :");
		System.out.println("1 : Créer un compte bancaire");
		if (nombreComptes != 0) {
		System.out.println("Afficher détail du compte");
		Bank.AfficherListe();
		}
		System.out.println("0 : Quitter");
	
		Scanner saisie = new Scanner(System.in);
		resultat = saisie.nextInt();
		
		while (resultat > nombreComptes+1) {
			System.out.println("Entrée non valide, veuillez saisir votre choix à nouveau :");
			resultat = saisie.nextInt();
		}
		saisie.close();
		return resultat;
	}
	
	public int EcranListeComptes() {
		
		int resultat;
		
		Header();
		System.out.println("Veuillez choisir l'une des actions :");
		System.out.println("{identifiant du compte} : { afficher la liste des comptes bancaires : vous pourrez afficher le libelle du compte }");
		System.out.println(" 5 : Quitter");
		
		Scanner saisie = new Scanner(System.in);
		resultat = saisie.nextInt();
		saisie.nextLine();
		
		saisie.close();
		return resultat;
	}	
	
	public int EcranCompte(Compte Account) {
		
		int resultat;
		
		Header();
		System.out.println(Account.getName());
		System.out.println("Veuillez choisir l'une des actions :");
		System.out.println("1 : Afficher l'historique du compte");
		System.out.println("2 : Créditer le compte");
		System.out.println("3 : Débiter le compte");
		System.out.println("4 : Supprimer le compte");
		System.out.println("5 : Retour à la liste des comptes");
		System.out.println("0 : Quitter");
		
		Scanner saisie = new Scanner(System.in);
		resultat = saisie.nextInt();
		saisie.nextLine();
		
		while (resultat > 6) {
			System.out.println("Entrée non valide, veuillez saisir votre choix à nouveau :");
			resultat = saisie.nextInt();
			saisie.nextLine();
		}
		
		saisie.close();
		return resultat;
	}
	
	
}
