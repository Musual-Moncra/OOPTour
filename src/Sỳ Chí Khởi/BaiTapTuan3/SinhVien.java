package baitaptuan3;

import java.util.Scanner;
import java.time.LocalDate; // Dùng thư viện này để lấy năm hiện tại chính xác nhất

public class SinhVien {
    // Thuộc tính (nên để public theo yêu cầu bài tập cơ bản)
    public String maSo;
    public String hoTen;
    public int namSinh;

    // Constructor 0 tham số
    public SinhVien() {
    }

    // Constructor 3 tham số
    public SinhVien(String maSo, String hoTen, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    // Hàm nhập thông tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap Nam sinh: ");
        namSinh = sc.nextInt();
    }

    // Hàm tính tuổi
    public int tinhTuoi() {
        int namHienTai = LocalDate.now().getYear(); // Lấy năm từ hệ thống (2026)
        return namHienTai - namSinh;
    }

    // Hàm xuất 1 dòng thông tin
    public void xuat() {
        System.out.printf("Ma so: %s | Ho ten: %-20s | Tuoi: %d\n", 
                          maSo, hoTen, tinhTuoi());
    }
}
