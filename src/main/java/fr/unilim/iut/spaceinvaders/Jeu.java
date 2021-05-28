package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurjeu.Commande;

public interface Jeu {

	void evoluer(Commande commande);

	boolean etreFini(); 
}
