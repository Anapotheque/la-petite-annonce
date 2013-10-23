package Model;
import java.util.Date;


public class EntreeComptable {
	//elements
	private int Identifiant;
	private Date DateCreation;
	private Double Montant;
	private String Commentaire;
	
	//Creation de la ligne comptable
	public EntreeComptable (int Id, Double Amount) {
		this.Identifiant = Id;
		this.Montant = Amount;
		this.Commentaire = null;
		this.DateCreation = new Date();
	}
	
	public EntreeComptable (int Id, Double Amount, String Comment) {
		this.Identifiant = Id;
		this.Montant = Amount;
		this.Commentaire = Comment;
		this.DateCreation = new Date();
	}
	
	//Getters (pas de setters, on considère qu'on ne peut pas modifier une ligne une fois qu'elle est ecrite.
	public int getId() {return this.Identifiant;}
	public Date getDate() {return this.DateCreation;}
	public Double getAmount() {return this.Montant;}
	public String getComment() {return this.Commentaire;}
	
	//Sortie globale, pour ecrire dans la console, ou dans un fichier.
	public String WriteEntry() {
		String LigneSortie;
		LigneSortie = "Id "+this.Identifiant + " - Created the ";
		String format = "dd/MM/yy H:mm:ss";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
		LigneSortie += formater.format(DateCreation)+ " - Amount = "+Montant+"� ";
		if (this.Commentaire != null) {LigneSortie += " - Comment : "+this.Commentaire;}
		return LigneSortie;}
	
}
