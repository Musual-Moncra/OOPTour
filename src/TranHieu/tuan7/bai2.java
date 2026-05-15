package TranHieu.tuan7;

public class bai2 {
    public static void main(String[] args) {
        // 3. Tính chu vi và diện tích hình chữ nhật (10,3).
        Rectangle rect = new Rectangle(10, 3);
        System.out.println("Hình chữ nhật " + rect.toString() + ":");
        System.out.println("- Chu vi: " + rect.perimeter());
        System.out.println("- Diện tích: " + rect.area());

        System.out.println("-------------------------");

        // Tính diện tích và thể tích của hình hộp (2,4,6)
        Box box = new Box(2, 4, 6);
        System.out.println("Hình hộp " + box.toString() + ":");
        System.out.println("- Diện tích toàn phần: " + box.area());
        System.out.println("- Thể tích: " + box.volume());
    }
}
