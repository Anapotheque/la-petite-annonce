package Model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Compte {
	//elements
	private int Identifiant;
	private Date DateCreation;
	private Double Solde;
	private String Libelle;
	private String Commentaire;
	private ArrayList<EntreeComptable> Historique;
	
	//Creation du compte
	public Compte () {
		this.Identifiant = 0;
		this.Solde = 0.0;
		this.Libelle = null;
		this.Commentaire = null;
		this.DateCreation = new Date();
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	public Compte (int Id, String Name) {
		this.Identifiant = Id;
		this.Solde = 100.0;
		this.Libelle = Name;
		this.Commentaire = null;
		this.DateCreation = new Date();
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	public Compte (int Id, String Name, String Comment) {
		this.Identifiant = Id;
		this.Solde = 100.0;
		this.Libelle = Name;
		this.Commentaire = Comment;
		this.DateCreation = new Date();
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	public Compte (int Id, String Name, Double Montant) {
		this.Identifiant = Id;
		this.Solde = Montant;
		this.Libelle = Name;
		this.Commentaire = null;
		this.DateCreation = new Date();
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	public Compte (int Id, String Name, Double Montant, String Comment) {
		this.Identifiant = Id;
		this.Solde = Montant;
		this.Libelle = Name;
		this.Commentaire = Comment;
		this.DateCreation = new Date();
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	public Compte (int Id, String Name, Double Montant, String Comment, Date creationDate) {
		this.Identifiant = Id;
		this.Solde = Montant;
		this.Libelle = Name;
		this.Commentaire = Comment;
		this.DateCreation = creationDate;
		this.Historique = new  ArrayList<EntreeComptable>();
	}
	
	//Getters (pas de setters, on considère qu'on ne peut pas modifier une ligne une fois qu'elle est ecrite.
	public int getId() {return this.Identifiant;}
	public String getName() {return this.Libelle;}	
	public Date getDate() {return this.DateCreation;}
	public Double getBalance() {return this.Solde;}
	public String getComment() {return this.Commentaire;}
	
	public void AfficherHistorique() {
		System.out.println("Historique du compte :");
		for (EntreeComptable ligne : Historique) {
			String lignetmp = ligne.WriteEntry();
			System.out.println(lignetmp);
			}
	}
	
	public void AddEntry(Double Amount){
		int IdEntry = Historique.size()+1;
		EntreeComptable NouvelleLigne = new EntreeComptable(IdEntry, Amount);
		Historique.add(NouvelleLigne);
		Solde += Amount;
	}
	
	public String WriteAccount() {
		String LigneSortie;
		int IdSortie = this.Identifiant + 1;
		LigneSortie = " " + IdSortie + " - "+Libelle;
		if (this.Commentaire != null) {LigneSortie += " - "+this.Commentaire;}
		return LigneSortie;}
	
	public String FileWriteAccount() {
		String LigneSortie, Ligne1, Ligne2, Ligne3;
		String Separateur = " ";
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
				
		LigneSortie = this.Identifiant+Separateur+this.Solde+Separateur+this.Libelle+Separateur+this.Commentaire+Separateur+DateFormat.format(this.DateCreation);
		Ligne1 = this.Solde + " " + this.Libelle;
		Ligne2 = this.Commentaire;
		Ligne3 = DateFormat.format(this.DateCreation);
		
		//Création du fichier
		//File f = new File ("Datas/"+this.Libelle+".txt");
		String test = "Datas/"+this.Libelle+".txt";
		System.out.println (test);
		File f = new File (test);
		//Ecriture des informations dans le fichier
		try
		{
		    PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (f,true)));

		    pw.println (Ligne1);
		    pw.println (Ligne2);
		    pw.println (Ligne3);
		 
		    pw.close();
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de l'écriture : " + exception.getMessage());
		}
		return LigneSortie;}
	
}
