
public abstract class Joueur {

	private String nom;
	private Flotte flotte;

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


	public Joueur(){
		this.nom = "Aucun";
	}
/* A implémenter 
	public boolean position_navire (){

	}
	public boolean cases_touchees(){

	}
	public boolean case_ciblee(){

	}
	*/
}
