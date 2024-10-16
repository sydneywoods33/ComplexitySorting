package shapes;

public class PentagonalPrism extends Prism {
    public PentagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double getBaseArea() {
        return (5.0 / 4) * Math.tan(Math.PI / 5) * edgeLength * edgeLength;
    }

    @Override
    public double getVolume() {
        return (5.0 / 4) * Math.tan(Math.PI / 5) * edgeLength * edgeLength * height;
    }
}