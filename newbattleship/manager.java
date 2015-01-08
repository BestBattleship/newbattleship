package Controler;

import Modele.Joueur;
import Modele.Orientation;
import Modele.bateau;
import Modele.etat;
import Modele.zone;

/**
 * Class Controler
 * 
 * Elle permet de verifier lors d'action telles que le tire ou le placement de bateau si le joueur est autorisé à le faire, elle est aussi senser s'assurer que c'est bien à son tour de jouer et determiner quant un joueur a perdu.
 * 
 * @author Bangre Hassan ~ Seycha Sentene ~ SOLLE Quentin ~ Jebry Fatima-Zahra
 * @version Projet Bataille Navale 
 */
/**
 * 
 * @param perdu
 * Stocke la valeur de la robustesse totale.
 * @param n_rob
 * stocke la robustesse du navire touché.
 *
 */
public class Manager extends AbstractManager{
	private int perdu;
	private int n_rob;

	public Manager(Joueur j){
		super(ninja);
	}
	/**
	 * Fonction permettant d'interpreter le choix d'un joueur, et modifie les champs de l'objet zone en consequence.
	 */
	public void control(){
		if(this.getZ().getEtat_bateau() == etat.intact ){
			if(this.getZ().getShip() == null){
				this.getZ().setEtat_bateau(etat.rate);
			}
			else{
				this.getZ().setEtat_bateau(etat.touche);
				n_rob =this.getZ().getShip().getRobustesse();
				n_rob --;
				this.getZ().getShip().setRobustesse(n_rob);
				perdu =this.getJ().getRob_totale() ;
				perdu --;
				this.getJ().setRob_totale(perdu);
				if(this.getJ().getRob_totale() ==0){
					//message de defaite
				}
			}
		}
		else{
			// message "case déja visé veuillez en choisir une autre
		}
	}








	/**
	 * Methode permettant de verifier si l'ensemble des cases prise par le bateau sont libres, si oui le joueur a le droit de le placer via sa methode placer_bateau.
	 * @param t
	 * grille contenant les zones de jeu
	 * @param x
	 * abscisse de la zone
	 * @param y
	 * ordonnée de la zone
	 * @param b
	 * information relative au bateau
	 * @param o
	 * son orientation
	 * @return Une instance de estLibre, Afin de savoir si le bateau est autorisé à se placer ou non.
	 */
	public boolean estLibre (zone [][] t,int x,int y, bateau b,Orientation o){

		if( o == Orientation.horizontal && x+b.getRobustesse()<10){
			for(int i = x;i <b.getRobustesse()+1; i++ ){
				if (t[i][y].getShip()!= null){
					return false;
				}



			}



		}

		if (o == Orientation.vertical && y+b.getRobustesse()<10){
			for(int i = y;i <b.getRobustesse()+1; i++ ){
				if (t[x][i].getShip()!= null){
					return false;
				}





			}

		}

		return true;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}