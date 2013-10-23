package Controler;
import java.util.Scanner;

import Model.Banque;
import Model.Compte;


public class Controle {
	
	public void AjouterCompte(Banque Bank) {

		Scanner saisie = new Scanner(System.in);
		int ChoixMontant = 0;
		String Libellé;
		Double Montant = 0.0;
	
		System.out.println("Entrez le nom du compte :");
		Libellé = saisie.nextLine();
		
		System.out.println("Voulez-vous modifier le montant initial ? (Oui:1/Non:0)");
		ChoixMontant = saisie.nextInt();

		if (ChoixMontant == 1) {
		System.out.println("Entrez le montant initial :");
		Montant = saisie.nextDouble();
		Bank.AddAccount(Libellé,Montant);
		}
		else {Bank.AddAccount(Libellé);}
		saisie.close();
		
	}
	
	public void CrediterCompte(Compte Account) {
		Double Montant = -1.0;
		Scanner saisie = new Scanner(System.in);
		
		while (Montant < 0) {
		System.out.println("Entrez le montant à créditer :");
		Montant = saisie.nextDouble();
		if (Montant < 0) {System.out.println("Le montant ne peut étre négatif.");}
		}
		
		Account.AddEntry(Montant);
		System.out.println("Montant crédité");
		saisie.close();
	}
	
	public void DebiterCompte(Compte Account) {
		Double Montant = 1.0;
		Scanner saisie = new Scanner(System.in);
		
		while (Montant > 0) {
		System.out.println("Entrez le montant à débiter :");
		Montant = saisie.nextDouble();
		if (Montant > 0) {System.out.println("Le montant ne peut étre positif.");}
		}
		
		Account.AddEntry(Montant);
		System.out.println("Montant débité");
		saisie.close();
	}
	
	public void SupprimerCompte(Banque Bank, Compte Account) {
		int choix = 0;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Voulez-vous vraiment supprimer le compte " + Account.getName() + " ? (Oui:1/Non:0)");
		choix = saisie.nextInt();
		
		if (choix == 1) {Bank.RemoveAccount(Account);
		System.out.println("Compte supprimé");
		}
		else {System.out.println("Compte conservé");}
		saisie.close();
	}
	
}
