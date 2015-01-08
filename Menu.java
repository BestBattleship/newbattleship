package graphique.newbattleship;

import javax.swing.JButton;
import java.awt.event.*;


public class Menu implements ActionListener {
	
	// Création des deux boutons
	
	JButton Jouer = new JButton("Jouez !");
	JButton Aide = new JButton("Aide");

	public Menu(){
		
		// On initialise les listeners
		
		Jouer.addActionListener(this);
		Aide.addActionListener(this);
	}

	// Test si l'action est bien capturée
	
	public void actionPerformed(ActionEvent e){
		System.out.println("Test");

		// Ajout de la procédure à suivre si le joueur à cliquer sur un bouton
		
		// Si il clique sur jouer, afficher la fenetre de paramètres de jeu
		if(e.getSource() == Jouer){
		
		}
		// Si il clique sur Aide, afficher la pop-up d'aide
		else if(e.getSource() == Aide || e.getActionCommand() == Aide.getText()){
			javax.swing.JOptionPane.showMessageDialog(null,"Pour commencer une partie, cliquez sur le bouton Jouez!\n Puis choisissez vos options de partie, et amusez vous !"); 
		}
	}
}
