package shapes;

/**
 * The Pyramid class represents a three-dimensional pyramid shape.
 * It extends the ThreeDShape class.
 */
public class Pyramid extends ThreeDShape {
    private double height;
    private double edgeLength;

    /**
     * Constructs a new Pyramid with the specified height and edge length.
     *
     * @param height the height of the pyramid
     * @param edgeLength the edge length of the pyramid's base
     */
    public Pyramid(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    /**
     * Returns the height of the pyramid.
     *
     * @return the height of the pyramid
     */
    @Override
    public double getHeight() {
        return height;
    }

    /**
     * Returns the base area of the pyramid.
     * The base area is calculated as edgeLength^2.
     *
     * @return the base area of the pyramid
     */
    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

    /**
     * Returns the volume of the pyramid.
     * The volume is calculated as (1/3) * edgeLength^2 * height.
     *
     * @return the volume of the pyramid
     */
    @Override
    public double getVolume() {
        return (1.0 / 3) * edgeLength * edgeLength * height;
    }
}