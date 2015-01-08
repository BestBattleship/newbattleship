package graphique.newbattleship.newbattleship;

import java.awt.GridLayout; 

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;

public class Fenetre extends JFrame implements ActionListener{
	public Fenetre(){

		this.setTitle("Grille");
		this.setSize(1200, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//Taille de la grille à 10
		this.setLayout(new GridLayout(10, 10));

		// Création des buttons

		for(int i=1; i<11; i++){
			for(int j=1; j<11; j++){
				
				final int k = i;
				final int l = j;
				
				final JButton ZoneXY = new JButton("" +i +"," +j); 
				ZoneXY.setName("" + i +j);
				ZoneXY.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent arg0) {

                     System.out.print("Tir en " +k +"," +l);
                     /* tir(zone z)*/
						
					}
			
				});
				
				this.getContentPane().add(ZoneXY);
                this.setVisible(true);
			}      
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

