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
public class CreationPions { // je sais pas s'il faut faire des exceptions ici ? 

    public void printBoard(Board b) {
        for (int i = 0; i < b.size; i++) {
            for (int y = 0; y < b.size; y++) {

                if (b.board[i][y] == Color.BLACK.ordinal()) { // comparaison entre un int et une emnum
                    System.out.println("o");
                } else if (b.board[i][y] == Color.WHITE.ordinal()) {
                    System.out.println("x");
                }
                System.out.println();
            }
        }
    }
}
