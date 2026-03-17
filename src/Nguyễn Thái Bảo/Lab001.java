/*
 @Lab001
 @Nguyễn Thái Bảo
 @MSSV: 22501099
 */

import java.util.Scanner;

public class Lab001 {

    // Main Function
    public static void main(String[] args) {
        Question1();
        Question2();
        Question3();
        Question4();
    }

    // Yêu cầu làm bài tập về In ra "Hello World"
    public static void Question1() {
        System.out.println("Hello World");
    }

    /*
     * Yêu cầu:
     * + Nhập tên và năm sinh của bạn
     * + In ra màn hình tuổi hiên tại, tuổi 2025, và tên của bạn
     */
    public static void Question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Nhập năm sinh của bạn: ");
        int year = sc.nextInt();
        int age = 2026 - year;
        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi hiện tại của bạn là: " + age);
        System.out.println("Tuổi 2025 của bạn là: " + (age - 1));
        sc.close();
    }

    /*
     * Yêu cầu:
     * + Nhập họ tên học sinh, điểm 3 môn học (Toán, Ngữ Văn, Tiếng Anh)
     * + Tính điểm trung bình của học sinh đó
     * + In ra màn hình: Họ tên, Điểm trung bình làm tròn tới 2 số lẻ dùng hàn
     * Math.round()
     */
    public static void Question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double math = sc.nextDouble();
        System.out.println("Nhập điểm Ngữ Văn: ");
        double literature = sc.nextDouble();
        System.out.println("Nhập điểm Tiếng Anh: ");
        double english = sc.nextDouble();
        double average = (math + literature + english) / 3;
        System.out.println("Họ tên: " + name);
        System.out.println("Điểm trung bình: " + Math.round(average * 100) / 100.0);
        sc.close();
    }

    /*
     * Yêu cầu:
     * - Nhập họ tên Khách Hàng, số lượng sản phẩm đã mua
     * - Biết rằng:
     * 1 sản phẩm = 2035
     * Cứ mua 5 là được tặng 1
     * Sản phẩm còn dư được giảm 2% so với giá gốc
     * - In ra họ tên khách hàng, số lượng sản phẩm, số lượng phần quà được nhận
     * số tiền phải trả, số sản phẩm được giảm giá
     */
    public static void Question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm đã mua: ");
        int quantity = sc.nextInt();
        int gift = quantity / 5;
        int remain = quantity % 5;
        double price = (quantity - gift) * 2035 * 0.98;
        System.out.println("Họ tên khách hàng: " + name);
        System.out.println("Số lượng sản phẩm: " + quantity);
        System.out.println("Số lượng phần quà được nhận: " + gift);
        System.out.println("Số tiền phải trả: " + price);
        System.out.println("Số sản phẩm được giảm giá: " + remain);
        sc.close();
    }
}