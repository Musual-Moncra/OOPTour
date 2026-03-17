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

    public static void Question3() {

    }

    public static void Question4() {

    }
}