/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        public String toString() {
            return " O ";
        }
    },// rond
   
    
    CROIX {
        public String toString() {
            return " X ";
        }
    },// croix
    
    
    NONE {
        public String toString() {
            return "   ";
        }
    };
    
   
    
    

}

