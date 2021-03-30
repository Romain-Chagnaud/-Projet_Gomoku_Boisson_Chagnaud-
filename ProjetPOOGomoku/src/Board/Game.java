/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Board;
import Main.ProjetPOOGomoku;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author romai
 */
public class Game {
    
    Color nextPlayer;
    Board board;
    ArrayList<Position> coupsJoues;
    
    /**
     *
     * @param nextPlayer
     * @param board
     * @param coups
     */
    public Game (Color nextPlayer, Board board, ArrayList<Position> coupsJoues) {
        this.nextPlayer = nextPlayer;
        this.board = board;
        this.coupsJoues = coupsJoues;
    }
    
    public void Test(){
        System.out.println("Hello word");
}
}
