
public class Zone {
	private int X;
	private int Y;
	private etat etat_case;
	private Navire Navire;
	
		public Zone(int X, int Y){
			
			this.X = X;
			this.Y = Y;
			this.etat_case = etat.intact;
            this.Navire = null;
	}
		
		

		public int getX(){
			
			return X;
		}
		
        public int getY(){
			
			return Y;
		}
		
		public void setX(int x) {
			this.X = x;
		}
		
		public void setY(int y) {
			this.Y = y;
		}
		
		public etat getEtat_zone() {
			return etat_case;
		}
		public void setEtat_zone(etat etat_case) {
			this.etat_case = etat_case;
		}


		public Navire getNavire() {
			return Navire;
		}

		public void setNavire(Navire n) {
			Navire = n;
		}
public boolean equals(Navire n){
	
	if(Navire.getNom() == n.getNom()){
		
		return true;
	}
			return false;
		}
}

