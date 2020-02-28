package Mathieu_De_Jesus.pglp_3_3;

public class RobotType1 extends Robot{
	
	public RobotType1() {
		super();
	}
	
	@Override
	public void avance() {
		switch(direction) {
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
		}
	}
}
