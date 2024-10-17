package shapes;

abstract class Prism extends ThreeDShape {
    protected double height;
    protected double edgeLength;

    public Prism(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getHeight() {
        return height;
    }
}