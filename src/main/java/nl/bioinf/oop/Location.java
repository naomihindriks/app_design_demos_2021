package nl.bioinf.oop;

public class Location {
    private final double x;
    private final double y;
    private final double z;

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Location moveBy(double deltaX, double deltaY, double deltaZ) {
        return new Location(this.x + deltaX, this.y + deltaY, this.z + deltaZ);
    }

}