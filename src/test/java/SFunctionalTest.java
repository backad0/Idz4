import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SFunctionalTest{

    @Test
    public void sFunctionalTestLinear0() {
        LinearF linearFunction = new LinearF(1, 0, 0, 10);
        SFunctional<LinearF> linearFunctionSFunctional = new SFunctional<>();
        assertEquals(15.0, linearFunctionSFunctional.calculate(linearFunction), 0.001);
    }

    @Test
    public void sFunctionalTestLinear1() {
        LinearF linearFunction = new LinearF(1, 1, 0, 20);
        SFunctional<LinearF> linearFunctionSFunctional = new SFunctional<>();
        assertEquals(33.0, linearFunctionSFunctional.calculate(linearFunction), 0.001);
    }

    @Test
    public void sFunctionalTestT0() {
        TFunction sinFunction = new TFunction(1, 1, 0, 2 * Math.PI);
        SFunctional<TFunction> tFunctionSFunctional = new SFunctional<>();
        assertEquals(0.0, tFunctionSFunctional.calculate(sinFunction), 0.001);
    }

    @Test
    public void sFunctionalTestT1() {
        TFunction sinFunction = new TFunction(1, 1, 0, Math.PI);
        SFunctional<TFunction> tFunctionSFunctional = new SFunctional<>();
        assertEquals(1.0, tFunctionSFunctional.calculate(sinFunction), 0.001);
    }

    @Test
    public void sFunctionalTestFL0() {
        FLFunction fLFunction = new FLFunction(1, 1, 1, 1, 0, 10);
        SFunctional<FLFunction> fLFunctionSFunctional = new SFunctional<>();
        assertEquals(3.0, fLFunctionSFunctional.calculate(fLFunction), 0.001);
    }

    @Test
    public void sFunctionalTestFL1() {
        FLFunction fLFunction = new FLFunction(1, 2, 3, 4, 0, 10);
        SFunctional<FLFunction> fLFunctionSFunctional = new SFunctional<>();
        assertEquals(1.2214, fLFunctionSFunctional.calculate(fLFunction), 0.001);
    }

    @Test
    public void sFunctionalTestE0() {
        EFunction eFunction = new EFunction(1, 0, 0, 2);
        SFunctional<EFunction> eFunctionSFunctional = new SFunctional<>();
        assertEquals(11.1073, eFunctionSFunctional.calculate(eFunction), 0.001);
    }

    @Test
    public void sFunctionalTestE1() {
        EFunction eFunction = new EFunction(1, 1, 0, 2);
        SFunctional<EFunction> eFunctionSFunctional = new SFunctional<>();
        assertEquals(14.1073, eFunctionSFunctional.calculate(eFunction), 0.001);
    }
}
