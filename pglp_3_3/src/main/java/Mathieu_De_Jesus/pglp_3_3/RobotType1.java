package Mathieu_De_Jesus.pglp_3_3;

/**
 * un type de robot qui se déplace de 1 dans sa direction.
 */
public class RobotType1 extends Robot {
	@Override
	/**
	 * fait avancer le robot selon sa direction.
	 */
	public void avance() {
		switch (direction) {
		case Nord :
			position.y++;
		break;
		case Sud :
			position.y--;
		break;
		case Ouest :
			position.x--;
		break;
		case Est :
			position.x++;
		break;
		default :
		break;
		}
	}
}
