import javax.swing.text.Position;


public abstract class Navire {

	private String nom;
	private  int robustesse;
	private Position position_navire;
	
	public Navire() {
	
		this.nom = "Aucun";
		this.robustesse = 0;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getRobustesse() {
		return this.robustesse;
	}

	public void setRobustesse(int robustesse) {
		this.robustesse = robustesse;
	}

	public Position getPosition() {
		return position_navire;
	}

	public void setPosition(Position position) {
		this.position_navire = position;
	}
	
	
	
	
	
}
