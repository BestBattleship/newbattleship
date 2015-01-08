/**
 * Class Cuirasse qui derive de la class @see bateau
 * 
 * Un Bateau ayant une robustesse de 3.
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */


public class Cuirasse extends bateau{
	/**
	 * Attributs de la class <b>Cuirasse</b>
	 *  @param cpt
	 *  Correspond au compteur pour définir si c'est le Cuirasse n1 ou n2. Variable de type int.
	 */
	private static int cpt = 1;
	
	/**
     * Constructeur de la class Cuirasse. Ne prend pas de paramètres.
     * On intialise Robustesse à 3 et le nom à "\Cuirasse Furtif_\ +cpt". Et on incrémente le cpt si on créer un Cuirasse.
     */
	public Cuirasse(){
		super();
		setRobustesse(3);
		setNom("Cuirasse Furtif_"+cpt);
		cpt++;
	}
}

