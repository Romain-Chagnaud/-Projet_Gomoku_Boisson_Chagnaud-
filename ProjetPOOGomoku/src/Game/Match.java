package Game;

import Board.Board;
import Board.Color;
import Board.Position;
import Game.HumanPlayer;
import Board.Game;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match { //implemte deux player

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    Color color;
    Board board;
    ArrayList<Position> coupsJoues;
    public static int tour;

    public Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = b;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.tour = 0;
    }

    // Board b = new board()
    //joueur1! = new HumanPlayer(scanner, color);
    //joueur2 = new HumanPlayer(scanner, color);
    //board = new Board(10);
    //Match match = new Match(joueur1, joueur2, board);
    public void run() {

        Game g = new Game(board, coupsJoues);

        Position p;
        HumanPlayer player = joueur1;
        HumanPlayer player2 = joueur2;

        boolean end = false;

        // tant que partie non finie on devraut boucler al dessus
        while (!end) {

            p = joueur1.choice(board);
            g.play2(board, p, joueur1);
            tour++;

            p = joueur2.choice(board);
            g.play2(board, p, joueur2);
            end = g.partieFinie(p, board, player);
            tour++;
            if (g.partieFinie(p, board, player) == true) {
                end = true;
            }
        }

        System.out.println("La partie est terminée.");
        System.out.println("Le gagnant est " + player);
    }

}
