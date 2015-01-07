
public class Utilisateur extends Joueur{
	
	
	public Utilisateur (String nom){
		
		super();
		this.setNom(nom);
	}
	
	

	@Override
	public boolean placer_bateau(int x, int y, Orientation o, bateau b) {
		
			
		
		return false;
	}

	@Override
	public boolean tirer(int x, int y) {
		
			
		
			
		return false;
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

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


}
}