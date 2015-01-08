/**
 * Class AbstractManager définie par un <b> Joueur </b> et une <b> zone </b>
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 

public abstract class AbstractManager {
	
	/**
	 * Attributs de la class <b>AbstractManager</b>
	 *     @param j
	 *  Correspond au Joueur attribuer au Manager. Variable de type @see Joueur.
	 *     @param z
	 *  Correspond à la zone attribuer. Variable de type zone.
	 *     
	 **/
	private Joueur j ;
	private zone z = null;
	
	
	 /**
     * Constructeur qui prend en argument 
     * @param j
     * 	 de type Joueur
     **/
	public AbstractManager(Joueur j){
		this.j = j;
	}
	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>z</b> du Manager. Prend en argument une variable de type zone correspondant a la nouvelle valeur de l'attribut z.
     */
	public void setZone(zone eau){
		this.z = eau;
		control();
	}
	
	/**
     * Methode permettant de recuperer le Joueur du Manager.
     * 
     * @return Le Joueur.
     */
	public Joueur getJ() {
		return j;
	}


	/**
     * Methode permettant de recuperer la zone du Manager.
     * 
     * @return La zone.
     */
	public zone getZ() {
		return z;
	}
	






	public abstract void control();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

