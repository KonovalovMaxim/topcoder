
public class MinimalTriangle {

    // 1/2 * a * b * sin(y)
    public double maximalArea(int length) {
        return 0.5 * length * length * Math.sin(Math.toRadians(120));
    }
}
