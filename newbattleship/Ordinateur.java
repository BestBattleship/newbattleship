package Modele;

import java.util.ArrayList;

/**
* Class abstraite joueur
* 
* Celle ci caracterise les attribut générale d'un joueur qu'il soit humain ou ordinateur
* 
* @author Bangre Hassan ~ Seycha Sentene ~ SOLLE Quentin ~ Jebry Fatima-Zahra
* @version Projet Bataille Navale 
*/

/**
 * @param nom
 * Le pseudo du joueur.
 * @param ens_bat
 * La liste des bateaux choisis par le joueur.
 * @param rob_totale
 * robustesse totale de tout les bateaux afin de determiner la defaite du joueur.
 * @param g
 * Grille de jeu du joueur en question.
 * @param listObserver
 * Permet de mettre une liste d'observateur au courant du changement d'état du modele.
 *  
 * 
 *
 */
public abstract class Joueur implements Observable{

 private String nom;
  bateau ens_bat[]= new bateau [5];
 private static int rob_totale= 0;
 private Grille g;
 private ArrayList<Observer> listObserver = new ArrayList<Observer>();
 
 
 /**
  * 
  * @param x
  * Abscisse de la zone.
  * @param y
  * Ordonnée de la zone.
  * @param o
  * Definit l'orientation du bateau.
  * @param b
  * Objet bateau @see bateau
  * @return
  * Une instance de placer_bateau , qui correspond à la reussite du placement du bateau sur la grille.
  */
 public abstract boolean placer_bateau(int x,int y, Orientation o, bateau b);
 /**
  * 
  * @param x
  * Abscisse de la zone.
  * @param y
  * Ordonnée de la zone
  * @return
  * Une instance de tirer , pour savoir si l'opération de tiir a été reussi.
  */
 public abstract boolean tirer (int x, int y);
 /**
  * Rajoute un Observer à la liste
  */
 public void addObserver(Observer obs) {
      this.listObserver.add(obs);
    }
 /**
  * Notifie tous les observateurs si l'objet a changer d'état.
  */
 public void notifyObserver(Object  obj) {           
        for(Observer obs : listObserver)
            obs.update(obj);
}
 /**
  * Ecrase la liste d'observer.
  */
 public void removeObserver() {
      listObserver = new ArrayList<Observer>();
    }  
 
 
 
 
 // get et set à definir selon l'utilisation
 /**
  * Retourne le nom du joueur.
  * @return Une instance de getNom, qui correspond au nom du joueur.
  */
 public abstract String getNom();
/**
 * Change le nom d'un joueur.
 * @param nom
 * le nom d'un joueur.
 */
 public abstract void setNom(String nom) ;
/**
 * Retourne les infos relatives au bateaux du joueur.
 * @return Une instance de getEns_bat, qui correspond à l'ensemble des bateaux du joueur.
 */
 public abstract bateau[] getEns_bat();
/**
 * Information relative à la robustesse totale de la flotte
 * @return Une instance de getRob_totale, qui correspond à la robustesse totale de la flotte.
 */

 public abstract int getRob_totale(); 
/**
 * Permet de decrementer la robustesse en cas de tir reussi.
 * @param rob_totale
 * La robustesse de la flotte.
 */
 public abstract void setRob_totale(int rob_totale) ;
/**
 * Retourne la grille du joueur
 * @return Une instance de getG, qui correspond à niveau du membre sur SDZ.
 */
 public abstract Grille getG();

 public abstract void setG(Grille g);
 public static void main(String[] args) {
  // TODO Auto-generated method stub

 }

}