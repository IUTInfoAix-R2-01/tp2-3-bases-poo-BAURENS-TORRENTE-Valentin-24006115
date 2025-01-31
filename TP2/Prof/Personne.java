package Prof;

public class Personne {
	public String Nom;
	public String Prenom;
	
	public Personne (String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public Personne (String Prenom) {
		this.Prenom = Prenom;
		this.Nom = "";
	}
	
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString() {
		if (Nom.length() == 0) {
			return Prenom;
		}
		return Nom + " " + Prenom;
	}
	
}
