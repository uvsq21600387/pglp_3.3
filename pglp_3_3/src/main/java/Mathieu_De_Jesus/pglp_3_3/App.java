package Mathieu_De_Jesus.pglp_3_3;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void avancerTous(ArrayList <Robot> r) {
		for(Robot robot : r) {
			robot.avance();
		}
	}
	
    public static void main( String[] args )
    {
        ArrayList <Robot> r = new ArrayList <Robot> ();
        r.add(new RobotType1());
        r.add(new RobotType2(10));
        avancerTous(r);
        for(Robot robot : r) {
			System.out.println(robot.position.toString());
		}
    }
}
