package com.tache02.test;

/**
 * <CENTER><font size="6">Cette Classe est Pour les Listes</font></CENTER>
 *
 */
public class LinkedList {
	
	
		/**
		 * Nombre des Noeuds
		 */
		private int taille;  
		/**
		 * Reference du Premier Element de la liste
		 */
		private Noeud Tete;
		/**
		 * Reference Du dernier element de la Liste
		 */
		private Noeud Queue;
		
	
		
		/**
		 * Constructeur d'une liste vide
		 */
		public LinkedList(){
			Tete= null;
			Queue=Tete;
			taille=0;
			
		}
		
		
		/**
		 * Constructeur d'une liste avec un seul {@link Noeud} contient une valeur 
		 * @param Valeur Entier
		 */
		public LinkedList(int Valeur){
			Tete= new Noeud(Valeur);
			Queue=Tete;
			taille=1;
		}
		
	
		
		/**
		 * Méthode pour Ajouter une Valeur à la fin de la liste
		 * On utilise le constructeur D'initialisation de valeur {@link Noeud#Noeud(int)}, et des Mutateurs/Selecteurs : {@link Noeud#setSuivant(Noeud)}/{@link Noeud#getSuivant()} de la classe {@link Noeud}
		 * @param Valeur Entier
		 * 
		 */
		
		public void AjouterFin(int Valeur){
			
			if (Tete==null){ 
				Tete=new Noeud(Valeur); 
				Queue=Tete; 
				taille++;
			}
			else{
			Queue.setSuivant(new Noeud(Valeur)); /* Ajout derriere Queue */
			Queue=Queue.getSuivant(); /* Avance d'un Noeud */
			taille++;
		}}
		
		
		/**
		 * Méthode pour Ajouter une Valeur au début de la liste
		 * On utilise le constructeur D'initialisation {@link Noeud#Noeud(int)} et {@link Noeud#Noeud(int, Noeud)} de la classe {@link Noeud}
		 * @param Valeur Entier
		 */
		public void AjouterDebut(int Valeur){
			if (Tete==null) /* CAS SPECIAL OU LA LISTE EST VIDE */
			{
				Tete=new Noeud(Valeur);
				Queue=Tete;
			}
			else
			Tete=new Noeud(Valeur,Tete); 
			
			taille++;
		}
		
		
		/**
		 * Méthode pour Supprimer le {@link Noeud} qui contient la premiere occurence d'une Valeur
		 * @param Valeur Entier
		 */
		public void Supprimer(int Valeur){
			Noeud courant=Tete;
			Noeud precedent=courant; 
			while(courant != null)
			{
				if (Tete.getValeur()==Valeur) /* CAS SPECIAL DE PREMIER ELEMENT */
				{ 
					Tete=Tete.getSuivant(); /* Nouvelle reference pour la tete */
					taille--;
					break; /* Finir "While" et Sortir */
				}
				else if (courant.getValeur()==Valeur)
				{
					precedent.setSuivant(courant.getSuivant()); /* liaison entre le noeud prec. et le noeud suivant du noeud supprimé */
					taille--;
					break; /* Sortir */
				}
				precedent=courant; /* On avance en sauvant le noeud precedent */
				courant=courant.getSuivant();
					
			}
		}
		
		
		/**
		 * Méthode pour Supprimer tous les {@link Noeud} qui contient "Valeur"
		 * On Parcours la liste( {@link LinkedList} ) jusqu'au bout , Avec deux {@link Noeud} Temporaires,
		 * a chaque fois qu'on trouve une occurence , On supprime .
		 * @param Valeur Entier
		 */
		public void SupprimerTout(int Valeur){
			Noeud courant=Tete;
			Noeud precedent=courant;
			while(courant != null)
			{
				if (Tete.getValeur()==Valeur){ /* Cas Special de Premier Element */
					Tete=Tete.getSuivant();
					taille--;
				}
				else if (courant.getValeur()==Valeur)
				{
					precedent.setSuivant(courant.getSuivant());
					taille--;
					courant=courant.getSuivant();
					continue; /*Continuer le Parcours en maintenant La reference du precedent(en cas ou le suivant du noeud supprimé contient aussi "Valeur" donc on Supprime les deux et on recupere la reference du suiv. du dernier noeud supprimé) */
					
				}
				
				precedent=courant;
				courant=courant.getSuivant();		
			}
			Queue=precedent; /* Fin du Parcours "Precedent" contient forcément la reference du "Queue" */
		}
		/**
		 * Méthode Pour Afficher tout les Elements de la liste.
		 */
		public void AfficherListe(){
			Noeud tmp=Tete;
			while (tmp != null){
				System.out.print(tmp.getValeur() + " ");
				tmp=tmp.getSuivant();
			}
		}
		
	
		/**
		 * Selecteur Qui retourne la taille de la liste .
		 * @return taille : Entier .
		 */
		public int getTaille(){
			return this.taille;
		}
		/**
		 * Selecteur Qui retourne Le Premier {@link Noeud} de la liste 
		 * @return Tete : {@link Noeud} .
		 */
		public Noeud getTete(){
			return this.Tete;
		}
		/**
		 * Selecteur Qui retourne Le Dernier {@link Noeud} de la liste 
		 * @return Queue : {@link Noeud}
		 */
		public Noeud getQueue(){
			return this.Queue;
			
		}

}
