package Game;

import Board.Board;
import Board.Color;
import Board.Position;
import Game.HumanPlayer;
import Board.Game;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match { //implemte deux player

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    String name;
    Scanner scanner = new Scanner(System.in);
    Color color;
    Board board;
    int lig;
    int col;

    public Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = board;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    /**
     * Méthode responsable du dialogue avec les joueurs.
     */
    public void run(Board b, HumanPlayer joueur1, HumanPlayer joueur2) {

 
        b.display(); // on affiche le plateau

    }

}
