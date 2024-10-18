package shapes;

/**
 * The SquarePrism class represents a three-dimensional square prism shape.
 * It extends the Prism class.
 */
public class SquarePrism extends Prism {

    /**
     * Constructs a new SquarePrism with the specified height and edge length.
     *
     * @param height the height of the square prism
     * @param edgeLength the edge length of the square prism
     */
    public SquarePrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    /**
     * Returns the base area of the square prism.
     * The base area is calculated as edgeLength^2.
     *
     * @return the base area of the square prism
     */
    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

    /**
     * Returns the volume of the square prism.
     * The volume is calculated as edgeLength^2 * height.
     *
     * @return the volume of the square prism
     */
    @Override
    public double getVolume() {
        return edgeLength * edgeLength * height;
    }
}
