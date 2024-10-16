package shapes;

class Cone extends ThreeDShape {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}