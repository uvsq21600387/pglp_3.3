package mathieu.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import mathieu.pglp_3_3.Position;
import mathieu.pglp_3_3.Robot;
import mathieu.pglp_3_3.RobotType1;

/**
 * tests unitaires de la classe RobotType1
 */
public class RobotType1Test {

	@Test
	/**
	 * test le constructeur et le getter de la position
	 */
	public void test() {
		Robot r = new RobotType1();
		assertTrue(r.getPosition().x == r.getPosition().y && r.getPosition().y == 0);
	}
	
	@Test
	/**
	 * test si le robot avance correctement
	 */
	public void testAvance() {
		Robot r = new RobotType1();
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 1 && r.getPosition().y == 0);
	}

	@Test
	public void tourne() {
	    Robot r = new RobotType1(new Position(1,1));
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
