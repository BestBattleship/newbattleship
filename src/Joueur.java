import java.util.ArrayList;


public abstract class Joueur implements Observable{

	private String nom;
	 bateau ens_bat[]= new bateau [5];
	private static int rob_totale= 0;
	private Grille g;
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	
	
	
	public abstract boolean placer_bateau(int x,int y, Orientation o, bateau b);
	
	public abstract boolean tirer (int x, int y);
	
	public void addObserver(Observer obs) {
		    this.listObserver.add(obs);
		  }
	public void notifyObserver(Object  obj) {           
        for(Observer obs : listObserver)
            obs.update(obj);
}
	public void removeObserver() {
		    listObserver = new ArrayList<Observer>();
		  }  
	
	
	
	
	// get et set à definir selon l'utilisation
	
	public abstract String getNom();

	public abstract void setNom(String nom) ;

	public abstract bateau[] getEns_bat();

	public abstract void setEns_bat(bateau[] ens_bat) ;

	public abstract int getRob_totale(); 

	public abstract void setRob_totale(int rob_totale) ;

	public abstract Grille getG();

	public abstract void setG(Grille g);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

