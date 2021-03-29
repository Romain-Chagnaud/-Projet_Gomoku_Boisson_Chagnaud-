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

    public Board(int lig, int col) {
        this.Cols = col;
        this.Rows = lig;
    }
    
    
    public void display() {
        for(int x = 0; x <Rows; x++){
            alphabet();
        }
        Bar();
        for (int r = 0; r < Rows; r++) {
            System.out.print("|");
            for (int c = 0; c < Cols; c++) {
                System.out.print(" "); 
            }
            System.out.println("|");
        }
        Bar();
    }

    /**
     * affiche l'image
     */
    private void Bar() {
        System.out.print("+");
        for (int c = 0; c < Cols; c++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
    private void alphabet(){
        for(char c ='a'; c <= 'z'; c++){
            System.out.println(c);
        }
    }
    
}
