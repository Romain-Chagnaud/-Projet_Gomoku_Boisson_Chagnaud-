/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

/**
 *
 * @author manon
 */
public class Position {

    public int row;
    public int col;

    Board board = new Board(row, col);

    Position(int row, char col) { // la position c'est un nombre et un lettre 
        this.row = row;
        this.col = col;
    }

    /**
     * Méthode indiquant le nombre de cases voisines occupées
     *
     * @param p la position de la case dont on veut connaitre le nombre de cases
     * voisines occupées.
     * @return le nombre de cases voisines occupées.
     */
    public static int voisines(Position p) {

        int nbVoisines = 0;

        if (p.row + 1 != 0 || p.row - 1 != 0 || p.col + 1 != 0 || p.col - 1 != 0) {
            nbVoisines += nbVoisines;
        }

        if (p.row + 1 != 0 && p.row + 1 != 0 || p.col + 1 != 0 && p.col - 1 != 0) {
            nbVoisines = nbVoisines + 2;
        }

        return nbVoisines;

    }

    public static boolean caseVide(Position p) {
        boolean caseVide = false;

        if (p.row == 0 && p.col == 0) {
            caseVide = true;

        }
        return caseVide;

    }

    //Trouver un moyen de factoriser ces trois methodes pour eviter la duplication de code
    /**
     * Méthode indiquant si 5 pions sont alignés sur une ligne.
     *
     * @return true si 5 pions sont alignés sur une ligne et false sinon.
     */
    public static boolean rowComplete(Position p, Board b) {
        //tant que est complet est faux pour chaque ligne on parcourt les colonnes, tant que nb pions < 5 on continue

        boolean estComplet = false;
        int nbPions = 0;

        while (estComplet == false) {
            for(int i = 0; i < b.rows; i++) {
                if(b.cols != 0) {
                    nbPions += nbPions;
                }
                if (nbPions == 5) {
                    estComplet = true;
                }
            }
        }
        return estComplet;
    }

    /**
     * Méthode indiquant si 5 pions sont alignés sur une colonne.
     *
     * @return true si 5 pions sont alignés sur une colonne et false sinon.
     */
    public static boolean colComplete() {
        return true;
    }

    /**
     * Méthode indiquant si 5 pions sont alignés sur une diagonale.
     *
     * @return true si 5 pions sont alignés sur une diagonale et false sinon.
     */
    public static boolean diagComplete() {
        return true;
    }

    /**
     * Méthode qui permet de prendre la position de la colonne.
     *
     * @return la colonnes choisis.
     */
    public int Col() {
        return this.col;
    }
}
