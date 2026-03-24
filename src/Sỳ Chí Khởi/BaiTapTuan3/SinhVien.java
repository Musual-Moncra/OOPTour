package baitaptuan3;

import java.util.Scanner;
import java.time.LocalDate; // Dùng lib này để lấy năm hiện tại mà không cần phải chỉnh sửa code mỗi năm

public class SinhVien {
    // Thuộc tính 
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
        int namHienTai = LocalDate.now().getYear(); // Lấy năm từ hệ thống
        return namHienTai - namSinh;
    }

    // Hàm xuất 1 dòng thông tin
    public void xuat() {
        System.out.printf("Ma so: %s | Ho ten: %-20s | Tuoi: %d\n", 
                          maSo, hoTen, tinhTuoi());
    }
}
