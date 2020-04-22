package mathieu.pglp_3_3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import mathieu.pglp_3_3.Robot;
import mathieu.pglp_3_3.RobotType1;
import mathieu.pglp_3_3.RobotType2;

public class RobotTest {

    @Test
    public void test() {
        RobotType1 r1 = new RobotType1();
        RobotType2 r2 = new RobotType2(10);
        ArrayList<Robot> r = new ArrayList<Robot>();
        r.add(r1);
        r.add(r2);
        Robot.avancerTous(r);
        assertEquals(r1.position.toString(),"(0,1)");
        assertEquals(r2.position.toString(),"(0,10)");
    }

}
