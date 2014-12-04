public abstract class Navire {

	private String nom;
	private  int robustesse;
	private int X;
	private int Y;
	private Orientation orientation;

	public Navire() {

		this.nom = "Aucun";
		this.robustesse = 0;
		this.X = 0;
		this.Y = 0;
	}

	public int getX(){

		return X;
	}

	public int getY(){

		return Y;
	}

	public void setX(int x) {
		this.X = x;
	}

	public void setY(int y) {
		this.Y = y;
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

	public Orientation getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Orientation o) {
		this.orientation = o;
	}
}
