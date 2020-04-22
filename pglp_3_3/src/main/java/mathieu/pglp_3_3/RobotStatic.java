package mathieu.pglp_3_3;

/**
 * Robot qui possède une position qui ne change pas.
 */
public class RobotStatic extends Robots {
    /**
     * position du robot dans un plan 2D.
     */
    @SuppressWarnings("unused")
    private final Position position;
    /**
     * constructeur de la classe.
     * @param x position du robot en abscisse
     * @param y position du robot en ordonnée
     */
    public RobotStatic(final int x, final int y) {
        position = new Position(x, y);
    }
}
