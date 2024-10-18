package shapes;

/**
 * The ThreeDShape class is an abstract class that represents a three-dimensional shape.
 * It implements the Comparable interface to allow comparison based on height.
 */
public abstract class ThreeDShape implements Comparable<ThreeDShape> {

    /**
     * Returns the height of the three-dimensional shape.
     *
     * @return the height of the shape
     */
    public abstract double getHeight();

    /**
     * Returns the base area of the three-dimensional shape.
     *
     * @return the base area of the shape
     */
    public abstract double getBaseArea();

    /**
     * Returns the volume of the three-dimensional shape.
     *
     * @return the volume of the shape
     */
    public abstract double getVolume();

    /**
     * Compares this shape with the specified shape for order based on height.
     *
     * @param other the shape to be compared
     * @return a negative integer, zero, or a positive integer as this shape is less than, equal to, or greater than the specified shape
     */
    @Override
    public int compareTo(ThreeDShape other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }
}