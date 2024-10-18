package shapes;

/**
 * The PentagonalPrism class represents a three-dimensional pentagonal prism shape.
 * It extends the Prism class.
 */
public class PentagonalPrism extends Prism {

    /**
     * Constructs a new PentagonalPrism with the specified height and edge length.
     *
     * @param height the height of the pentagonal prism
     * @param edgeLength the edge length of the pentagonal prism
     */
    public PentagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    /**
     * Returns the base area of the pentagonal prism.
     * The base area is calculated as (5/4) * tan(π/5) * edgeLength^2.
     *
     * @return the base area of the pentagonal prism
     */
    @Override
    public double getBaseArea() {
        return (5.0 / 4) * Math.tan(Math.PI / 5) * edgeLength * edgeLength;
    }

    /**
     * Returns the volume of the pentagonal prism.
     * The volume is calculated as (5/4) * tan(π/5) * edgeLength^2 * height.
     *
     * @return the volume of the pentagonal prism
     */
    @Override
    public double getVolume() {
        return (5.0 / 4) * Math.tan(Math.PI / 5) * edgeLength * edgeLength * height;
    }
}