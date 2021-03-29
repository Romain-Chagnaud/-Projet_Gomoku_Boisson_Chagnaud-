/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.util.ArrayList;

/**
 *
 * @author romai
 */
public class Board extends Game {

    private final int nbCols, nbRows;
    private final char[][] image;

    public Board(int lig, int col) {
        this.nbCols = lig;
        this.nbRows = col;
        this.image = new char[col][lig];
    }

    /* int b = 0;
        int c = 0;

        for (int y = 0; y < 1; y++) {
            System.out.print("+");

            for (int x = 0; x < Coll; x++) {
                System.out.print("-");
            }
            System.out.println("+");
        }

        for (int z = 0; z < Ligne; z++) {
            System.out.print("|");
            for (int a = 0; a < Coll; a++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for (int y = 0; y < 1; y++) {
            System.out.print("+");
            for (int x = 0; x < Coll; x++) {
                System.out.print("-");
            }
            System.out.println("+");

        }*/
    public void display() {
        displayBar();
        for (int r = 0; r < nbRows; r++) {
            System.out.print("|");
            for (int c = 0; c < nbCols; c++) {
                System.out.print(image[c][r]);
            }
            System.out.println("|");
        }
        displayBar();
    }

    /**
     * affiche l'image
     */
    private void displayBar() {
        System.out.print("+");
        for (int c = 0; c < nbCols; c++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
