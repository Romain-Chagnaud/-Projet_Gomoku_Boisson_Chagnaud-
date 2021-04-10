package Board;

import Game.HumanPlayer;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Position {

    public int row;
    public int col;

    /**
     * Constructeur de la classe position.
     *
     * @param numRow le numéro d'une ligne
     * @param numCol le numéro d'une colonne.
     */
    public Position(int numRow, int numCol) { // la position c'est un nombre et un lettre 

        this.row = numRow;
        this.col = numCol;
    }

    /**
     * Constructeur pour la position d'un piont
     *
     * @param message coordonée écrite
     */
    public Position(String message) { // second constructeur
        this.row = rowToInt(Character.toString(message.charAt(0))); // prend le 1er caractère par ex dans A12 ça prends A
        this.col = colToInt(message.substring(1)); // prend le reste du code est retourn un string, meme ex 12    
    }

    /**
     * Méthode indiquant le nombre de cases voisines occupées
     *
     * @param p la position de la case dont on veut connaitre le nombre de cases
     * voisines occupées.
     * @param player le joueur courant.
     * @return le nombre de cases voisines occupées.
     */
    public static int nbVoisines(Position p, HumanPlayer player) {

        p = player.caseCourante(p);

        int nbVoisines = 0;

        if (p.row + 1 != 0 || p.row - 1 != 0 || p.col + 1 != 0 || p.col - 1 != 0) {
            nbVoisines += nbVoisines;
        }

        if (p.row + 1 != 0 && p.row + 1 != 0 || p.col + 1 != 0 && p.col - 1 != 0) {
            nbVoisines = nbVoisines + 2;
        }

        return nbVoisines;

    }

    /**
     * Méthode indiquant si une case est vide.
     *
     * @param p la position de la case dont on regarde le contenu.
     * @return
     */
    public static boolean caseVide(Position p) {
        boolean caseVide = false;

        if (p.row == 0 && p.col == 0) {
            caseVide = true;

        }
        return caseVide;

    }

    
    /**
     * Méthode indiquant si 5 pions sont alignés sur une ligne.
     *
     * @param b la plateau de jeu.
     * @param lig la ligne que l'on consulte.
     * @return true si 5 pions sont alignés sur une ligne et false sinon.
     */
    public static boolean rowComplete(Board b, int lig) {
        boolean estComplet = false;
        int col = 1;

        Position p = new Position(lig, 0);
        Position suivante = new Position(lig, col);

        while (estComplet) {
            for (int i = 0; i < b.size; i++) {
                for (int j = 0; j < b.size; j++) {
                    if (b.getContenuCase(p) == b.getContenuCase(suivante)) {
                        col += col;
                        if (col == 5) {
                            estComplet = true;
                        }
                    }

                }

            }
        }
        return estComplet;
    }

    /**
     * Méthode indiquant si 5 pions sont alignés sur une colonne.
     *
     * @param b le plateau de jeu.
     * @param col la colonne que l'on consulte.
     * @return true si 5 pions sont alignés sur une colonne et false sinon.
     */
    //tant que non complet, on parcourt pour chaque colonne on regarrde si chaque ligne est différent de null
    public static boolean colComplete(Board b, int col) {

        boolean estComplet = false;
        int lig = 1;
        Position p = new Position(0, col);
        Position suivante = new Position(lig, col);

        while (estComplet) {
            for (int i = 0; i < b.size; i++) {
                for (int j = 0; j < b.size; j++) {
                    if (b.getContenuCase(p) == b.getContenuCase(suivante)) {
                        lig += lig;
                        if (lig == 5) {
                            estComplet = true;
                        }
                    }
                }

            }
        }
        return estComplet;
    }

    /**
     * Méthode indiquant si 5 pions sont alignés sur une diagonale.
     *
     * @param b le plateau de jeu.
     * @return true si 5 pions sont alignés sur une diagonale et false sinon.
     */
    public static boolean diagComplete(Board b) {

        boolean estComplet = false;
        int lig = 1;
        int col = 1;
        Position p = new Position(lig, col);
        Position suivante = new Position(lig, col);

        while (estComplet) {
            for (int i = 0; i < b.size; i++) {
                for (int j = 0; j < b.size; j++) {
                    if (b.getContenuCase(p) == b.getContenuCase(suivante)) {
                        lig += lig;
                        col += col;
                        if (lig == 5) {
                            estComplet = true;
                        }
                    }
                }

            }
        }
        return estComplet;
    }
    
    
    

    
    /**
     * Méthode qui permet de prendre la position de la colonne.
     *
     * @return la colonnes choisis.
     */
    public int Col() {
        return this.col;
    }

    /**
     * Méthode permettant de convertir le caractère d'une ligne en entier.
     *
     * @param charAt la caractère que l'on veut convertir.
     * @return les caractères de la positions convertie en entier
     */
    private int rowToInt(String charAt) {
        //lever les exception 
        if(Board.Convertor.containsKey(charAt)){
             return Board.Convertor.get(charAt);
        }
       return 0;
    }

    /**
     * Méthode permettant de convertir le caractère d'une colonne en entier.
     *
     * @param subSequence la chaine de caractère de la colonne.
     * @return
     */
    private int colToInt(String subSequence) {
        //lever les exceptions
        /*try {
            /*if (Integer.toString(col).equals(subSequence)) {
                System.out.println(subSequence);
            }*/
        String s = "";
        if (subSequence.length() >= 1) {
            s = String.valueOf(subSequence.charAt(0));
            // Si on a un nombre à 2 chiffres
            
            // !! vous prenez ici nombre de n'importe quelle taile...
            // si le board fait 10 et que je met A234 ca va crash
            
            if (subSequence.length() > 1) {
                s = s.concat(String.valueOf(subSequence.charAt(1)));
            }

        }
        return Integer.parseInt(s);

        /* } catch (Exception e) { // il faut essayer de maitre InvalidPositionException
            System.out.println(e);
        }*/
        //return Integer.parseInt(subSequence); // permet de convertir un string en int 
    }
}
