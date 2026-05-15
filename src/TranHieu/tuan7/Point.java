package TranHieu.tuan7;

public class Point {
    private double x;
    private double y;

    // Constructor 0 tham số
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor 2 tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức di chuyển
    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    // Getter và Setter (tùy chọn nhưng nên có)
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Override hàm toString
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
