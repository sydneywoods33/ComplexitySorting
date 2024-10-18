package shapes;

import java.util.Comparator;

/**
 * The ShapeComparator class implements the Comparator interface for comparing ThreeDShape objects.
 * It allows comparison based on either base area or volume.
 */
public class ShapeComparator implements Comparator<ThreeDShape> {
    private String compareType;

    /**
     * Constructs a new ShapeComparator with the specified comparison type.
     *
     * @param compareType the type of comparison ("a" for base area, "v" for volume)
     */
    public ShapeComparator(String compareType) {
        this.compareType = compareType;
    }

    /**
     * Compares two ThreeDShape objects based on the specified comparison type.
     *
     * @param shape1 the first shape to be compared
     * @param shape2 the second shape to be compared
     * @return a negative integer, zero, or a positive integer as the first shape is less than, equal to, or greater than the second shape
     * @throws IllegalArgumentException if the comparison type is invalid
     */
    @Override
    public int compare(ThreeDShape shape1, ThreeDShape shape2) {
        switch (compareType) {
            case "a":
                return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
            case "v":
                return Double.compare(shape1.getVolume(), shape2.getVolume());
            default:
                throw new IllegalArgumentException("Invalid compare type: " + compareType);
        }
    }
}