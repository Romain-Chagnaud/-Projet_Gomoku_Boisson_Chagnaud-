package Game;

import Board.Board;
import Board.Color;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match{ //implemte deux player

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    String name;
    Scanner scanner;
    Color color;
    Board board;
   

    public Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = board;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }


    /**
     * Méthode responsable du dialogue avec les joueurs.
     */
   
    public void run() {
        // Board b = new board()
        joueur1 = new HumanPlayer(scanner, color);
        joueur2 = new HumanPlayer (scanner, color);
        board = new Board(10);
        Match match = new Match(joueur1, joueur2, board);
        
        

    }

}
