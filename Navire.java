
/**
 * Class Navire définie par un <b> nom </b>, une <b> robustesse </b>, un <b> X </b>, un <b> Y </b> et une <b> Orientation </b>
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 

public abstract class Navire {

	/**
	 * Attributs de la class <b>Navire</b>
	 *     @param nom
	 *  Correspond au nom du Navire. Variable de type String.
	 *     @param robustesse
	 *  Correspond au nombre de tirs pour couler le Navire. Variable de type int.
	 *     @param X
	 *  Correspond à l'ordonnée du Navire sur le champ de bataille. Variable de type int.  
	 *     @param Y
	 *  Correspond à l'abscisse du Navire sur le champ de bataille. Variable de type int.
	 *     @param orientation
	 *  Correspond à l'orientation lors du placement de notre bateau sur le champ de bataille (Verticalement ou Horizontalement). Variable de type @see Orientation.
	 */
	
	private String nom;
	private  int robustesse;
	private int X;
	private int Y;
	private Orientation orientation;

	
	/**
     * Constructeur de la class Cuirasse. Ne prend pas de paramètres.
     * On intialise X, Y et robustesse à 0, ainsi que le nom à "Aucun".
     */
	public Navire() {

		this.nom = "Aucun";
		this.robustesse = 0;
		this.X = 0;
		this.Y = 0;
	}

	
	/**
     * Methode permettant de recuperer l'ordonnée du Navire.
     * 
     * @return L'ordonnée X du Navire.
     */
	public int getX(){

		return X;
	}

	
	/**
     * Methode permettant de recuperer l'abscisse du Navire.
     * 
     * @return L'abscisse Y du Navire.
     */
	public int getY(){

		return Y;
	}

	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>X</b> du Navire. Prend en argument une variable de type int correspondant a la nouvelle valeur de l'attribut X.
     */
	public void setX(int x) {
		this.X = x;
	}

	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>Y</b> du Navire. Prend en argument une variable de type int correspondant a la nouvelle valeur de l'attribut Y.
     */
	public void setY(int y) {
		this.Y = y;
	}

	/**
     * Methode permettant de recuperer le nom du Navire.
     * 
     * @return Le nom du Navire.
     */
	
	public String getNom() {
		return this.nom;
	}

	/**
     * Methode permettant de modifier la valeur de l'attribut <b>nom</b> du Navire. Prend en argument une variable de type String correspondant a la nouvelle valeur de l'attribut nom.
     */
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
     * Methode permettant de recuperer la robustesse du Navire.
     * 
     * @return La robustesse du Navire.
     */
	public int getRobustesse() {
		return this.robustesse;
	}

	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>robustesse</b> du Navire. Prend en argument une variable de type Robustesse correspondant a la nouvelle valeur de l'attribut robustesse.
     */
	public void setRobustesse(int robustesse) {
		this.robustesse = robustesse;
	}

	
	/**
     * Methode permettant de recuperer l'orientation du Navire.
     * 
     * @return L'orientation du Navire.
     */
	public Orientation getOrientation() {
		return this.orientation;
	}

	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>orientation</b> du Navire. Prend en argument une variable de type Orientation correspondant a la nouvelle valeur de l'attribut orientation.
     */
	public void setOrientation(Orientation o) {
		this.orientation = o;
	}
}
