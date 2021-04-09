package Board;

import Board.Color;
import Game.HumanPlayer;
import Game.Match;
import java.util.ArrayList;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Game {  // il faut voir mais pour moi il faut extend avec Board

    Color nextPlayer;
    Board board;
    ArrayList<Position> coupsJoues;

    /**
     * Constructeur de la classe Game
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
     * une certaine position et place un pion si c'est le cas.
     *
     * @param b la plateau de jeu.
     * @param p la position à laquelle le joueur veut placer son pion
     * @param color la couleur du joueur courant.
     * @param nextColor la valeur que le joueur courant souhaite jouer.
     * @return true si le joueur peut poser son pion sur la position en
     * question.
     */
    public boolean play(Board b, Position p, HumanPlayer player) {

        Color color;
        boolean play = false;

        while (partieFinie(p, b, player) == false) {

            if (coupsJoues.contains(p)) { // on verifie si le arrayList qui enregistre les coups joués contient la position à laquelle le joueur veut se placer

                play = false;
            } else if (Position.nbVoisines(p) != 0 && Position.caseVide(p)) {

                b.setContenuCase(p, player.color);// on ajoute un pion sur le plateur a la position demandé
                // ajouter la position a la liste
                if (player.color == Color.CROIX) {  // on change de joueur // black = croix
                    color = Color.ROND; // croix
                } else {
                    color = Color.ROND;
                }
                play = true;
                // inserer la demande de nouvelle position
            }

        }

        return play;
    }

    /**
     * Méthode indiquant si une parite est finie ou non.
     *
     * @param p une position du plateau de jeu.
     * @param b le plateau de jeu.
     * @return true si la partie est finie et false sinon.
     */
    public boolean partieFinie(Position p, Board b, HumanPlayer player) {

        p = player.choice(b);

        // onn veut récupérer la position entrée par le joueur. pour initialiser p
        boolean partieFinie = false;
        if (Position.rowComplete(b, p.row) || Position.colComplete(b, p.col) || Position.diagComplete(b)) {
            partieFinie = true;
        } else {
            partieFinie = false;
        }
        return partieFinie;
    }

    /*
    A regarder incohérence entre la valeur que le joueur souhaite jouer et sa couleur
    -> on  l'a déclaré comme un entier alors qu'il est censé déposer un char sur le plateau
    -> voir avec l'enum de Romain
    -> dans la classe play, on veut ajouter une vnlleval mais est -ce qu'on a réellement le choix de la val ?
     */
}
