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
	 * Appeler cette Méthode Pour Créer une Liste ( {@link LinkedList} ) Aléatoire d'entiers , d'un nombre de {@link Noeud} Donné
	 * @param taille Entier
	 * @param L  {@link LinkedList}
	 */
	public static void ListeAléatoire(int taille,LinkedList L){ 
		
        for (int i=0;i!=taille;i++)
        	L.AjouterFin(1+ ThreadLocalRandom.current().nextInt(1, 10 + 1)); /* Entier Aléatoir entre 1 et 10 */
        
	}
	/**
	 * Your Test Code Goes Here ...
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Pour ce test on va créer une liste Aléatoire L d'entiers dont la taille est Fourni par L'utilisateur, et Une liste L1 contenant un noeud\nEntrer la taille SVP : ");
		
		LinkedList L=new LinkedList(); 
		LinkedList L1= new LinkedList(1+ ThreadLocalRandom.current().nextInt(1, 10 + 1));
		
		ListeAléatoire(sc.nextInt(),L); 

        System.out.println("\nLa liste resultante L est :"); L.AfficherListe(); 
        System.out.println("\n\nLa liste L1 est :"); L1.AfficherListe();
        System.out.print("\n\nEntrer un nombre pour l'ajouter au Debut : "); 
        int n=sc.nextInt();
        
        L.AjouterDebut(n); 
        L1.AjouterDebut(n);
        System.out.println("\nLa liste L Après L'ajout de " +n+ " Au debut est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Après L'ajout de " +n+ " Au debut est :"); L1.AfficherListe();
        
        System.out.print("\n\nEntrer un nombre pour l'ajouter a la Fin : "); 
        n=sc.nextInt();
        
        L.AjouterFin(n); 
        L1.AjouterFin(n);
        System.out.println("\nLa liste L Après L'ajout de " +n+ " A la fin est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Après L'ajout de " +n+ " A la fin est :"); L1.AfficherListe();
        
        
        System.out.print("\n\nLa taille de liste L Après L'ajout des elements est de : "+L.getTaille()+" Noeuds");
        System.out.print("\n\nLa taille de liste L1 Après L'ajout des elements est de : "+L1.getTaille()+" Noeuds");
        
        System.out.print("\n\nEntrer un nombre pour Supprimer sa premiere occurence  : "); 
        n=sc.nextInt();
        
        L.Supprimer(n); 
        L1.Supprimer(n);
        System.out.println("\nLa liste L Après La Suppression de la 1ere Occurence de " +n+ " est :"); L.AfficherListe();
        System.out.println("\n\nLa liste L1 Après La Suppression de la 1ere Occurence de " +n+ " est :"); L1.AfficherListe();
        
        System.out.print("\n\nEntrer un nombre pour Supprimer tous ses occurences  : "); 
        n=sc.nextInt();
        
        L.SupprimerTout(n); 
        L1.SupprimerTout(n);
        System.out.println("\nLa liste L Après La Suppression de tous les Occurences de " +n+ " est :");L.AfficherListe();
        System.out.println("\n\nLa liste L1 Après La Suppression de tous les Occurences de " +n+ " est :");L1.AfficherListe();
        
        
        System.out.print("\n\nLa taille de liste L Après Les Suppressions effectuées est de : "+L.getTaille()+ " Noeuds");
        System.out.print("\n\nLa taille de liste L1 Après Les Suppressions effectuées est de : "+L1.getTaille()+ " Noeuds");
        System.out.print("\n\nLe Premier element de la liste L est : "+L.getTete().getValeur()+ " L'élement qui le suit: " + ((L.getTete().getSuivant()!=null) ? +L.getTete().getSuivant().getValeur() : "N'existe pas"));
        System.out.print("\n\nLe Premier element de la liste L1 est : "+L1.getTete().getValeur()+ " L'élement qui le suit: " + ((L1.getTete().getSuivant()!=null) ? +L1.getTete().getSuivant().getValeur() : "N'existe pas"));
       
        /* La condition dans le print precedent est pour gérer l'exception ou la Liste contient un seul Noeud */
        
        System.out.print("\n\nLe Dernier element de la liste L est : "+L.getQueue().getValeur());
        System.out.print("\n\nLe Dernier element de la liste L1 est : "+L1.getQueue().getValeur());
        
	}

}
