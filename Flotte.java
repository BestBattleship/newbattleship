import java.util.ArrayList;


/**
 * Class Flotte définie par une <b>robustesseFlotte</b> et une @see ArrayList de <b>Bateau</b> 
 * 
 * @author BANGRE Hassan ~ SEYCHA Senthène ~ SOLLE Quentin ~ JEBRY Fatima-Zahra
 * @version Projet Bataille Navale 
 */ 


public class Flotte {
	
	private int robustesseFlotte = 0;
	private ArrayList <Navire> Bateau;
	
	public Flotte (){
		this.Bateau = new ArrayList <Navire> () ;
		this.robustesseFlotte = robustesseFlotte;
	}

	public int getRobustesseFlotte() {
		return robustesseFlotte;
	}

	public void setRobustesseFlotte(int robustesseFlotte) {
		this.robustesseFlotte = robustesseFlotte;
	}

	public ArrayList<Navire> getBateau() {
		return Bateau;
	}

	public void setBateau(ArrayList<Navire> bateau) {
		Bateau = bateau;
	}

	
		
	
}


