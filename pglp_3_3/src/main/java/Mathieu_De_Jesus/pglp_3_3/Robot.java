package Mathieu_De_Jesus.pglp_3_3;

/**
 * classe représentant la base d'un robot
 * avec une position et une direction vers laquelle avancer.
 */
public abstract class Robot {
	/**
	 * position du robot sur un plan (x,y).
	 */
	protected Position position;
	/**
	 * dans quelle direction le robot va avancer.
	 */
	protected Direction direction;
	/**
	 * constructeur de la classe,
	 * initialise la position : (0, 0)
	 * et la direction : Nord.
	 */
	public Robot() {
		position = new Position();
		direction = Direction.Nord;
	}
	/**
	 * constructeur de la classe avec une position de base.
	 * @param p initialise la position du robot à p
	 */
	public Robot(final Position p) {
		position = p;
	}
	/**
	 * fais avancer le robot (modifie sa position).
	 */
	public abstract void avance();
	/**
	 * tourne le robot dans le sens des aiguilles d'une montre.
	 */
	public void tourne() {
		switch (direction) {
		case Nord :
			direction = Direction.Est;
		break;
		case Sud :
			direction = Direction.Ouest;
		break;
		case Ouest :
			direction = Direction.Nord;
		break;
		case Est :
			direction = Direction.Sud;
		break;
		default :
		break;
		}
	}
	/**
	 * récupérer la position du robot.
	 * @return une copie de la position du robot
	 */
	public Position getPosition() {
		return new Position(position.x, position.y);
	}
}
