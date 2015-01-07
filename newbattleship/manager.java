public class Manager extends AbstractManager{
	private int perdu;
	private int n_rob;
	
	public Manager(Joueur j){
		super(j);
	}
	
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
			// message "case d�ja vis� veuillez en choisir une autre
		}
		}
	
	
	

	
	
	
	
	
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
