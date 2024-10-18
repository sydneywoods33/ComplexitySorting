package shapes;

/**
 * The {@code Cone} class represents a three-dimensional cone shape.
 * It extends the {@code ThreeDShape} class and provides methods to
 * calculate the height, base area, and volume of the cone.
 */
public class Cone extends ThreeDShape {
    private double height;
    private double radius;

    /**
     * Constructs a {@code Cone} with the specified height and radius.
     *
     * @param height the height of the cone
     * @param radius the radius of the cone's base
     */
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /**
     * Returns the height of the cone.
     *
     * @return the height of the cone
     */
    @Override
    public double getHeight() {
        return height;
    }

    /**
     * Returns the area of the base of the cone.
     *
     * @return the base area of the cone
     */
    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the volume of the cone.
     *
     * @return the volume of the cone
     */
    @Override
    public double getVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}