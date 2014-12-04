public class Utilisateur extends Joueur {

	public Utilisateur(){

		super();

	}


	public boolean tir(Zone z){

		if(z.getEtat_zone() != etat.intact){
			/*pas d'exception c'est un comportement normal !*/

		}
		else{

			if(z.getNavire() == null){

				z.setEtat_zone(etat.rate);
				// Afficher raté à l'ecran 

				return false;
			}

			else {

				int valeur = z.getNavire().getRobustesse();
				valeur --;

				if(valeur ==0){

					//Afficher coulé à l'écran 
					z.setEtat_zone(etat.touche);
				}

				else {
					z.getNavire().setRobustesse(valeur);
					z.setEtat_zone(etat.touche);
				}

			}

		}
		return true;
			}


	public boolean placer(Orientation o, Navire n, Zone z){

		int a = z.getX();
		int b = z.getY();

		if(o == Orientation.vertical && a + n.getRobustesse() < 11){

			z.setNavire(n);
			n.setX(a);
			n.setY(b);

			return true;
		}

		else if(o == Orientation.horizontal && b + n.getRobustesse() < 11){

			z.setNavire(n);
			n.setX(a);
			n.setY(b);

			return true;
		}

		else { 


		}
			}

}
