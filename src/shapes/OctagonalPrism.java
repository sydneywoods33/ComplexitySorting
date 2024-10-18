package shapes;

/**
 * The OctagonalPrism class represents a three-dimensional octagonal prism shape.
 * It extends the Prism class.
 */
public class OctagonalPrism extends Prism {

    /**
     * Constructs a new OctagonalPrism with the specified height and edge length.
     *
     * @param height the height of the octagonal prism
     * @param edgeLength the edge length of the octagonal prism
     */
    public OctagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    /**
     * Returns the base area of the octagonal prism.
     * The base area is calculated as 2 * (1 + sqrt(2)) * edgeLength^2.
     *
     * @return the base area of the octagonal prism
     */
    @Override
    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }

    /**
     * Returns the volume of the octagonal prism.
     * The volume is calculated as 2 * (1 + sqrt(2)) * edgeLength^2 * height.
     *
     * @return the volume of the octagonal prism
     */
    @Override
    public double getVolume() {
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength * height;
    }
}