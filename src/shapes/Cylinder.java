package shapes;

/**
 * The Cylinder class represents a three-dimensional cylinder shape.
 * It extends the ThreeDShape class.
 */
public class Cylinder extends ThreeDShape {
    private double height;
    private double radius;

    /**
     * Constructs a new Cylinder with the specified height and radius.
     *
     * @param height the height of the cylinder
     * @param radius the radius of the cylinder
     */
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /**
     * Returns the height of the cylinder.
     *
     * @return the height of the cylinder
     */
    @Override
    public double getHeight() {
        return height;
    }

    /**
     * Returns the base area of the cylinder.
     * The base area is calculated as π * radius^2.
     *
     * @return the base area of the cylinder
     */
    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the volume of the cylinder.
     * The volume is calculated as π * radius^2 * height.
     *
     * @return the volume of the cylinder
     */
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}