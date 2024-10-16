package shapes;

public class TriangularPrism extends Prism {
    public TriangularPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength;
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength * height;
    }
}