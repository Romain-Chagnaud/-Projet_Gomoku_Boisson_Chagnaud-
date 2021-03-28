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

    private int Coll;
    private int Ligne;
   

    public Board(int col, int lig) {
        this.Coll = col;
        this.Ligne = lig;
    }

    public void dessin() {
        for (int x = 0; x < Coll; x++) {
            System.out.println("+" );
            for (int y = 0; y < Ligne; y++) {
                System.out.println("|");
            }
            System.out.println("-");

        }

    }

}
