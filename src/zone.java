/**
 * Class zone d�finie par un <b> etat_bateau </b> et un <b> ship </b>
 * 
 * @author BANGRE Hassan ~ SEYCHA Senth�ne ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 

public class zone {
	/**
	 * Attributs de la class <b>Bateau</b>
	 *     @param etat_case
	 *  Correspond � l'�tat actuel de la case. Variable de type etat.
	 *     @param ship
	 *  Correspond au bateau pr�sent ou non sur la case. Variable de type bateau.
	 *     
	 **/
	
	private etat etat_case ;
	private bateau ship;
	
	
	 /**
     * Constructeur qui prend en argument 
     * @param etat_case
     * 	 de type etat
     * @param ship
     * 	 de type int
     **/
	public zone(etat etat_case,bateau ship){
		this.etat_case = etat_case;
		this.ship = ship;
	}
	
	/**
     * Constructeur de la class zone. Ne prend pas de param�tres.
     * On intialise etat_case � intact et ship � null.
     */
	public zone (){
		this.etat_case = etat.intact;
		this.ship = null;
	}
	
	/**
     * Methode permettant de recuperer l'�tat de la case.
     * 
     * @return L'�tat de la case.
     */
	public etat getEtat_case() {
		return etat_case;
	}

	/**
     * Methode permettant de modifier la valeur de l'attribut <b>etat_case</b> de la zone. Prend en argument une variable de type etat correspondant a la nouvelle valeur de l'attribut etat_case.
     */
	public void setEtat_case(etat etat_case) {
		this.etat_case = etat_case;
	}

	/**
     * Methode permettant de recuperer le bateau sur la zone.
     * 
     * @return Le bateau pr�sent, null si aucun.
     */
	public bateau getShip() {
		return ship;
	}


	/**
     * Methode permettant de modifier la valeur de l'attribut <b>ship</b> de la zone. Prend en argument une variable de type bateau correspondant a la nouvelle valeur de l'attribut ship.
     */
	public void setShip(bateau ship) {
		this.ship = ship;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
