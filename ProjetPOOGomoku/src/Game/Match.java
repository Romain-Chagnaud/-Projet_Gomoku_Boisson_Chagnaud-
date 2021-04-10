package Game;

import Board.Board;
import Board.Color;
import Board.Position;
import Board.Game;
import java.util.ArrayList;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match {

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    Color color;
    Board board;
    ArrayList<Position> coupsJoues;
    public static int tour;

    /**
     * Constructeur de la classe Match.
     *
     * @param joueur1 un joueur.
     * @param joueur2 un autre joueur.
     * @param b un plateau de jeu.
     */
    public Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = b;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.tour = 0;
    }

    /**
     * Méthode responsable de l'execution d'une partie entre deux joueurs.
     */
    public void run() {

        Game g = new Game(board, coupsJoues);

        Position p;
        HumanPlayer player = joueur1;
        HumanPlayer player2 = joueur2;

        boolean end = false;

        while (!end) { // Tant que la partie n'est pas finie.

            p = joueur1.choice(board);
            g.play(board, p, joueur1);
            tour++;

            p = joueur2.choice(board);
            g.play(board, p, joueur2);
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
