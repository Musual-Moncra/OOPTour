package TranHieu.tuan7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = (length >= 0) ? length : 0;
        this.width = (width >= 0) ? width : 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length >= 0) ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 0) ? width : 0;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "(" + length + ", " + width + ")";
    }
}
