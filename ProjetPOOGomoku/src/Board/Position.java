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

    Position(int row, int col) {
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


}
