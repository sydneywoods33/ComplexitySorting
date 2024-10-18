package shapes;

/**
 * The TriangularPrism class represents a three-dimensional triangular prism shape.
 * It extends the Prism class.
 */
public class TriangularPrism extends Prism {

    /**
     * Constructs a new TriangularPrism with the specified height and edge length.
     *
     * @param height the height of the triangular prism
     * @param edgeLength the edge length of the triangular prism
     */
    public TriangularPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    /**
     * Returns the base area of the triangular prism.
     * The base area is calculated as (sqrt(3) / 4) * edgeLength^2.
     *
     * @return the base area of the triangular prism
     */
    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength;
    }

    /**
     * Returns the volume of the triangular prism.
     * The volume is calculated as (sqrt(3) / 4) * edgeLength^2 * height.
     *
     * @return the volume of the triangular prism
     */
    @Override
    public double getVolume() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength * height;
    }
}