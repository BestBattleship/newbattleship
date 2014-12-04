
public abstract class Joueur {

	private String nom;
	private Flotte flotte;

	public Joueur(){
		this.nom = "aucun";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Flotte getFlotte() {
		return flotte;
	}
	public void setFlotte(Flotte flotte) {
		this.flotte = flotte;
	}
}
