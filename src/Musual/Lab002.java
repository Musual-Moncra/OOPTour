/*
 @Nguyễn Thái Bảo
 @22501099
 @Lab002
 */

import java.util.Scanner;

public class Lab002 {

    // Main Handle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Question 01");
        Question01(sc);

        System.out.println("\nQuestion 02");
        Question02(sc);

        System.out.println("\nQuestion 03");
        Question03(sc);

        System.out.println("\nQuestion 04");
        Question04(sc);

        sc.close();
    }

    /*
     * Question 01
     * Yêu cầu:
     * - Nhập 3 cạnh tam giác và kiểm tra tính chất tam giác
     * - Bao gồm: đều, vuông cân, thường, vuông, cân
     */

    public static void Question01(Scanner sc) {
        double a, b, c;
        System.out.print("Nhập cạnh a: ");
        a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c = sc.nextDouble();

        // Kiểm tra tính chất tam giác (Tổng 2 cạnh lớn hơn cạnh còn lại)
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Không phải là tam giác");
            return;
        }

        boolean isRight = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
        boolean isIsosceles = (a == b) || (a == c) || (b == c);

        if (a == b && b == c) {
            System.out.println("Tam giác đều");
        } else if (isRight && isIsosceles) {
            System.out.println("Tam giác vuông cân");
        } else if (isRight) {
            System.out.println("Tam giác vuông");
        } else if (isIsosceles) {
            System.out.println("Tam giác cân");
        } else {
            System.out.println("Tam giác thường");
        }
    }

    /*
     * 2) Nhập ngày, tháng và năm bất kỳ. Cho biết đó là ngày thứ mấy trong tuần.
     * Cách tính:
     * Nếu Tháng<3 thì (Tháng=Tháng+12 và Năm=Năm -1)
     * Thứ = ( Ngày + 2Tháng + 3(Tháng+1) / 5 + Năm + Năm / 4 ) % 7
     * Thứ = 0: Chủ Nhật, 1:Thứ Hai ,....
     */
    public static void Question02(Scanner sc) {
        int day, month, year;
        System.out.print("Nhập ngày: ");
        day = sc.nextInt();
        System.out.print("Nhập tháng: ");
        month = sc.nextInt();
        System.out.print("Nhập năm: ");
        year = sc.nextInt();

        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int dayOfWeek = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Chủ Nhật");
                break;
            case 1:
                System.out.println("Thứ Hai");
                break;
            case 2:
                System.out.println("Thứ Ba");
                break;
            case 3:
                System.out.println("Thứ Tư");
                break;
            case 4:
                System.out.println("Thứ Năm");
                break;
            case 5:
                System.out.println("Thứ Sáu");
                break;
            case 6:
                System.out.println("Thứ Bảy");
                break;
        }
    }

    public static void Question03(Scanner sc) {
        System.out.print("Nhập năm dương lịch (sau 1900): ");
        int namDuongLich = sc.nextInt();

        if (namDuongLich < 1900) {
            System.out.println("Vui lòng nhập năm lớn hơn hoặc bằng 1900!");
            return;
        }

        String[] dsCan = { "Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ" };
        String[] dsChi = { "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi" };

        int a = (namDuongLich - 1900) % 10;
        int b = (namDuongLich - 1900) % 12;

        System.out.println("-------------------------------------------");
        System.out.println("Năm " + namDuongLich + " là năm: " + dsCan[a] + " " + dsChi[b]);
        System.out.println("-------------------------------------------");
    }

    public static void Question04(Scanner sc) {
        System.out.print("Nhập số nguyên dương N: ");
        int n = sc.nextInt();

        // N là số dương
        if (n <= 0) {
            System.out.println("Vui lòng nhập N > 0!");
            return;
        }

        int s1 = 0; // S1: Tổng các số nguyên
        long s2 = 1; // S2: Tích giai thừa
        double s3 = 0; // S3: Tổng phân số đơn
        double s4 = 0; // S4: Tổng phân số phức hợp

        for (int i = 1; i <= n; i++) {
            s1 += i;
            s2 *= i;
            s3 += 1.0 / i;
            s4 += 1.0 / (i * (i + 1));
        }

        System.out.println("-------------------------------------------");
        System.out.println("Kết quả với N = " + n + ":");
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.printf("S3 = %.3f\n", s3);
        System.out.printf("S4 = %.3f\n", s4);
        System.out.println("-------------------------------------------");
    }
}
