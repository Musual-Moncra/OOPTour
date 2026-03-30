package baitaptuan3;

import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private String sbd;
    private double diemToan;
    private double diemVan;
    private double diemNgoaiNgu;

    public ThiSinh() {
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap so bao danh: ");
        this.sbd = sc.nextLine();
        System.out.print("Nhap diem Toan: ");
        this.diemToan = sc.nextDouble();
        System.out.print("Nhap diem Van: ");
        this.diemVan = sc.nextDouble();
        System.out.print("Nhap diem Ngoai ngu: ");
        this.diemNgoaiNgu = sc.nextDouble();
        sc.nextLine(); 
    }

    public double tinhDiemXetTuyen() {
        return (diemToan * 2) + (diemVan * 2) + diemNgoaiNgu;
    }

    public boolean xetTuyen() {
        double diemXT = tinhDiemXetTuyen();
        
        if (diemXT >= 17 && diemToan > 0 && diemVan > 0 && diemNgoaiNgu > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void xuatKetQua() {
        String ketQua = xetTuyen() ? "Trung tuyen" : "Truot";
        
        System.out.printf("SBD: %-5s | Ho ten: %-15s | Diem XT: %5.1f | Ket qua: %s\n", 
                          sbd, hoTen, tinhDiemXetTuyen(), ketQua);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh[] ds = new ThiSinh[3];

        System.out.println("   NHAP THONG TIN 3 THI SINH   ");
        for (int i = 0; i < ds.length; i++) {
            System.out.println("   Thi sinh thu " + (i + 1) + "   ");
            ds[i] = new ThiSinh();
            ds[i].nhap(sc);
        }

        System.out.println("\n   KET QUA XET TUYEN LOP 10   ");
        for (ThiSinh ts : ds) {
            ts.xuatKetQua();
        }
        sc.close();
    }
}