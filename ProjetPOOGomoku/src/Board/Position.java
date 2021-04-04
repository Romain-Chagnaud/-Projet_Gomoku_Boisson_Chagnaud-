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

    private int ContenuCase(Position p) {
        return 0;
       //return board[p.row][p.col];
    }

    private static Position voisine(Position premiereCase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int row;
    public int col;

    Board board = new Board(6);

    Position(int numRow, int numCol) { // la position c'est un nombre et un lettre 
        this.row = numRow;
        this.col = numCol;
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
    public static boolean rowComplete(Board b, Color color, int lig) {
        //tant que est complet est faux pour chaque ligne on parcourt les colonnes,< 5 on continue
        /* quand on parcourt on choisis la preiere cas et on regarde si elle est vide 
        si elle est vide, est complet  = faux
        sinon, on regarde la couleur et on parcourt les 4 positions suivante de la ligne,
        si elles sont occupées par autre couleur alors estComplete = faux 
        si elles sont occupées par meme couleur alors est complet = vrai
        */
        boolean estComplet = false;
        int nbPions = 0;
        Position premiereCase = new Position (0, lig);

        while (estComplet  && lig < b.size) {
          /*  for ( int i = 0; i < 4; i++) {
                if(ContenuCase(premiereCase) != ContenuCase(voisine(premiereCase))) {
                    voisine(premiereCase) += voisine(premiereCase);
                }
            }
        }*/
        return estComplet;
    }

    /**
     * Méthode indiquant si 5 pions sont alignés sur une colonne.
     *
     * @return true si 5 pions sont alignés sur une colonne et false sinon.
     */
    //tant que non complet, on parcourt pour chaque colonne on regarrde si chaque ligne est différent de null
    /*public static boolean colComplete(Position p, Board b) {

        boolean estComplet = false;
        int nbPions = 0;
        
        while (estComplet == false) {
           // for(int j = 0; j < b.cols; j++) {
                
            }
        //}
*/
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
