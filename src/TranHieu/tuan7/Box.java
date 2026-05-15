package TranHieu.tuan7;

public class Box extends Rectangle {
    private double height;

    public Box() {
        super();
        this.height = 0;
    }

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = (height >= 0) ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height >= 0) ? height : 0;
    }

    @Override
    public double area() {
        return 2 * (getLength() * getWidth() + getWidth() * height + height * getLength());
    }

    @Override
    public String toString() {
        return "(" + getLength() + ", " + getWidth() + ", " + height + ")";
    }

    public double volume() {
        return getLength() * getWidth() * height;
    }
}
