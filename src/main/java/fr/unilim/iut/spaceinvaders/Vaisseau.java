package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurjeu.Commande;
import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite {

	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		this.dimension = dimension;
		this.origine = positionOrigine;
		this.vitesse = vitesse;
	}

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		if (dimensionMissile.longueur > this.dimension.longueur) {
			throw new MissileException("Le missile est trop grand");
		}
			Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
			return new Missile(positionOrigineMissile, dimensionMissile, vitesseMissile);
		
	}

	public Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
		return positionOrigineMissile;
	}

	public void deplacer(Commande c) {
		if (c.gauche)
		{
			this.seDeplacerVersLaGauche();
		}

		if (c.droite)
		{
			this.seDeplacerVersLaDroite();
		}
	}
		

}
