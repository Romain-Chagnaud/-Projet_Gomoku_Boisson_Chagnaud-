/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Board.Board;
import Board.Color;
import Board.Position;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class HumanPlayer implements Player {

    public String name;
    public Color color;

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

    @Override
    public Position choice(Board b) {
        System.out.println("Position :");
        Scanner scan = new Scanner(in); 
        String message = scan.next().trim();
        Position p = null;
        try {
            p = new Position(message);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return p;
    }

}
