package TranHieu.tuan7;

/*
    Bài 01
1.	Xây dựng lớp Point bao gồm:
-	Tọa độ x, y
-	Contrctor 0 tham số và 2 tham số
-	Phương thức void move(newX, newY): di chuyển Point đến tọa độ mới
-	Override hàm toString(): return chuỗi có định dạng (x,y)
2.	Xây dựng lớp Circle kế thừa lớp Point, và định nghĩa thêm các fileds và methods sau:
-	Bán kính (radius)
-	Màu (color)
-	Constructor 0 tham số và 4 tham số (có chỉ định constructor 2 tham số của lớp cha)
-	Hàm vẽ (draw): xuất ra thông báo: “Hình tròn có bán kính…………, màu…………, được vẽ tại tọa độ…………”
-	Hàm tính diện tích (area) và hàm tính chu vi (perimeter)
3.	Vẽ 3 hình tròn khác nhau và xuất chu vi, diện tích 

 */

public class bai1 {

    public static void main(String[] args) {
        // === Test Point ===
        // Test Constructor 0 tham số
        Point p1 = new Point();
        System.out.println("Diem p1 ban dau: " + p1.toString());

        // Test Constructor 2 tham số
        Point p2 = new Point(3.5, 4.2);
        System.out.println("Diem p2 ban dau: " + p2.toString());

        // Test phương thức move
        p2.move(10.5, 20.1);
        System.out.println("Diem p2 sau khi di chuyen (move): " + p2.toString());

        System.out.println("\n========== HINH TRON ==========");

        // === Test Circle ===
        // Vẽ 3 hình tròn khác nhau và xuất chu vi, diện tích
        Circle c1 = new Circle(0, 0, 5.0, "Den");
        c1.draw();
        System.out.println("- Chu vi: " + String.format("%.2f", c1.getPerimeter()));
        System.out.println("- Dien tich: " + String.format("%.2f", c1.getArea()));

        System.out.println();

        Circle c2 = new Circle(2.0, 3.0, 7.5, "Do");
        c2.draw();
        System.out.println("- Chu vi: " + String.format("%.2f", c2.getPerimeter()));
        System.out.println("- Dien tich: " + String.format("%.2f", c2.getArea()));

        System.out.println();

        Circle c3 = new Circle(-1.0, 4.5, 10.0, "Xanh");
        c3.draw();
        System.out.println("- Chu vi: " + String.format("%.2f", c3.getPerimeter()));
        System.out.println("- Dien tich: " + String.format("%.2f", c3.getArea()));
    }
}
