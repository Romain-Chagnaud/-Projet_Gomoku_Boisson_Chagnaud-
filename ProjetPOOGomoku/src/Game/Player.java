package Game;

import Board.Position;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public interface Player {
    //appelle les deux player dans match,

    Position choice(Board.Board b);
}
