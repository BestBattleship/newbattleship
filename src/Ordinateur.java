import java.util.Random;


public class Ordinateur extends Joueur{
	
	
	Random rand1 = new Random();
	Random rand2 = new Random();
	
	int x = rand1.nextInt(10);
	int y = rand2.nextInt(10);
	
	
	public Ordinateur(){
		super();
		this.setNom("Ordinateur");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean placer_bateau(int x, int y, Orientation o, bateau b) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean tirer(int x, int y) {
	while (getG().t1[x][y].getEtat_bateau()!= etat.intact){
		x= rand1.nextInt(10);
		y = rand2.nextInt(10);
		tirer(x,y);
		
	}
	// methode du manager selon si la zone contient un bateau ou nan
		return true;
	}


	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public bateau[] getEns_bat() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setEns_bat(bateau[] ens_bat) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getRob_totale() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setRob_totale(int rob_totale) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Grille getG() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setG(Grille g) {
		// TODO Auto-generated method stub
		
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	
}
