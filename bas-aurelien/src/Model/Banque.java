package Model;
import java.util.ArrayList;
import java.util.Date;


public class Banque {
	//elements
	//private int Identifiant;
	private Date DateCreation;
	private String Libelle;
	private ArrayList<Compte> Comptes;
	
	//Creation de la banque
	public Banque () {
		//this.Identifiant = Id;
		this.Libelle = null;
		this.DateCreation = new Date();
		this.Comptes = new  ArrayList<Compte>();
	}
	
	public Banque (String Name) {
		//this.Identifiant = Id;
		this.Libelle = Name;
		this.DateCreation = new Date();
		this.Comptes = new  ArrayList<Compte>();
	}
	
	//Getters (pas de setters, on considère qu'on ne peut pas modifier une ligne une fois qu'elle est ecrite.
	public String getName() {return this.Libelle;}	
	public Date getDate() {return this.DateCreation;}
	public Compte getAccount(int Id) {return this.Comptes.get(Id);}
	public ArrayList<Compte> getAccountList() {return this.Comptes;}

	
	public void AfficherListe() {
		// System.out.println("Liste des comptes :");
		for (Compte ligne : Comptes) {
			String lignetmp = ligne.WriteAccount();
			System.out.println(lignetmp);
			}
	}
	
	public void AddAccount(String Name) {
		int IdCompte = Comptes.size()+1;
		Compte NouveauCompte = new Compte(IdCompte,Name);
		Comptes.add(NouveauCompte);		
	}
	
	public void AddAccount(String Name, Double Amount) {
		int IdCompte = Comptes.size()+1;
		Compte NouveauCompte = new Compte(IdCompte,Name,Amount);
		Comptes.add(NouveauCompte);		
	}
	
	public void AddAccount(String Name, String Comment) {
		int IdCompte = Comptes.size()+1;
		Compte NouveauCompte = new Compte(IdCompte,Name, Comment);
		Comptes.add(NouveauCompte);		
	}
	
	public void AddAccount(String Name, Double Amount, String Comment) {
		int IdCompte = Comptes.size()+1;
		Compte NouveauCompte = new Compte(IdCompte,Name, Amount, Comment);
		Comptes.add(NouveauCompte);		
	}
	
	public void AddAccount(String Name, Double Amount, String Comment, Date Date) {
		int IdCompte = Comptes.size()+1;
		Compte NouveauCompte = new Compte(IdCompte,Name, Amount, Comment, Date);
		Comptes.add(NouveauCompte);		
	}
	
	public void RemoveAccount(Compte Account) {
		Comptes.remove(Account);	
	}

}
