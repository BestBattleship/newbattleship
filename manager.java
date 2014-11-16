
public abstract class manager {


	public boolean tir(Case c){

		if(c.getEtat_case() != etat.intact){
			// Erreur case déjà cibler message à envoyer à l'utilisateur
		}
		else{

			if(c.getNavire() == null){

				c.setEtat_case(etat.rate);
				// Afficher raté à l'ecran 

				return false;
			}

			else {

				int valeur = c.getNavire().getRobustesse();
				valeur --;

				if(valeur ==0){

					//Afficher coulé à l'écran 
					c.setEtat_case(etat.touche);
				}

				else {
					c.getNavire().setRobustesse(valeur);
					c.setEtat_case(etat.touche);
				}

			}

		}
return true;
	}


	public boolean placer(/* Orientation o, */ Navire n, Case c){

		if(c.getPosition_case())// horizontale : x + robustesse <> max(x) et Verticale  : y + robustesse <> max(y)
		return true;
	}
	
	
	
	
	
}

