/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

/**
 *
 * @author romai
 */
public class Board {

    public int size;
    public int[][] board;

    /**
     * Constructeur pour l'affichage du plateau de jeu.
     *
     * @param size la taille du plateau ( le nombre de lignes et colonnes du
     * plateau).
     */
    public Board(int size) {

        this.size = size;
        board = new int[size][size]; // une board est un tableau de dimention 2 d'entiers

        // on met des 0 dans chaque cases du tableau.
        int lig, col;
        for (lig = 0; lig < size; lig++) {
            for (col = 0; col < size; col++) {
                board[lig][col] = 0;
            }
        }
    }

    /**
     * Méthode responsable de l'affichage du plateau.
     */
    public void display() {
        alphabet();
        System.out.println(" ");
        bar();
        for (int lig = 0; lig < size - 1; lig++) {
            afficherLigne(lig);
            bar();
        }

        // on affiche l'alphabet
        // on affiche un espace
        // on affiche la barre de séparation horizontale
        // pour chaque ligne, on affiche son contenu
        // on affiche une barre de séparation hoeirontale sous chaque ligne
        // afficherLigne(size - 1);
        //System.out.println("");
    }

    /**
     * Méthode responsable de l'affihcage de la barre horizontale de séparation
     * entre les lignes.
     */
    private void bar() {

        System.out.print("   ");
        for (int c = 0; c < size - 2; c++) {
            System.out.print("---+");
        }
        System.out.println("---");
        //pour chaque indice du tableau o met en place une ligne de séparation horizontale
    }

    /**
     * Méthode permettant de générer l'alphabet qui s'affiche en haut du
     * tableau.
     */
    private void alphabet() {

        System.out.print("    ");
        for (int c = 0; c < size; c++) {
            System.out.print(" " + (char) ('A' + c) + " ");
        }

        // on met en place un alphabet en associant un lettre donc un caractère à un entier
    }

    /**
     * Méthode responsable de l'affichage d'une ligne.
     *
     * @param lig la ligne qui doit être affichée.
     */
    private void afficherLigne(int lig) {
        for (lig = 0; lig < size - 1; lig++) {
            int numLig = lig;
        }
        System.out.println(" |" + contenuLigne(lig) + "|");
    }
    // pour chaque ligne on affiche son contenu
    
    
    
    
    /**
     * Méthode responsable de la gestion du contenu d'une ligne.
     * @param lig
     * @return 
     */
    private String contenuLigne(int lig) {
        String contenu = null;
        
       return contenu;        
    }
}
