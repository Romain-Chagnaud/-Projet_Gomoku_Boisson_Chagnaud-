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
public class CréationPions{

    public void printBoard(Board b) {
        for (int i = 0; i < b.size; i++) {
            for (int y = 0; y < b.size; y++) {
                if (b.board[i][y] == Color.BLACK.ordinal()) {
                    System.out.println("o");
                } else {
                    System.out.println("x");
                }
                    System.out.println();
            }
        }
    }

}
