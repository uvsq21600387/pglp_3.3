package mathieu.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import mathieu.pglp_3_3.Position;
import mathieu.pglp_3_3.Robot;
import mathieu.pglp_3_3.RobotType2;

/**
 * tests unitaires de la classe RobotType2
 */
public class RobotType2Test {
	@Test
	/**
	 * teste le constructeur et le getter du robot
	 */
	public void test() {
		Robot r = new RobotType2(4);
		assertTrue(r.getPosition().x == r.getPosition().y && r.getPosition().y == 0);
	}
	@Test
	/**
	 * teste si le robot avance correctement
	 */
	public void testAvance() {
		Robot r = new RobotType2(4);
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 4 && r.getPosition().y == 0);
	}
	
	@Test
    public void tourne() {
        Robot r = new RobotType2(10,new Position(1,1));
        r.tourne();
        r.avance();
        r.tourne();
        r.avance();
        r.tourne();
        r.avance();
        r.tourne();
        r.avance();
    }
}
