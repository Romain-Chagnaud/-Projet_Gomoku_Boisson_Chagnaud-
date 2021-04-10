/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Board.Position;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public interface Player {
    //appele les deux payer dans match,
    
    Position choice(Board.Board b, int tours);
}
