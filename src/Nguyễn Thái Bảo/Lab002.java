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

        System.out.print("Question 02");
        Question02(sc);

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

        if (a == b && b == c && a == c) {
            System.out.println("Tam giác đều");
        } else if (a == b && (c * c == a * a + b * b)) {
            System.out.println("Tam giác vuông cân");
        } else if (a == b || a == c || b == c) {
            System.out.println("Tam giác cân");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Tam giác vuông");
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
}
