package mathieu.pglp_3_3;

/**
 * classe représentant une coordonnée sur un plan 2D
 * avec une valeur x et y.
 */
public class Position {
    /**
     * valeur de l'abscisse.
     */
    public int x;
    /**
     * valeur de l'ordonnée.
     */
    public int y;
    /**
     * constructeur de la classe avec initialisation.
     * des coordonnées à x = 0 et y = 0.
     */
    public Position() {
        x = 0;
        y = 0;
    }
    /**
     * constructeur de la classe.
     * @param xP initialise x
     * @param yP initialise y
     */
    public Position(final int xP, final int yP) {
        this.x = xP;
        this.y = yP;
    }
    /**
     * convertit les coordonnées au format String.
     * @return représentation au format String de la classe
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
