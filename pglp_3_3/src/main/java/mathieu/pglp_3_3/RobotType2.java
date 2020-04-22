package mathieu.pglp_3_3;

/**
 * type de robot ayant une vitesse pouvant être définie.
 */
public class RobotType2 extends Robot {
    /**
     * constructeur de classe avec position.
     * @param vitesseP vitesse du robot lorsqu'il avance
     * @param p une position de base
     */
    public RobotType2(final int vitesseP, final Position p) {
        super(p);
        this.vitesse = vitesseP;
    }
    /**
     * vitesse du robot lorsqu'il avance.
     */
    private final int vitesse;
    /**
     * constructeur de la classe
     * définit une vitesse pour le robot.
     * @param vitesseP vitesse du robot lorsqu'il avance
     */
    public RobotType2(final int vitesseP) {
        super();
        this.vitesse = vitesseP;
    }
    @Override
    /**
     * fais avancer le robot selon sa direction et sa vitesse.
     */
    public void avance() {
        switch (direction) {
        case Nord :
            position.y += vitesse;
        break;
        case Sud :
            position.y -= vitesse;
        break;
        case Ouest :
            position.x -= vitesse;
        break;
        case Est :
            position.x += vitesse;
        break;
        default :
        break;
        }
    }
}
