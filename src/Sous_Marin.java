/**
 * Class Sous_Marin qui derive de la class @see bateau
 * 
 * Un Bateau ayant une robustesse de 4.
 * 
 * @author BANGRE Hassan ~ SEYCHA Senth�ne ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */

public class Sous_Marin extends Navire{
	
	/**
     * Constructeur de la class Sous_Marin. Ne prend pas de param�tres.
     * On intialise Robustesse � 4 et le nom � "Sous Marin Nucleaire".
     */
	public Sous_Marin(){
		
		super();
		setRobustesse(4);
		setNom("Sous Marin Nucleaire");
	}
}
