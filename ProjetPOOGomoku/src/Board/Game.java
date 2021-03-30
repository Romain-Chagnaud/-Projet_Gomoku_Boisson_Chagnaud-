/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author romai
 */
public class Game {

    Color nextPlayer;
    Board board;
    ArrayList<Position> coupsJoues;

    /**
     * Constructeur de Game
     *
     * @param nextPlayer indique le joueur qui doit jouer le prochain coup.
     * @param board contient l'état d plateau
     * @param coupsJoues la liste des coups joués.
     */
    public Game(Color nextPlayer, Board board, ArrayList<Position> coupsJoues) {
        this.nextPlayer = nextPlayer;
        this.board = board;
        this.coupsJoues = coupsJoues;
    }

    
    /**
     * Méthode qui indique si il est possible pour un joueur de placer un pion à
     * une certaine position.
     *
     * @param p la position à laquelle le joueur veut placer son pion
     * @return true si le joueur peu poser son pion sur la position en question.
     */
    private boolean play(Position p) {

        boolean play;
        Color color;

        if (coupsJoues.contains(p)) { // on verifie si le arrayList qui enregistre les coups joués contient la position à laquelle le joueur veut se placer
            // on ajoute un pion sur le plateur a la position demandé
            // on change de joueur
            play = true;
        } else {
            play = false;
        }

        return true;

    }

    
    /**
     * Méthode indiquant si une parite est finie ou non.
     * @param p une position du plateau de jeu.
     * @return 
     */
    public boolean partieFinie(Position p) {
        // si toutes les cases sont occupées partie finie = true
        // si 5 pions sont alignés partie finie  = true.

        return false;

    }

    public void Test() {
        System.out.println("Hello word");
    }
}
