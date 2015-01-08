/**
 * Class Porte_Avion qui derive de la class @see Navire
 * 
 * Un Navire ayant une robustesse de 5.
 * 
 * @author BANGRE Hassan ~ SEYCHA Senth�ne ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */

public class Porte_Avions extends Navire {

	
	/**
     * Constructeur de la class Porte_Avion. Ne prend pas de param�tres.
     * On intialise Robustesse � 5 et le nom � "Porte Avion".
     */
	public Porte_Avions(){
		
		super();
		setRobustesse(5);
		setNom("Porte Avion");
	
	}
	
}
