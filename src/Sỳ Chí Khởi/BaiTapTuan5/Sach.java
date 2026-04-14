package baitaptuan5;

import java.util.Scanner;

public class Sach {
    // --- PHẦN 1: DỮ LIỆU VÀ HÀM CỦA TỪNG CUỐN SÁCH CÁ NHÂN ---
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

    public void nhap(Scanner sc) {
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = sc.nextInt();
        System.out.print("Nhap so trang: ");
        this.soTrang = sc.nextInt();
        sc.nextLine(); 
    }

    public void output() {
        System.out.println("Ten sach: " + tenSach + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | So trang: " + soTrang);
    }

    // --- PHẦN 2: CÁC HÀM CHỨC NĂNG QUẢN LÝ MẢNG (STATIC) ---
    
    public static Sach[] nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong sach can them (N): ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Sach[] ds = new Sach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("   Nhap thong tin sach thu " + (i + 1) + "   ");
            ds[i] = new Sach();
            ds[i].nhap(sc);
        }
        return ds;
    }

    public static void xuatDanhSach(Sach[] ds) {
        if (ds == null || ds.length == 0) {
            System.out.println("Danh sach dang trong!");
            return;
        }
        System.out.println("   DANH SACH CUON SACH   ");
        for (Sach s : ds) {
            s.output();
        }
    }

    public static void sapXepTheoTen(Sach[] ds) {
        if (ds == null || ds.length == 0) {
            System.out.println("Danh sach dang trong!");
            return;
        }
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = 0; j < ds.length - 1 - i; j++) {
                if (ds[j].getTenSach().compareToIgnoreCase(ds[j + 1].getTenSach()) > 0) {
                    Sach temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong theo Ten Sach! Chon 2 de xem ket qua.");
    }

    public static void sapXepTheoSoTrang(Sach[] ds) {
        if (ds == null || ds.length == 0) {
            System.out.println("Danh sach dang trong!");
            return;
        }
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = 0; j < ds.length - 1 - i; j++) {
                if (ds[j].getSoTrang() > ds[j + 1].getSoTrang()) {
                    Sach temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong theo So Trang! Chon 2 de xem ket qua.");
    }

    public static void timKiemTheoTen(Sach[] ds, String tenCanTim) {
        if (ds == null || ds.length == 0) {
            System.out.println("Danh sach dang trong!");
            return;
        }
        boolean timThay = false;
        System.out.println("   KET QUA TIM KIEM   ");
        for (Sach s : ds) {
            if (s.getTenSach().equalsIgnoreCase(tenCanTim)) {
                s.output();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay cuon sach nao co ten: " + tenCanTim);
        }
    }
}
