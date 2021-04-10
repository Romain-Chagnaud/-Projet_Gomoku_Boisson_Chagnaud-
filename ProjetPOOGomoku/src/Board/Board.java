package Board;

import Game.HumanPlayer;
import Game.Match;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Board {

    public int size;
    public Color[][] board;
    Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Integer> Convertor;

    /**
     * Constructeur pour l'affichage du plateau de jeu.
     *
     * @param choixSize la taille du plateau choisie par l'utilisateur.
     */
    public Board(int choixSize) {

        this.size = choixSize;
        board = new Color[size][size];
        Convertor = new HashMap<>();

        for (int col = 0; col < size; col++) {
            Convertor.put(Character.toString((char) 65 + col), col);
        }

        // On met des caractères espace dans chaque cases pour l'initialisation du tableau
        for (int lig = 0; lig < size; lig++) {
            for (int col = 0; col < size; col++) {
                board[lig][col] = Color.NONE;
            }
        }

    }

    /**
     * Méthode responsable de l'affichage du plateau.
     *
     */
    public void display() {
        alphabet();
        System.out.println(" ");
        bar();
        afficherLignes();
        bar();
    }

    /**
     * Méthode responsable de l'affichage de la barre horizontale de séparation
     * entre chaque ligne du plateau de jeu.
     *
     */
    private void bar() {

        System.out.print("   " + "+");
        for (int c = 0; c < size; c++) {
            System.out.print("---");
        }
        System.out.println("+");
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
    }

    /**
     * Méthode responsable de l'affichage d'une ligne.
     *
     */
    private void afficherLignes() {

        // pour chaque row
        for (int r = 0; r < size; r++) {
            System.out.print(r + " ");
            // si le nb de la row à un seul char
            if (r <= 9) {
                System.out.print(" ");
            }
            System.out.print("|");
            // pour tout le contenu de la ligne
            for (int c = 0; c < size; c++) {

                Color toDisplay = this.board[r][c];

                if (null == toDisplay) {
                    System.out.print(" O ");
                } else {
                    switch (toDisplay) {
                        case NONE:
                            System.out.print("   ");
                            break;
                        case CROIX:
                            System.out.print(" X ");
                            break;
                        default:
                            System.out.print(" O ");
                            break;
                    }
                }
            }
            System.out.println("|");
        }
    }

    /**
     * Méthode permettant de connaitre le contenu d'une case.
     *
     * @param p la position de la case dont nous voulons connaitre le contenu.
     * @return la couleur contenue dans cette case.
     */
    public Color getContenuCase(Position p) {

        return board[p.row][p.col];
    }

    /**
     * Méthode responsable de l'ajout d'une nouvelle couleur dans une case du
     * plateau de jeu.
     *
     * @param p la position à laquelle on souhaite ajouter une nouvelle couleur.
     * @param player le joueur courant.
     */
    public void setContenuCase(Position p, HumanPlayer player) {

        this.board[p.col][p.row] = player.color;//player.color;
    }

    /**
     * Méthode permettant de déterminer si une position existe dans le plateau.
     *
     * @param p la position entrée par l'utilisateur dont il faut verifier
     * l'existence sur le plateau.
     * @return true si la position donnée est dans le plateau et false sinon.
     */
    public boolean estDansPlateau(Position p) {
        return (p.row < size && p.col < size && p.row >= 0 && p.col >= 0);
    }

    /**
     * Méthode permettant de voir si une position est valide.
     *
     * @param p la position entrée par l'utilisateur dont il faut voir si elle
     * est valide.
     * @return true si la position est valide et false sinon.
     */
    public boolean valide(Position p) {

        boolean ok = false;
        if (estDansPlateau(p)) {

            if (Match.tour == 0) {
                ok = true;

            } else if (getContenuCase(p) != Color.NONE) {
                ok = false;
                System.out.println("Choix invalide. Choisissez une autre position");
            } else {
                ok = getAdj(p);
                System.out.println(ok);
                if (ok == false) {
                    System.err.println("Choix invalide. Veuillez rejouer");
                }
            }

        }

        return ok;
    }

    /**
     * Méthode permettant de savoir si une position possède des cases adjacentes
     * occupées.
     *
     * @param pos la position à laquelle le joueur souhaite poser un pion.
     * @return true si une position adjacente est occupée par le pion d'un
     * joueur et false sinon.
     */
    private boolean getAdj(Position pos) {

        ArrayList<Position> neighbour = new ArrayList();

        Position tryOne = new Position(pos.col - 1, pos.row - 1);
        neighbour.add(tryOne);
        Position tryTwo = new Position(pos.col, pos.row - 1);
        neighbour.add(tryTwo);
        Position tryThree = new Position(pos.col + 1, pos.row - 1);
        neighbour.add(tryThree);
        Position tryFour = new Position(pos.col - 1, pos.row);
        neighbour.add(tryFour);
        Position tryFive = new Position(pos.col + 1, pos.row);
        neighbour.add(tryFive);
        Position trySix = new Position(pos.col - 1, pos.row + 1);
        neighbour.add(trySix);
        Position trySeven = new Position(pos.col, pos.row + 1);
        neighbour.add(trySeven);
        Position tryHeight = new Position(pos.col + 1, pos.row + 1);
        neighbour.add(tryHeight);

        return neighbour.stream().filter(p -> (estDansPlateau(p))).anyMatch(p -> (board[p.row][p.col].equals(Color.CROIX) || board[p.row][p.col].equals(Color.ROND)));
    }
}
