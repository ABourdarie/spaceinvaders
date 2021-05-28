package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import fr.unilim.iut.spaceinvaders.*;

public class DessinSpaceinvader implements DessinJeu {

	private SpaceInvaders jeu;
	
	public DessinSpaceinvader(SpaceInvaders j) {
		this.jeu = j;
	}
	
	@Override
	public void dessiner(BufferedImage image) {
		SpaceInvaders j = (SpaceInvaders) jeu;
		Vaisseau vaisseau = j.getVaisseau();
		this.dessinerObjet("VAISSEAU", vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusHaute(), image);
	}

	private void dessinerObjet(String string, int abscisseLaPlusAGauche, int ordonneeLaPlusHaute, BufferedImage image) {
		// TODO Auto-generated method stub
		
	}

}
