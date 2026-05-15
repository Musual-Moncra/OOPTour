package TranHieu.tuan7;

public class Circle extends Point {
    private double radius;
    private String color;

    public Circle() {
        super();
        this.radius = 0;
        this.color = "No color";
    }

    public Circle(double x, double y, double radius, String color) {
        super(x, y);// gọi hàm construcor của lớp cha
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Hinh tron co ban kinh: " + radius + ", mau: " + color + ", duoc ve tai toa do: " + toString());
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Hinh tron[toa do:" + super.toString() + ", ban kinh:" + radius + ", mau:" + color + "]";
    }

}
