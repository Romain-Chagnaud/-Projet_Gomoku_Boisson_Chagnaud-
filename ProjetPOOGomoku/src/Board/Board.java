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
public class Board {

    private final int Cols, Rows;

    public Board(int lig, int col) {
        this.Cols = col;
        this.Rows = lig;
    }

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
                System.out.print("     ");
            }

            System.out.println("|");
        }
        Bar();
    }

    /**
     * affiche l'image
     */
    private void Bar() {

        System.out.print("   " + "+");
        for (int c = 0; c < Cols; c++) {
            System.out.print("-----");
        }
        System.out.println("+");
    }

    private void alphabet() {
        for (int c = 0; c < Cols; c++) {
            System.out.print("    " + (char) ('A' + c));
        }
    }
}
