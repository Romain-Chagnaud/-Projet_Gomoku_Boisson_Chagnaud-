/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Board.Board;
import Board.Color;
import Board.Position;
import Game.HumanPlayer;
import Game.Match;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class ProjetPOOGomoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // création des instances pour lancer le match
        Scanner scanner = new Scanner(System.in);
        Color color = Color.NONE;
        int choix = choisirTaille();
        Board board = new Board(choix);
        HumanPlayer joueur1 = new HumanPlayer(scanner, Color.CROIX);
        HumanPlayer joueur2 = new HumanPlayer(scanner, Color.ROND);

        Match m = new Match(joueur1, joueur2, board);// On crée un match.
        board.display();
        m.run(); //On lance une partie.

    }

    /**
     * Méthode permettant à l'utilisateur de choisir la taille du plateau de
     * jeu.
     *
     * @return la taille du plateau de jeu.
     */
    public static int choisirTaille() {
        int i = 0;
        Scanner in = new Scanner(System.in);
        boolean valide = false;
        while (!valide) {
            System.out.println("Choisir taille plateau : ");
            try {
                i = in.nextInt();
                valide = true;
            } catch (Exception e) {
                System.out.println("Cette taille de plateau n'est pas valide");
                in.nextLine();
            }
        }

        return i;
    }
}
