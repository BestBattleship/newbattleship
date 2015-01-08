/**
 * Class Porte_Avion qui derive de la class @see Navire
 * 
 * Un Navire ayant une robustesse de 5.
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */

public class Porte_Avions extends Navire {

	
	/**
     * Constructeur de la class Porte_Avion. Ne prend pas de paramètres.
     * On intialise Robustesse à 5 et le nom à "Porte Avion".
     */
	public Porte_Avions(){
		
		super();
		setRobustesse(5);
		setNom("Porte Avion");
	
	}
	
}
