package Mathieu_De_Jesus.pglp_3_3;

public abstract class Robot {
	protected Position position;
	protected Direction direction;
	
	public Robot() {
		position = new Position();
		direction = Direction.Nord;
	}
	
	public void avance() {
		
	}
	
	public void tourne() {
		switch(direction) {
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
		}
	}
	
	public Position getPosition() {
		return position;
	}
}
