import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearFTest{
    @Test
    public void LFT1() {
        LinearF linearFunction = new LinearF(1, 1, -100, 100);
        assertEquals(2.0, linearFunction.solve(1), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void LFT2() {
        LinearF linearFunction = new LinearF(1, 1, -100, 100);
        assertEquals(2.0, linearFunction.solve(112), 0.001);
    }

    @Test
    public void LFT3() {
        LinearF linearFunction = new LinearF(2, -4, -100, 100);
        assertEquals(0.0, linearFunction.solve(2), 0.001);
    }

}
