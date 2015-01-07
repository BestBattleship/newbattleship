public class Grille {
	int lignes;
	int colonnes;
	zone [][]t1 = new zone [10][10];
	int i,y;
	
	
	
		
	
	

	public void init(){
		for (lignes = 0 ; lignes <10 ;lignes ++)
		{
			for (colonnes = 0 ;colonnes<10;colonnes ++){
				t1[lignes][colonnes] = new zone();
			}
		}
		
	}
	
	
	
	

	public void setT1(zone[][] t1) {
		this.t1 = t1;
	}





	public static void main(String[] args) {
		
		
		//zone z = new zone (etat.intact,new bateau ( "porte avion",5));
		
}
	}


