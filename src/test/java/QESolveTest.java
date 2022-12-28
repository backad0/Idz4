import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QESolveTest{

    @Test
    public void getLargerTest0() throws Exception {
        QESolve qs = new QESolve(new QuadraticEquation(1, 1, -6));
        assertEquals(2.0, qs.getLarger(), 0.1);
    }

    @Test
    public void getLargerTest1() throws Exception {
        QESolve qs = new QESolve(new QuadraticEquation(1, 4, 4));
        assertEquals(-2.0, qs.getLarger(), 0.1);
    }

    @Test
    public void getLargerTest2() throws Exception {
        QESolve qs = new QESolve(new QuadraticEquation(1, 2, 0));
        assertEquals(0.0, qs.getLarger(), 0.1);
    }

    @Test(expected = Exception.class)
    public void getLargerTest4() throws Exception {
        QESolve qs = new QESolve(new QuadraticEquation(0, 0, 0));
        qs.getLarger();
    }
}


