package com.tache02.test;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 * <CENTER><font size="6">Classe Main pour tester le programme</font></CENTER>
 * @author Malek ilyes
 * @version 1.0
 * Another Comment
 *
 */
public class Main {
	
		
	/**
	 * Appeler cette M�thode Pour Cr�er une Liste ( {@link LinkedList} ) Al�atoire d'entiers , d'un nombre de {@link Noeud} Donn�
	 * @param taille Entier
	 * @param L  {@link LinkedList}
	 */
	public static void ListeAl�atoire(int taille,LinkedList L){ 
		
        for (int i=0;i!=taille;i++)
        	L.AjouterFin(1+ ThreadLocalRandom.current().nextInt(1, 10 + 1)); /* Entier Al�atoir entre 1 et 10 */
        
	}
	/**
	 * Your Test Code Goes Here ...
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Pour ce test on va cr�er une liste Al�atoire L d'entiers dont la taille est Fourni par L'utilisateur, et Une liste L1 contenant un noeud\nEntrer la taille SVP : ");
		
		LinkedList L=new LinkedList(); 
		LinkedList L1= new LinkedList(1+ ThreadLocalRandom.current().nextInt(1, 10 + 1));
		
		ListeAl�atoire(sc.nextInt(),L); 

        System.out.println("\nLa liste resultante L est :"); L.AfficherListe(); 
        System.out.println("\n\nLa liste L1 est :"); L1.AfficherListe();
        System.out.print("\n\nEntrer un nombre pour l'ajouter au Debut : "); 
        int n=sc.nextInt();
        
        L.AjouterDebut(n); 
        L1.AjouterDebut(n);
        System.out.println("\nLa liste L Apr�s L'ajout de " +n+ " Au debut est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Apr�s L'ajout de " +n+ " Au debut est :"); L1.AfficherListe();
        
        System.out.print("\n\nEntrer un nombre pour l'ajouter a la Fin : "); 
        n=sc.nextInt();
        
        L.AjouterFin(n); 
        L1.AjouterFin(n);
        System.out.println("\nLa liste L Apr�s L'ajout de " +n+ " A la fin est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Apr�s L'ajout de " +n+ " A la fin est :"); L1.AfficherListe();
        
        
        System.out.print("\n\nLa taille de liste L Apr�s L'ajout des elements est de : "+L.getTaille()+" Noeuds");
        System.out.print("\n\nLa taille de liste L1 Apr�s L'ajout des elements est de : "+L1.getTaille()+" Noeuds");
        
        System.out.print("\n\nEntrer un nombre pour Supprimer sa premiere occurence  : "); 
        n=sc.nextInt();
        
        L.Supprimer(n); 
        L1.Supprimer(n);
        System.out.println("\nLa liste L Apr�s La Suppression de la 1ere Occurence de " +n+ " est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Apr�s La Suppression de la 1ere Occurence de " +n+ " est :"); L1.AfficherListe();
        
        System.out.print("\n\nEntrer un nombre pour Supprimer tous ses occurences  : "); 
        n=sc.nextInt();
        
        L.SupprimerTout(n); 
        L1.SupprimerTout(n);
        System.out.println("\nLa liste L Apr�s La Suppression de tous les Occurences de " +n+ " est :");L.AfficherListe();
        System.out.println("\n\nLa liste L1 Apr�s La Suppression de tous les Occurences de " +n+ " est :");L1.AfficherListe();
        
        
        System.out.print("\n\nLa taille de liste L Apr�s Les Suppressions effectu�es est de : "+L.getTaille()+ " Noeuds");
        System.out.print("\n\nLa taille de liste L1 Apr�s Les Suppressions effectu�es est de : "+L1.getTaille()+ " Noeuds");
        System.out.print("\n\nLe Premier element de la liste L est : "+L.getTete().getValeur()+ " L'�lement qui le suit: " + ((L.getTete().getSuivant()!=null) ? +L.getTete().getSuivant().getValeur() : "N'existe pas"));
        System.out.print("\n\nLe Premier element de la liste L1 est : "+L1.getTete().getValeur()+ " L'�lement qui le suit: " + ((L1.getTete().getSuivant()!=null) ? +L1.getTete().getSuivant().getValeur() : "N'existe pas"));
       
        /* La condition dans le print precedent est pour g�rer l'exception ou la Liste contient un seul Noeud */
        
        System.out.print("\n\nLe Dernier element de la liste L est : "+L.getQueue().getValeur());
        System.out.print("\n\nLe Dernier element de la liste L1 est : "+L1.getQueue().getValeur());
        
	}

}
