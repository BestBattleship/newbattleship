/**
 * Class bateau définie par un <b> nom </b> et une <b> robustesse </b>
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 

public abstract class bateau {
     /**
	 * Attributs de la class <b>Bateau</b>
	 *     @param nom
	 *  Correspond au nom du Bateau. Variable de type String.
	 *     @param robustesse
	 *  Correspond au nombre de tirs pour couler le Bateau. Variable de type int.
	 *     
	 **/
	
	private String nom;
	private int robustesse;
	
    /**
     * Constructeur qui prend en argument 
     * @param nom
     * 	 de type String
     * @param robustesse
     * 	 de type int
     **/
     
	public bateau (String nom , int robustesse){
		this.nom = nom;
		this.robustesse = robustesse;
	}
	
	/**
     * Constructeur de la class Bateau. Ne prend pas de paramètres.
     * On intialise nom à "" et robustesse à 1.
     */
	public bateau(){
		this.nom = "";
		this.robustesse = 1;
	}
	

	/**
     * Methode permettant de recuperer le nom du Bateau.
     * 
     * @return Le nom du Bateau.
     */
	public String getNom() {
		return nom;
	}

	/**
     * Methode permettant de modifier la valeur de l'attribut <b>nom</b> du Bateau. Prend en argument une variable de type String correspondant a la nouvelle valeur de l'attribut nom.
     */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
     * Methode permettant de recuperer la robustesse du Bateau.
     * 
     * @return La robustesse du Bateau.
     */
	public int getRobustesse() {
		return robustesse;
	}

	/**
     * Methode permettant de modifier la valeur de l'attribut <b>robustesse</b> du Bateau. Prend en argument une variable de type Robustesse correspondant a la nouvelle valeur de l'attribut robustesse.
     */
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