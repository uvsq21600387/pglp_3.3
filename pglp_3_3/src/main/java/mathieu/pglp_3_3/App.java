package mathieu.pglp_3_3;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    /**
     * constructeur de la classe App.
     */
    private App() {
    }
    /**
     * début du programme.
     * @param args arguments donnés au démarrage de l'application
     */
    public static void main(final String[] args) {
        final int dix = 10;
        ArrayList<Robot> r = new ArrayList<Robot>();
        r.add(new RobotType1());
        r.add(new RobotType2(dix));
        Robot.avancerTous(r);
        for (Robot robot : r) {
            System.out.println(robot.position.toString());
        }
    }
}

