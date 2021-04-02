/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
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
     * @return true si le joueur peut poser son pion sur la position en
     * question.
     */
    private boolean play(Position p, Color color) {

        boolean play = false;

        if (coupsJoues.contains(p)) { // on verifie si le arrayList qui enregistre les coups joués contient la position à laquelle le joueur veut se placer

            play = false;
        } else if (Position.voisines(p) != 0 && Position.caseVide(p)) {

            posePion(p);// on ajoute un pion sur le plateur a la position demandé

            if (color == BLACK) {  // on change de joueur
                color = WHITE;
            } else {
                color = BLACK;
            }
            play = true;
        }

        return play;

    }

    /**
     * Méthode indiquant si une parite est finie ou non.
     *
     * @param p une position du plateau de jeu.
     * @return true si la partie est finie
     */
    public boolean partieFinie(Position p) {
        if (Position.rowComplete() || Position.colComplete() || Position.diagComplete()) {
            return true;
        } else {
            return false;
        }

    }


    /**
     * Méthode responsable de la pose d'un pion sur le plateau
     *
     * @param p la position à laquelle le joueur souhaite poser son pion.
     */

     public void posePion(Position p) {

    }

    // pose de pion
    // on ajoute un symbole a la position p

}

