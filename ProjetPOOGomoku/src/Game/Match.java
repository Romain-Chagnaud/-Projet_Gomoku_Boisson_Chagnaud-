package Game;

import Board.Board;
import Board.Color;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match{ //implemte deux player

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    String name;
    Color color;
    Board board;
   

    Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = board;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }


    /**
     * Méthode responsable du dialogue avec les joueurs.
     */
   
    public void run() {
        /* Board b = new board()
        Match match = new Match(joueur1, joueur2, board);*/
       //boucle de jeu 
       
       
    }

}
