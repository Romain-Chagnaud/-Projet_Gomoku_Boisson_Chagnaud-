package Board;

import Game.HumanPlayer;
import Game.Match;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Romain Chagnaud, Manon Boisson
 */
public class Board {

    public int size;
    public Color[][] board;
    Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Integer> Convertor;

    /**
     * Constructeur pour l'affichage du plateau de jeu.
     *
     * @param choixSize la taille du plateau choisie par l'utilisateur.
     */
    public Board(int choixSize) {

        this.size = choixSize;

        board = new Color[size][size]; // une board est un tableau de dimention 2 dde couleurs

        Convertor = new HashMap<>();
        for (int col = 0; col < size; col++) {
            Convertor.put(Character.toString((char) 65 + col), col); //
        }

        // on met des caractères espace dans chaque cases pour l'initialisation du tableau
        for (int lig = 0; lig < size; lig++) {
            for (int col = 0; col < size; col++) {
                board[lig][col] = Color.NONE;// peut être que notre tableau "vide" vient de la ?
            }
        }

    }

    /**
     * Méthode responsable de l'affichage du plateau.
     *
     */
    public void display() {// est -ce que c'est vraiment util d'avoir un parametre position
        alphabet();
        System.out.println(" ");
        bar();
        afficherLignes();
        bar();
    }

    /**
     * Méthode responsable de l'affihcage de la barre horizontale de séparation
     * entre chaque ligne du plateau de jeu.
     *
     */
    private void bar() {

        System.out.print("   " + "+");
        for (int c = 0; c < size; c++) {
            System.out.print("---");
        }
        System.out.println("+");
    }

    /**
     * Méthode permettant de générer l'alphabet qui s'affiche en haut du
     * tableau.
     */
    private void alphabet() {
        System.out.print("    ");
        for (int c = 0; c < size; c++) {
            System.out.print(" " + (char) ('A' + c) + " ");
        }
    }

    /**
     * Méthode responsable de l'affichage d'une ligne.
     *
     */
    private void afficherLignes() {

        // pour chaque row
        for (int r = 0; r < size; r++) {
            // premier espace
            System.out.print(r + " ");
            // si le nb de la row à un seul char
            if (r <= 9) {
                // deux espaces
                System.out.print(" ");
            }
            // barre de séparation
            System.out.print("|");
            // pour tout le contenu de la ligne
            for (int c = 0; c < size; c++) {

                Color toDisplay = this.board[r][c];

                if (null == toDisplay) {
                    System.out.print(" O ");
                } else {
                    switch (toDisplay) {
                        case NONE:
                            System.out.print("   ");
                            break;
                        case CROIX:
                            System.out.print(" X ");
                            break;
                        default:
                            System.out.print(" O ");
                            break;
                    }
                }
            }
            System.out.println("|");
        }
    }

    // pour chaque ligne on affiche son contenu
// pour chaque ligne on affiche son contenu
//    /**
//     * Méthode responsable de la gestion du contenu d'une ligne.
//     *
//     * @param lig la ligne dont on veut connaitre le contenu.
//     * @return le contenu de cette ligne.
//     */
//    private Color contenuLigne() {
//            
//             Color contenu = Color.NONE;
//            // le contenu d'une ligne c'est le contenu de chaque cases
//            return contenu;
//            // les caractères contenus dans chaque case
//            // pour chaque case on fait appel a contenu case
//            //on doit convertir le contenu des cases en String?
//        
//    }
    /**
     * Méthode responsable de la gestion du contenu d'une ligne.
     *
     * @param p une position de la ligne
     * @return le contenu de cette ligne.
     */
    private Color contenuLigne(Position p) {

        Color contenu = getContenuCase(p);

        // le contenu d'une ligne c'est le contenu de chaque cases
        return contenu;
        // les caractères contenus dans chaque case
        // pour chaque case on fait appel a contenu case
        //on doit convertir le contenu des cases en String?
    }

    /**
     * Méthode permettant de connaitre le contenu d'une case.
     *
     * @param p la position de la case dont nous voulons connaitre le contenu.
     * @return le contenu de cette case.
     */
    public Color getContenuCase(Position p) {

        //           Color contenu = Color.NONE;
//        while (board.length < size) {
//            contenu = board[p.row][p.col];
//        }
        return board[p.row][p.col];
    }

    /**
     * Méthode responsable de l'ajout d'une nouvelle valeur dans une case, donc
     * de la pose d'un pion
     *
     * @param p la position à laquelle on souhaite ajouter une nouvelle valeur.
     * @param player le joueur courant
     */
    public void setContenuCase(Position p, HumanPlayer player) {

        this.board[p.col][p.row] = player.color;//player.color;

    }

    /**
     * Boolean permettant de déterminer si une position existe dans le plateau
     *
     * @param p position donnée par le joueur à vérifier
     * @return si la position donnée est dans le plateau
     */
    public boolean estDansPlateau(Position p) {
        return (p.row < size && p.col < size && p.row >= 0 && p.col >= 0);
    }

    /**
     * Méthode permettant de voir si une position est valide
     *
     * @param p position donnée par le joueur
     * @param tours nombre de tours jouée
     * @return si possible de jouée ou pas
     */
    public boolean valide(Position p, int tours) {

        boolean ok = false;
        boolean end = false;
        if (estDansPlateau(p)) {

            if (tours == 0) {
                ok = true;
                tours ++;

                System.out.println("dans le if");

            } else {
                System.out.println("dans le else");
                ok = adjacent(p);
                System.out.println(ok);
                tours++;
                if (ok == false) {
                    System.err.println("Choix invalide. Veuillez rejouer");
                }
            }

        }
        
        return ok;
    }

    // au premier tour on puet posier si dans plateau et couleur.none
    // apres on peut poser si couleur.none et adj !=0

    /*
     *Boolean qui determine si une position existe dans le plateau
     *@param p la position à vérifier
     *return si la position en paramètre est dans le plateau
     */
    private Boolean adjacent(Position p) {
        Boolean présence = false;
        //regarde si il y'a bien un pion à coté 
        for (int i = p.row - 1; i < p.row + 2; i++) {
            for (int j = p.col - 1; j < p.col + 2;
                    j++) {
                Position x = new Position(i, j);
                //on regarde pas à l'exterieur du plateau
                if (estDansPlateau(x)) {
                    //si il y'a un pion adjacent
                    if (board[i][j] != Color.NONE //et si la position ciblée est libre
                            && board[p.row][p.col] == Color.NONE) {
                        présence = true;
                    }
                }
            }
        }

        return présence;
    }

    // on doit trouver le moyen d'associer une couleur à l'entier contenu dans une case
    // le contenu d'une case -> la couleur à une position donc son char
    /*
Le plateau:
C'est un tableau de deux dimentions d'entiers -> ok
c'est un tableau de taille -> ok
la taille du plateau peut varier de 5 à 26 -> ok
il est constitué d'entiers convertis en caractères qui représentent les couleurs ou symboles des joueurs ou de caractères espaces
aux positions ou il n'y a aucun pions.
     */
}

// On demande le nom des joueurs -> ok
// On demande la taille du plateau -> ok
// on affiche le plateau -> ok
// boucle partie non finie -> 
// On demande ou le joueur 1 veut poser
// On affiche le plateau
// On demande ou le joueur 2 vaut poser
// quand on sort de la boucle
// On affiche message aprtie finir
     // on affiche le nom du gagant
