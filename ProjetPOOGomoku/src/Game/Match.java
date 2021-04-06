package Game;

import Board.Board;
import Board.Color;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Match implements Player {

    HumanPlayer joueur1;
    HumanPlayer joueur2;
    String name;
    Color color;
    Board board;
    Scanner scanner = new Scanner(System.in);

    Match(HumanPlayer joueur1, HumanPlayer joueur2, Board b) {

        this.board = board;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }


    /**
     * Méthode responsable du dialogue avec les joueurs.
     */
    public void dialogueJoueur() {

        System.out.println("Entrez le nom du premier joueur");
        joueur1.name = scanner.next();

        System.out.println("Entrez le nom du deuxième joueur");
        joueur2.name = scanner.next();

// nouvelle instance de position qu'on demande et lit puis utilise dans play        
// appel à play
    }

    public void run() {
        // Board b = new board()
        Match match = new Match(joueur1, joueur2, board);

    }

}
