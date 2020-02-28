package Mathieu_De_Jesus.pglp_3_3;

public class RobotType2 extends Robot{
	
	private int vitesse;
	
	public RobotType2(int vitesse) {
		super();
		this.vitesse = vitesse;
	}
	
	@Override
	public void avance() {
		switch(direction) {
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
		}
	}
}
