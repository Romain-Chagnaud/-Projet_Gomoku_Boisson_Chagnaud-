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

    private final int Cols, Rows;

    /**
     * Constructeur permettant l'affichage de plateau
     * @param lig nombre de ligne sur le plateau
     * @param col nombre de colonne sur le plateau
     */
    public Board(int lig, int col) {
        this.Cols = col;
        this.Rows = lig;
    }

    /**
     * Code 
     */
    public void display() {
        alphabet();
        System.out.println(" ");
        Bar();

        for (int r = 1; r <= Rows; r++) {
            System.out.print(r + " ");
            if (r <= 9) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int c = 0; c < Cols; c++) {
                System.out.print("   ");
            }
            System.out.println("|");
        }
        Bar();
    }

    /**
     * affiche la barre "+----+"
     */
    private void Bar() {

        System.out.print("   " + "+");
        for (int c = 0; c < Cols; c++) {
            System.out.print("---");
        }
        System.out.println("+");
    }

    /**
     *
     */
    private void alphabet() {
        System.out.print("    ");
        for (int c = 0; c < Cols; c++) {
            System.out.print(" " +(char)('A' + c) + " ");
        }
    }
}
