/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Board.Color;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class HumanPlayer implements Player {

    public String name;
    Color color;

    /**
     * Constructeur de la classe HumanPlayer.
     *
     * @param name le nom d'un joueur
     * @param color la couleur d'un joueur.
     */
    public HumanPlayer(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    public static void createHumanPlayers() {
       
    }

}
