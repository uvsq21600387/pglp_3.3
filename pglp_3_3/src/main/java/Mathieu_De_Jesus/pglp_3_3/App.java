package Mathieu_De_Jesus.pglp_3_3;

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
	 * fais avancer les robots dans la liste.
	 * @param r liste des robots à faire avancer
	 */
	public static void avancerTous(final ArrayList<Robot> r) {
		for (Robot robot : r) {
			robot.avance();
		}
	}
	/**
	 * début du programme.
	 * @param args arguments donnés au démarrage de l'application
	 */
    public static void main(final String[] args) {
    	ArrayList<Robot> r = new ArrayList<Robot>();
        r.add(new RobotType1());
        r.add(new RobotType2(10));
        avancerTous(r);
        for (Robot robot : r) {
			System.out.println(robot.position.toString());
		}
    }
}

