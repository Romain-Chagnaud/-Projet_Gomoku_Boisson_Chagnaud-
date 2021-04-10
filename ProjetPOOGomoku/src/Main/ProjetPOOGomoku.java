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

        // création des instances pour le match
        Scanner scanner = new Scanner(System.in);
        Color color = Color.NONE;
        Board board = new Board(scanner);
        HumanPlayer joueur1 = new HumanPlayer(scanner, color);
        HumanPlayer joueur2 = new HumanPlayer(scanner, color);
        
      
        Match m = new Match(joueur1, joueur2, board);// on crée un match
        
        m.run(board, joueur1, joueur2); //on lance une partie
        

     // On demande le nom des joueurs -> ok
     // On demande la taille du plateau -> ok
     // on affiche le plateau -> ok
     
     // boucle partie non finie
     // On demande ou le joueur 1 veut poser
     // pose du pion avec play
     // On affiche le plateau
     // On demande ou le joueur 2 vaut poser
     // pose du pion avec play
     // on affiche le plateau
     
     // quand on sort de la boucle
     // On affiche message aprtie finir
     // on affiche le nom du gagant
     
 
    }

  
}
