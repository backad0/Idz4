public class SFunctional<T extends ORAFunction> implements OAFunctional<T> {
    @Override
    public double calculate(T function) {
        return function.solve(function.getLeftLimit()) + function.solve(function.getRightLimit()) + function.solve((function.getRightLimit() - function.getLeftLimit()) / 2);
    }
}
