package shapes;

/**
 * The Prism class is an abstract class that represents a three-dimensional prism shape.
 * It extends the ThreeDShape class.
 */
abstract class Prism extends ThreeDShape {
    protected double height;
    protected double edgeLength;

    /**
     * Constructs a new Prism with the specified height and edge length.
     *
     * @param height the height of the prism
     * @param edgeLength the edge length of the prism
     */
    public Prism(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    /**
     * Returns the height of the prism.
     *
     * @return the height of the prism
     */
    @Override
    public double getHeight() {
        return height;
    }
}