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
import java.awt.Dialog;
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

        Board b = new Board(5);

        b.display();
        dialogueJoueur();

        // créer une nouvealle instatnce de match et lancer le run
    }
    Scanner scanner = new Scanner(System.in);

    /**
     * Méthode reponsable du dialogue avec les joueurs.
     */
    public static void dialogueJoueur() {

        Position p;

        HumanPlayer joueur1 = new HumanPlayer("bob", Color.BLACK);
        HumanPlayer joueur2 = new HumanPlayer("bibi", Color.WHITE);

        /*
        HumanPlayer joueur1 = new HumanPlayer(name, Color.BLACK);
        HumanPlayer joueur2 = new HumanPlayer(HumanPlayer.name, Color.WHITE);
         */
        Game.HumanPlayer.createHumanPlayers();

        System.out.println(" " + joueur1.name + " choisissez la position du pion");
        

        /*
        On demande de choisir au joueur 1 la position du pion qu'il veut placer
        On garde en memeoire cette position pour pouvoir la réutiliser dans l'appel à play.
        
         */
        // on crée de nouveaux joueurs.
        //on crée des noms
        //
        /*System.out.println("Entrez le nom du premier joueur");
        joueur1.name = scanner.next();

        System.out.println("Entrez le nom du deuxième joueur");
        joueur2.name = scanner.next();
         */
// nouvelle instance de position qu'on demande et lit puis utilise dans play        
// appel à play
    }

    // reussir a faire l'appel à dialogue dans le main
}
