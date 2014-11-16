
public class Cuirasse extends Navire{
	private static int cpt = 1;
	
	
	
	public Cuirasse(){
		super();
		setRobustesse(3);
		setNom("Cuirasse Furtif_"+cpt);
		cpt++;
	}
}
