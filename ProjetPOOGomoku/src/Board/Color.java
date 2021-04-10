package Board;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public enum Color {

    /**
     *
     */
    ROND {
        @Override
        public String toString() {
            return " O ";
        }
    },// rond

    CROIX {
        @Override
        public String toString() {
            return " X ";
        }
    },// croix

    NONE {
        @Override
        public String toString() {
            return "   ";
        }
    };

}
