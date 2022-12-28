import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IFunctionalTest {

    @Test(expected = IllegalArgumentException.class)
    public void iFunctionalExceptionTestLinear() {
        LinearF linearF = new LinearF(1, 1, 0, 10);
        IFunctional<LinearF> linearFIFunctional = new IFunctional<>(-10, 10);
        assertEquals(60.0, linearFIFunctional.calculate(linearF), 0.001);
    }

    @Test
    public void iFunctionalTestLinear() {
        LinearF linearF = new LinearF(1, 1, 0, 10);
        IFunctional<LinearF> linearFIFunctional = new IFunctional<>(0, 10);
        assertEquals(60.0, linearFIFunctional.calculate(linearF), 0.001);
    }

    @Test
    public void iFunctionalTestT() {
        TFunction tFunction = new TFunction(1, 1, 0, Math.PI);
        IFunctional<TFunction> tFunctionIFunctional = new IFunctional<>(0, Math.PI);
        assertEquals(2.0, tFunctionIFunctional.calculate(tFunction), 0.001);
    }

    @Test
    public void iFunctionalTestFL() {
        FLFunction fLFunction = new FLFunction(1, 1, 1, 1, 0, 10);
        IFunctional<FLFunction> fLFunctionIFunctional = new IFunctional<>(0, 10);
        assertEquals(10.0, fLFunctionIFunctional.calculate(fLFunction), 0.001);
    }

    @Test
    public void iFunctionalTestE() {
        EFunction eFunction = new EFunction(1, 0, 0, 1);
        IFunctional<EFunction> eFunctionIFunctional = new IFunctional<>(0, 1);
        assertEquals(1.7183, eFunctionIFunctional.calculate(eFunction), 0.001);
    }
}
