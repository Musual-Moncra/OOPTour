package baitaptuan5;

import java.util.Scanner;

public class Sach {
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenSach, String tacGia, int namXuatBan, int soTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
    }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoTrang() { return soTrang; }
    public void setSoTrang(int soTrang) { this.soTrang = soTrang; }

    // Bổ sung hàm nhập dữ liệu cho 1 cuốn sách
    public void nhap(Scanner sc) {
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = sc.nextInt();
        
        System.out.print("Nhap so trang: ");
        this.soTrang = sc.nextInt();
        
        sc.nextLine(); // Xóa bộ đệm chống trôi lệnh
    }

    public void output() {
        System.out.println("Ten sach: " + tenSach + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | So trang: " + soTrang);
    }
}
