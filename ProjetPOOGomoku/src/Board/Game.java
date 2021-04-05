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
public class Game {  // il faut voir mais pour moi il faut extend avec Board

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
    private boolean play(Board b, Position p, Color color, int nvlleVal) {

        boolean play = false;

        if (coupsJoues.contains(p)) { // on verifie si le arrayList qui enregistre les coups joués contient la position à laquelle le joueur veut se placer

            play = false;
        } else if (Position.voisines(p) != 0 && Position.caseVide(p)) {

            posePion(b,p, nvlleVal);// on ajoute un pion sur le plateur a la position demandé
            // ajouter la position a la liste
            if (color == BLACK) {  // on change de joueur // black = croix
                color = WHITE; // croix
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
        return false;// ajouté pour la compilation du code
        /*  if (Position.rowComplete() || Position.colComplete() || Position.diagComplete()) {
            return true;
        } else {
            return false;
        }*/

    }

    /**
     * Méthode responsable de la pose d'un pion sur le plateau
     *
     * @param p la position à laquelle le joueur souhaite poser son pion.
     */
    public void posePion(Board b, Position p, int nvlleVal) {
        b.nouvelleValeur(p, nvlleVal); // on ajoute une nouvelle valeur à la position p.

    }
    
}
