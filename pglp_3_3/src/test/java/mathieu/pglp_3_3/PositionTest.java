package mathieu.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import mathieu.pglp_3_3.Position;

public class PositionTest {

    @Test
    public void test() {
        Position p = new Position(1,1);
        assertEquals(p.toString(), "(1,1)");
    }

}
