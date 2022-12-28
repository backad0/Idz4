
public class LinearF implements ORAFunction {
    private double a;
    private double b;

    private double leftLimit;
    private double rightLimit;

    public LinearF(double a, double b, double leftLimit, double rightLimit) {
        if (leftLimit > rightLimit) throw new IllegalArgumentException("Bad limit borders");
        this.a = a;
        this.b = b;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    @Override
    public double solve(double x) {
        if (x < leftLimit || x > rightLimit) throw new IllegalArgumentException("x in out of range");
        return a * x + b;
    }
}
