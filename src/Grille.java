/**
 * Class Grille définie par des <b> lignes </b>, des <b> colonnes </b>, des <b> zones </b>, un <b> i </b> et un <b> y </b>
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 

public class Grille {
	/**
	 * Attributs de la class <b>Grille</b>
	 *     @param lignes
	 *  Correspond au nombre de lignes de notre Grille. Variable de type int.
	 *     @param colonnes
	 *  Correspond au nombre de colonnes de notre Grille. Variable de type int.
	 *     @param t1
	 *  Correspond à notre tableau de zones. Variable de type @see zone. 
	 **/
	
	int lignes;
	int colonnes;
	zone [][]t1 = new zone [10][10];
	
	
	
	/**
     * Methode permettant d'attribuer les cases à notre grille.
     */
	public void init(){
		for (lignes = 0 ; lignes <10 ;lignes ++)
		{
			for (colonnes = 0 ;colonnes<10;colonnes ++){
				t1[lignes][colonnes] = new zone();
			}
		}
		
	}
	
	
	/**
     * Methode permettant de modifier la valeur de l'attribut <b>t1</b> de la Grille. Prend en argument une variable de type [][]zone correspondant a la nouvelle valeur de l'attribut t1.
     */
	public void setT1(zone[][] t1) {
		this.t1 = t1;
	}


	public static void main(String[] args) {
		
		
		//zone z = new zone (etat.intact,new bateau ( "porte avion",5));
		
}
	}


