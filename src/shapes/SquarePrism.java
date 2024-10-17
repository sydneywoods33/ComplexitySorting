package shapes;

public class SquarePrism extends Prism {
    public SquarePrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

    @Override
    public double getVolume() {
        return edgeLength * edgeLength * height;
    }
}
