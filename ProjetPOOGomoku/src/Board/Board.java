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

    private final int Cols, Rows;
    private final char[][] image;

    public Board(int lig, int col) {
        this.Cols = col;
        this.Rows = lig;
        this.image = new char[col][lig];
    }
    
    
    public void display() {
        displayBar();
        for (int r = 0; r < Rows; r++) {
            System.out.print("|");
            for (int c = 0; c < Cols; c++) {
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
        for (int c = 0; c < Cols; c++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
}
