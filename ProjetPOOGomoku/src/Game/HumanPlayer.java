package Game;

import Board.Board;
import Board.Color;
import Board.Position;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class HumanPlayer implements Player {

    public String name;
    public Color color;

    Scanner scanner = new Scanner(System.in);

    /**
     * Constructeur de la classe HumanPlayer.
     *
     * @param appelNomJoueur nom du joueurs
     * @param color la couleur d'un joueur.
     */
    public HumanPlayer(Scanner appelNomJoueur, Color color) {
        this.color = color;
        // this.scanner = scanner;
        System.out.println("Choisissez le nom du joueur");
        this.name = this.scanner.nextLine();
    }

    /**
     * Méthode permettant de donner la position d'un pion
     *
     * @param b plateau de jeu.
     * @return la position choisi par le joueur
     */
    @Override
    public Position choice(Board b) {
        System.out.println("Position :");
        Scanner scan = new Scanner(in);
        String message = scan.nextLine().trim();
        Position p = null;
        //try {
            
            p = new Position(message);
           
        //} catch (Exception e) {
          //  System.out.println(e);
        //}

        return p;
    }

    public Position caseCourante(Position p) {
        int lig = p.row;
        int col = p.col;
        return p;
        // regarder la ligne et la colonne d'une position;

    }

}
