package shapes;

 public class OctagonalPrism extends Prism {
    public OctagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }

    @Override
    public double getVolume() {
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength * height;
    }
}