/**
 * Class Zodiac qui derive de la class @see bateau
 * 
 * Un Bateau ayant une robustesse de 2.
 * 
 * @author BANGRE Hassan ~ SEYCHA Senth�ne ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */


public class Zodiac extends Navire {

	/**
     * Constructeur de la class Zodiac. Ne prend pas de param�tres.
     * On intialise Robustesse � 2 et le nom � "Zodiac de Troupes d'Interventions".
     */
public Zodiac(){
		
		super();
		setRobustesse(2);
		setNom("Zodiac de Troupes d'Interventions");
	}
	
}
