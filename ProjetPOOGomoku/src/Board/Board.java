package Board;

import Game.HumanPlayer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Board {

    public int size;
    public Color[][] board; // je comprends pas le tableau a régler 
    Scanner scanner = new Scanner(System.in);

    /**
     * Constructeur pour l'affichage du plateau de jeu.
     *
     * @param size la taille du plateau ( le nombre de lignes et colonnes du
     * plateau).
     */
    public Board(Scanner choixSize) {

        this.size = size;
        System.out.println("Choisissez la taille du plateau de jeu");
        this.size = this.scanner.nextInt();

        board = new Color[size][size]; // une board est un tableau de dimention 2 d'entiers

        //    on met des 0 dans chaque cases du tableau.
        int lig, col;
        for (lig = 0; lig < size; lig++) {
            for (col = 0; col < size; col++) {
                board[lig][col] = Color.NONE;
            }
        }
    }

    /**
     * Méthode responsable de l'affichage du plateau.
     */
    public void display(Position p) {
        alphabet();
        System.out.println(" ");
        bar();
        afficherLigne(p);
        bar();

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

        System.out.print("   " + "+");
        for (int c = 0; c < size; c++) {
            System.out.print("---");
        }
        System.out.println("+");
    }
    //pour chaque indice du tableau o met en place une ligne de séparation horizontale

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
    private void afficherLigne(Position p) {

        for (int r = 1; r <= size; r++) {
            System.out.print(r + " ");
            if (r <= 9) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int c = 0; c < size; c++) {
                System.out.print(contenuLigne());
            }
            System.out.println("|");
        }
    }
    // pour chaque ligne on affiche son contenu

    /**
     * Méthode responsable de la gestion du contenu d'une ligne.
     *
     * @param lig la ligne dont on veut connaitre le contenu.
     * @return le contenu de cette ligne.
     */
    private Color contenuLigne() {

        Color contenu = Color.NONE;

        // le contenu d'une ligne c'est le contenu de chaque cases
        return contenu;
        // les caractères contenus dans chaque case
        // pour chaque case on fait appel a contenu case
        //on doit convertir le contenu des cases en String?
    }

    /**
     * Méthode permettant de connaitre le contenu d'une case.
     *
     * @param p la position de la case dont nous voulons connaitre le contenu.
     * @return le contenu de cette case.
     */
    public Color getContenuCase(Position p) {
        return board[p.row][p.col];
    }

    /**
     * Méthode responsable de l'ajout d'une nouvelle valeur dans une case, donc
     * de la pose d'un pion
     *
     * @param p la position à laquelle on souhaite ajouter une nouvelle valeur.
     * @param nvlleVal la nouvelle valeur que l'on souhaite ajouter.
     */
    public void setContenuCase(Position p, HumanPlayer player) {
        board[p.row][p.col] = player.color;

    }

    // on doit trouver le moyen d'associer une couleur à l'entier contenu dans une case
    // le contenu d'une case -> la couleur à une position donc son char
    /*
Le plateau:
C'est un tableau de deux dimentions d'entiers -> ok
c'est un tableau de taille -> ok
la taille du plateau peut varier de 5 à 26 -> ok
il est constitué d'entiers convertis en caractères qui représentent les couleurs ou symboles des joueurs ou de caractères espaces
aux positions ou il n'y a aucun pions.

l'affichage du plateau
on affiche d'abord un alphabet en ligne -> ok
ensuite pour chaque ligne on affiche: 
- une barre de séparation horizontale -> ok
- le numéro de cette ligne (qui commence à un) et le contenu de la ligne
pour chaque ligne on a le contenu de chaque case, donc le contenu de chaque colonne pour cette ligne
par le contenu, on veut dire le caractère associé au pion du joueur.
     */
}

// On demande le nom des joueurs -> ok
// On demande la taille du plateau -> ok
// on affiche le plateau -> ok
// boucle partie non finie
// On demande ou le joueur 1 veut poser
// On affiche le plateau
// On demande ou le joueur 2 vaut poser
// quand on sort de la boucle
// On affiche message aprtie finir
     // on affiche le nom du gagant
