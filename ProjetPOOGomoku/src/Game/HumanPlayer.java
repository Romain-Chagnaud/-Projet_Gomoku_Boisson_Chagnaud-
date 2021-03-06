package Game;

import Board.Board;
import Board.Color;
import Board.Position;
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
     * @param appelNomJoueur le nom du joueur que l'utilisateur choisit.
     * @param color la couleur assiciée à un joueur.
     */
    public HumanPlayer(Scanner appelNomJoueur, Color color) {
        this.color = color;
        System.out.println("Choisissez le nom du joueur");
        this.name = this.scanner.nextLine();
    }

    /**
     * Méthode permettant à l'utilisateur de choisir la position d'un pion.
     *
     * @param b plateau de jeu.
     * @return la position choisie par le joueur.
     */
    @Override
    public Position choice(Board b) {
        Position p = null;

        Scanner scan = new Scanner(System.in);
        boolean choiceValide = false;

        while (!choiceValide) {
            System.out.println("Position :");
            try {
                String message = scan.nextLine().trim();
                p = new Position(message);
                if (b.valide(p) == true) {
                    choiceValide = true;
                } else if (b.valide(p) == false) {
                    choiceValide = false;
                    System.out.println("Choisissez une position valide");

                }

            } catch (Exception e) {
                System.out.println("Choisissez une position valide");
                scan.nextLine();
            }

        }

        return p;
    }

    public Position caseCourante(Position p) {
        int lig = p.row;
        int col = p.col;
        return p;

    }

}
