package shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<ThreeDShape> {
    private String compareType;

    public ShapeComparator(String compareType) {
        this.compareType = compareType;
    }

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