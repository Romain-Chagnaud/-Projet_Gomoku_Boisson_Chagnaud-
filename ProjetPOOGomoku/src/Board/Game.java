package Board;

import Game.HumanPlayer;
import java.util.ArrayList;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Game {

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
    public Game(Board board, ArrayList<Position> coupsJoues) {
        this.board = board;
        this.coupsJoues = coupsJoues;

    }

    /**
     * Méthode qui indique si il est possible pour un joueur de placer un pion à
     * une certaine position et place un pion si c'est le cas.
     *
     * @param b la plateau de jeu.
     * @param p la position à laquelle le joueur veut placer son pion
     * @param player le joueur courant.
     * @return true si le joueur peut poser son pion sur la position en
     * question.
     */
    public boolean play(Board b, Position p, HumanPlayer player) {

        //Color color;
       // boolean playPossible = false;
        //int lig = p.row;
        //int col = p.col;

        
        // while (partieFinie(p, b, player) == false) {
//if (coupsJoues.contains(p)) { // on verifie si le arrayList qui enregistre les coups joués contient la position à laquelle le joueur veut se placer
        //for (int i = 0; i < 9; i++) {
        //playPossible = false;
        /*}else */
        //if (Position.nbVoisines(p, player) != 0 && Position.caseVide(p)) {

            //Color nvlleCase = Color.NONE;

            // on ajoute un pion sur le plateur a la position demandé
            // ajouter la position a la liste
            /* if (player.color == Color.CROIX) {  // on change de joueur // black = croix
                    color = Color.ROND; // croix
                } else {
                    color = Color.ROND;
                }*/
            //playPossible = true;

            //}
        //}
        

        b.setContenuCase(p, player);
        //}
        // }
        //System.out.println("blablablablbalb");
        b.display();
        //System.out.println("sout du play");
        return true;
    }
    
    public void play2(Board currentBoard, Position pos, HumanPlayer player ){
        System.out.println(pos);
        currentBoard.setContenuCase(pos, player);
        System.out.println("Le coup à été joué, mtn on display");
        currentBoard.display();
    }

    /**
     * Méthode indiquant si une parite est finie ou non.
     *
     * @param p une position du plateau de jeu.
     * @param b le plateau de jeu.
     * @param player le joueur courant.
     * @return true si la partie est finie et false sinon.
     */
    public boolean partieFinie(Position p, Board b, HumanPlayer player) {

        p = player.caseCourante(p);

        // onn veut récupérer la position entrée par le joueur. pour initialiser p -> c'est surement ça qui fait qu'on demande deux fois la position dans l'affichage
        boolean partieFinie = false;
        if (Position.rowComplete(b, p.row) || Position.colComplete(b, p.col) || Position.diagComplete(b)) {
            partieFinie = true;
        } else {
            partieFinie = false;
        }
        return partieFinie;
    }

}
