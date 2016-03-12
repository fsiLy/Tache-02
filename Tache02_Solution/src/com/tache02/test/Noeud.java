package com.tache02.test;


/**
 * <CENTER><font size="6">Cette Classe est Pour les Noeuds</font></CENTER>
 *
 */
public class Noeud {
	
	
		/**
		 * Champ Valeur : Entier
		 */
		private int Valeur ;
		/**
		 * Champ Suivant : Reference vers le Noeud suivant
		 */
		private Noeud Suivant ;
		
	
		
		
		
		/**
		 * Constructeur Par Defaut(Vide)
		 */
		public Noeud(){
			Valeur=0;
			Suivant=null;
		}  
		
		
		
		/**
		 * Constructeur d'intialisation de Valeur.
		 * @param Valeur  Entier
		 */
		public Noeud(int Valeur){
			this.Valeur=Valeur;
			Suivant=null;
		}
		
		/**
		 * Constructeur d'intialisation des Champs : Valeur,Suivant .
		 * @param Valeur  Entier
		 * @param Suivant {@link Noeud}
		 */
		public Noeud(int Valeur, Noeud Suivant){
			this.Suivant=Suivant;
			this.Valeur=Valeur;
			
		}
		
	
		
		/**
		 * Selecteur qui retourne la Valeur du Noeud utilisé
		 * @return Valeur : Entier
		 */
		public int getValeur(){
			return Valeur;
			
		}
		/**
		 * Mutateur qui Modifie la valeur du Noeud utilisé
		 * @param Valeur Entier
		 */
		public void setValeur(int Valeur){
			this.Valeur=Valeur;
			
		}
		/**
		 *  Selecteur qui retourne la reference du Noeud Suivant
		 * @return Suivant : {@link Noeud}
		 */
		public Noeud getSuivant(){
			return Suivant;
			
		}
		/**
		 * Mutateur qui Modifie la reference du Noeud Suivant Dans le Noeud utilisé
		 * @param Suivant {@link Noeud}
		 */
		public void setSuivant(Noeud Suivant){
			this.Suivant=Suivant;
			
		}

}
