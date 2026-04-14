/*
1)	Xây dựng lớp Converter bao gồm các hàm tĩnh 
-	Chuyển đổi từ độ C sang độ F và ngược lại theo công thức 
°F  =  ( °C × 1.8 ) +  32
°C  =  ( °F ─  32 )  ⁄  1.8
-	Chuyển đổi giữa inch và cm: 1 inch = 2.54 cm
-	Chuyển đổi giữa foot và m: 1 foot = 0.3048 m
-	Hàm main() thực hiện việc chuyển đổi dữ liệu nhập vào từ người dùng
*/

package TranHieu.tuan5;

import java.util.Scanner;

public class bai1_lap4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Chuyen doi tu do C sang do F");
        System.out.println("2. Chuyen doi tu do F sang do C");
        System.out.println("3. Chuyen doi giua inch va cm");
        System.out.println("4. Chuyen doi giua foot va m");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.print("Nhap do C: ");
                double c = sc.nextDouble();
                System.out.println("Do F: " + converted.cToF(c));
                break;
            case 2:
                System.out.print("Nhap do F: ");
                double f = sc.nextDouble();
                System.out.println("Do C: " + converted.fToC(f));
                break;
            case 3:
                System.out.print("Nhap inch: ");
                double inch = sc.nextDouble();
                System.out.println("Cm: " + converted.inchToCm(inch));
                break;
            case 4:
                System.out.print("Nhap foot: ");
                double foot = sc.nextDouble();
                System.out.println("M: " + converted.footToM(foot));
                break;
            case 0:
                break;
            default:
                System.out.println("Chuc nang khong ton tai!");
        }
    }
}