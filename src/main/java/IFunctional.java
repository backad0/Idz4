public class IFunctional<T extends ORAFunction> implements OAFunctional<T> {
    private double left;
    private double right;

    public IFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T function) {
        if (left < function.getLeftLimit() || right > function.getRightLimit()) {
            throw new IllegalArgumentException("Bad limits for integral");
        }

        double result = 0;
        double delta = Math.abs(function.getRightLimit() - function.getLeftLimit()) / 100;

        for (double i = left; Math.abs(i - right) > 0.001; i += delta) {
            result += function.solve(i + delta / 2) * delta;
        }
        return result;
    }
}
