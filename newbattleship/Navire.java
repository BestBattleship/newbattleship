public abstract class Navire {

	private String nom;
	private int robustesse;
	
	public bateau (String nom , int robustesse){
		this.nom = nom;
		this.robustesse = robustesse;
	}
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getRobustesse() {
		return robustesse;
	}


	public void setRobustesse(int robustesse) {
		this.robustesse = robustesse;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
