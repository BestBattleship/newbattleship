public abstract class AbstractManager {

	private Joueur j ;
	private zone z = null;
	public AbstractManager(Joueur j){
		this.j = j;
	}
	
	
	
	public void setZone(zone eau){
		this.z = eau;
		control();
	}
	
	
	public Joueur getJ() {
		return j;
	}



	public zone getZ() {
		return z;
	}
	






	public abstract void control();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

