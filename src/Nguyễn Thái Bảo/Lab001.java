/*
 @Lab001
 @Nguyễn Thái Bảo
 @MSSV: 22501099
 */

import java.util.Scanner;

public class Lab001 {

    // Main Function
    public static void main(String[] args) {
        // Sử dụng một Scanner duy nhất cho cả chương trình để tránh lỗi đóng System.in
        Scanner sc = new Scanner(System.in);

        System.out.println("=== QUESTION 1 ===");
        question1();

        System.out.println("\n=== QUESTION 2 ===");
        question2(sc);

        System.out.println("\n=== QUESTION 3 ===");
        question3(sc);

        System.out.println("\n=== QUESTION 4 ===");
        question4(sc);

        sc.close();
    }

    // Yêu cầu làm bài tập về In ra "Hello World"
    public static void question1() {
        System.out.println("Hello World");
    }

    /*
     * Yêu cầu:
     * + Nhập tên và năm sinh của bạn
     * + In ra màn hình tuổi hiện tại (2026), tuổi 2025, và tên của bạn
     */
    public static void question2(Scanner sc) {
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.print("Nhập năm sinh của bạn: ");
        int year = sc.nextInt();
        sc.nextLine(); // Xử lý ký tự ngắt dòng (newline) dư thừa sau nextInt()

        int ageNow = 2026 - year;
        int age2025 = 2025 - year;

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi hiện tại của bạn là: " + ageNow);
        System.out.println("Tuổi 2025 của bạn là: " + age2025);
    }

    /*
     * Yêu cầu:
     * + Nhập họ tên học sinh, điểm 3 môn học (Toán, Ngữ Văn, Tiếng Anh)
     * + Tính điểm trung bình của học sinh đó
     * + In ra màn hình: Họ tên, Điểm trung bình làm tròn tới 2 số lẻ dùng hàm
     * Math.round()
     */
    public static void question3(Scanner sc) {
        System.out.print("Nhập họ tên học sinh: ");
        String name = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double math = sc.nextDouble();

        System.out.print("Nhập điểm Ngữ Văn: ");
        double literature = sc.nextDouble();

        System.out.print("Nhập điểm Tiếng Anh: ");
        double english = sc.nextDouble();
        sc.nextLine(); // Xử lý ký tự newline dư thừa

        double average = (math + literature + english) / 3.0;

        System.out.println("Họ tên: " + name);
        // Làm tròn đến 2 chữ số thập phân
        System.out.println("Điểm trung bình: " + Math.round(average * 100) / 100.0);
    }

    /*
     * Yêu cầu:
     * - Nhập họ tên Khách Hàng, số lượng sản phẩm đã mua
     * - Biết rằng:
     * + 1 sản phẩm = 2035
     * + Cứ mua 5 là được tặng 1 (nghĩa là trong 5 cái thì chỉ thanh toán 4)
     * + Sản phẩm còn dư (không đủ bộ 5) được giảm 2% so với giá gốc
     * - In ra họ tên khách hàng, số lượng sản phẩm, số lượng phần quà được nhận,
     * số tiền phải trả, số sản phẩm được giảm giá
     */
    public static void question4(Scanner sc) {
        System.out.print("Nhập họ tên khách hàng: ");
        String name = sc.nextLine();

        System.out.print("Nhập số lượng sản phẩm đã mua: ");
        int totalQuantity = sc.nextInt();
        sc.nextLine(); // Xử lý ký tự newline dư thừa

        final int UNIT_PRICE = 2035;
        int gifts = totalQuantity / 5;
        int extraItems = totalQuantity % 5;

        // Số lượng sản phẩm tính theo bộ 5 (đã trừ quà tặng)
        int paidInGroups = (totalQuantity / 5) * 4;

        // Tính tiền:
        // - Các SP trong bộ 5 trả giá gốc (sau khi trừ quà tặng)
        // - Các SP dư được giảm 2%
        double totalPrice = (paidInGroups * UNIT_PRICE) + (extraItems * UNIT_PRICE * 0.98);

        System.out.println("Họ tên khách hàng: " + name);
        System.out.println("Số lượng sản phẩm đã mua: " + totalQuantity);
        System.out.println("Số lượng phần quà được nhận: " + gifts);
        System.out.println("Số sản phẩm được giảm giá (2%): " + extraItems);
        System.out.printf("Số tiền phải trả: %.2f\n", totalPrice);
    }
}