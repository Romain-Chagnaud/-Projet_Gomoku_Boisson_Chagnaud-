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
    String name;
    Scanner scanner = new Scanner(System.in);
    Color color;
    Board board;
    int lig;
    int col;
    ArrayList<Position> coupsJoues;

    public Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = board;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

        // Board b = new board()
        //joueur1! = new HumanPlayer(scanner, color);
        //joueur2 = new HumanPlayer(scanner, color);
        //board = new Board(10);
        //Match match = new Match(joueur1, joueur2, board);
     
        


    public void run(Board b, HumanPlayer joueur1, HumanPlayer joueur2) {

        Game g = new Game(color, board, coupsJoues);

        Position p;
        HumanPlayer player = joueur1;
        HumanPlayer player2 = joueur2;

        
        // tant que partie non finie on devraut boucler al dessus
        System.out.println("affichage demande joueur 1");
            p = joueur1.choice(b);
            System.out.println("on lance le play");
            g.play(b, p, joueur1);
            System.out.println("affichage demande joueur2");
            p = joueur2.choice(b);
            System.out.println("on relance le play");
            g.play(b, p, joueur2);

        // tant que la partie n'est pas finie
        // le joueur1 joue, des qu'il a posé une case le joueur 2 joue
        

    }

}
