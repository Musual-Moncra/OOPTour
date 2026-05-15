
package baitaptuan2;
import java.util.Scanner;
/*
    Sy Chi Khoi
    MSSV:22502168
    +3/17/2026-done cau 1
    +3/19/2026-done cau 2 3 4
    +3/23/2026-done cau 5 6
 */
public class BaiTapTuan2 {

    
    static Scanner sc = new Scanner(System.in);//dùng Biến toàn cục cho khoẻ! 
    public static void main(String[] args) 
    {
        //IfELseDemo();
        //Cau1();
        //Cau2();
        //Cau3();
        //Cau4();
        //Cau5();
        Cau6();
    }

    
    public static void IfELseDemo()
    {
        int testscore = 76;
        char grade;
        
        if (testscore >=90 ){
            grade ='A';
        }else if (testscore >=80){
            grade ='B';
        }else {
            grade ='F';
        }
        System.out.println("Grade ="+ grade);
    }

    public static void Cau1()
    {
        //Scanner sc = new Scanner(System.in);
        System.out.print("canh a: ");
        double a = sc.nextDouble();
        System.out.print("canh b: ");
        double b = sc.nextDouble();
        System.out.print("canh c: ");
        double c = sc.nextDouble();

        //check condition
        if (a + b > c && a + c > b && b + c > a) {
            
            //Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } 
            else if ((a == b && a * a + b * b == c * c) ||(a == c && a * a + c * c == b * b)||(b == c && b * b + c * c == a * a)) {
                System.out.println("Day la tam giac vuong can");
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Day la tam giac vuong");
            } 
            else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
            } 
            else {
                System.out.println("day la tam giac thuong");
            }
        } else {
            System.out.println("Ba canh nay khong tao thanh mot tam giac!");
        }
    }
    

    public static void Cau2() 
    {
        //Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        // Resave giá trị gốc 
        int ngayGoc = day;
        int thangGoc = month;
        int namGoc = year;

        // Nếu Tháng < 3 thì Tháng = Tháng + 12 và Năm = Năm - 1
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        // Thứ = ( Ngày + 2*Tháng + 3*(Tháng+1)/5 + Năm + Năm/4 ) % 7
        int thu = (day + 2*month + (3 * (month + 1)) / 5 + year + year / 4) % 7;

        String ketqua = "";
        ketqua = switch (thu) //Ở đây dùng '->' thay cho ':' vì gọn hơn và có thể tự động break
        {
            case 0 -> "Sunday";   //日曜-nichi-nhật
            case 1 -> "Monday";   //月曜-getsu-nguyệt
            case 2 -> "Tuesday";  //火曜-ka-hoả
            case 3 -> "Wednesday";//水曜-sui-thuỷ
            case 4 -> "Thursday"; //木曜-moku-mộc
            case 5 -> "Friday";   //金曜-kin-kim
            case 6 -> "Saturday"; //土曜-do-thổ
            default -> "invalid day";
        }; // Lưu ý có dấu ';' ở cuối vì đây là một phép gán

        System.out.println("-------------------------------------------");
        System.out.printf("Ngay %d/%d/%d la: %s\n", ngayGoc, thangGoc, namGoc, ketqua);
        System.out.println("-------------------------------------------");

    }
    
    
    public static void Cau3() {
    //Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap nam duong lich (sau 1900): ");
    int namDuongLich = sc.nextInt();

    if (namDuongLich < 1900) {
        System.out.println("Vui long nhap nam lon hon hoac bang 1900!");
        return;
    }

    String[] dsCan = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
    
    String[] dsChi = {"Ty", "Suu", "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui", "Than", "Dau", "Tuat", "Hoi"};

    int a = (namDuongLich - 1900) % 10;
    int b = (namDuongLich - 1900) % 12;

    System.out.println("-------------------------------------------");
    System.out.println("Nam " + namDuongLich + " la nam: " + dsCan[a] + " " + dsChi[b]);
    System.out.println("-------------------------------------------");
    }
    
    public static void Cau4() 
    {
    //Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so nguyen duong N: ");
    int n = sc.nextInt();

    //N là số dương
    if (n <= 0) {
        System.out.println("Vui long nhap N > 0!");
        return;
    }
    
    int s1 = 0;          // S1: Tổng các số nguyên (dùng int là đủ)
    long s2 = 1;         // S2: Tích giai thừa (dùng long để tránh tràn số khi N lớn)
    double s3 = 0;       // S3: Tổng phân số đơn (dùng double để lấy phần thập phân)
    double s4 = 0;       // S4: Tổng phân số phức hợp

    for (int i = 1; i <= n; i++) {
        s1 += i;                        // Cộng dồn i vào S1
        s2 *= i;                        // Nhân dồn i vào S2
        // Lưu ý: Dùng 1.0 để ép kiểu số thực, giúp phép chia chính xác
        s3 += 1.0 / i;                  
        
        // Tính tổng theo công thức 1 / (i * (i + 1))
        s4 += 1.0 / (i * (i + 1));      
    }

    System.out.println("-------------------------------------------");
    System.out.println("Ket qua voi N = " + n + ":");
    System.out.println("S1 = " + s1);
    System.out.println("S2 = " + s2);
    System.out.printf("S3 = %.3f\n", s3); // Sử dụng printf để giới hạn 3 chữ số sau dấu phẩy cho số thực
    System.out.printf("S4 = %.3f\n", s4);
    System.out.println("-------------------------------------------");
    }
    
    public static void Cau5()
    {
        int n =0;
        int tong=0;
        while (true){
            n++;
            tong+=n;
            if (tong>=200){
                break;
            }
        }
        System.out.println("N min la: "+n );
        System.out.println("Tong la: "+tong);
    }
    
    public static void Cau6() {
        int chon;
        do {
            System.out.println("\n========== MENU BAI TAP TUAN 2 ==========");
            System.out.println("1. Cau 1");
            System.out.println("2. Cau 2");
            System.out.println("3. Cau 3");
            System.out.println("4. Cau 4");
            System.out.println("5. Cau 5");
            System.out.println("0. Thoat chuong trinh (Sayonara!)");
            System.out.print("Moi ban chon (0-5): ");
            
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> Cau1();
                case 2 -> Cau2();
                case 3 -> Cau3();
                case 4 -> Cau4();
                case 5 -> Cau5();
                case 0 -> System.out.println("Tam biet! Chuong trinh ket thuc.");
                default -> System.out.println("Lua chon khong hop le. Vui long nhap lai!");
            }
            
            if (chon != 0) {
                System.out.println("\nNhan Enter de tiep tuc...");
                sc.nextLine(); // xoa cache
                sc.nextLine(); // enter
            }
            
        } while (chon != 0);
    }
}
