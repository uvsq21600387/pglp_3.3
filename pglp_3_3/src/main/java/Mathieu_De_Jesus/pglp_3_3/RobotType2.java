package Mathieu_De_Jesus.pglp_3_3;

/**
 * type de robot ayant une vitesse pouvant être définie.
 */
public class RobotType2 extends Robot {
	/**
	 * vitesse du robot lorsqu'il avance.
	 */
	private final int vitesse;
	/**
	 * constructeur de la classe
	 * définit une vitesse pour le robot.
	 * @param vitesse vitesse du robot lorsqu'il avance
	 */
	public RobotType2(final int vitesse) {
		super();
		this.vitesse = vitesse;
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
