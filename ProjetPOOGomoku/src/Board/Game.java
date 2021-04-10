package Board;

import Game.HumanPlayer;
import java.util.ArrayList;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Game {

    Color nextPlayer;
    Board board;
    ArrayList<Position> coupsJoues;

    /**
     * Constructeur de la classe Game
     *
     * @param board le plateau de jeu.
     * @param coupsJoues la liste des coups joués.
     */
    public Game(Board board, ArrayList<Position> coupsJoues) {
        this.board = board;
        this.coupsJoues = coupsJoues;

    }

    /**
     * Méthode responsable de la pose d'un pion sur le plateau.
     *
     * @param b le plateau de jeu.
     * @param p la position à laquelle le joueur souhaite poser un pion.
     * @param player le joueur courant.
     */
    public void play(Board b, Position p, HumanPlayer player) {
        b.setContenuCase(p, player);
        b.display();
    }

    /**
     * Méthode indiquant si une partie est finie ou non.
     *
     * @param p une position du plateau de jeu.
     * @param b le plateau de jeu.
     * @param player le joueur courant.
     * @return true si la partie est finie et false sinon.
     */
    public boolean partieFinie(Position p, Board b, HumanPlayer player) {

        p = player.caseCourante(p);

        boolean partieFinie = false;
        if (Position.rowComplete(b, p.row) || Position.colComplete(b, p.col) || Position.diagComplete(b)) {
            partieFinie = true;
        } else {
            partieFinie = false;
        }
        return partieFinie;
    }

}
