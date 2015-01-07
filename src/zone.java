public class zone {

	private etat etat_bateau ;
	private bateau ship;
	
	
	
	public zone(etat etat_bateau,bateau ship){
		this.etat_bateau = etat_bateau;
		this.ship = ship;
	}
	public zone (){
		this.etat_bateau = etat.intact;
		this.ship = null;
	}
	
	
	


	public etat getEtat_bateau() {
		return etat_bateau;
	}





	public void setEtat_bateau(etat etat_bateau) {
		this.etat_bateau = etat_bateau;
	}





	public bateau getShip() {
		return ship;
	}





	public void setShip(bateau ship) {
		this.ship = ship;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
