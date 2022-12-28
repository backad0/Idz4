import java.util.ArrayList;

public class QESolve {
    QuadraticEquation quadraticEquation;

    QESolve(QuadraticEquation quadraticEquation) {
        if (quadraticEquation == null) {
            throw new IllegalArgumentException("");
        }
        this.quadraticEquation = quadraticEquation;
    }

    public double getLarger() throws Exception {
        ArrayList<Double> roots = quadraticEquation.solve();
        if (roots.size() == 1) {
            return roots.get(0);
        } else if (roots.size() == 2) {
            if (Math.abs(roots.get(0) - roots.get(1)) > 0.001) {
                return roots.get(0);
            } else {
                return roots.get(1);
            }
        } else {
            throw new Exception("No Roots");
        }
    }
}
