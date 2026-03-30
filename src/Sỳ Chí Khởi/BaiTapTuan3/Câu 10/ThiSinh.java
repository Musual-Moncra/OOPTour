package thisinh;

import java.util.Scanner;
import truongdaihoc.TruongDaiHoc;

public class ThiSinh {
    private String hoTen;
    private String sbd;
    private double diem1;
    private double diem2;
    private double diem3;
    private boolean hsGioi;
    private boolean uuTien;

    public ThiSinh() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public double tinhDiemXetTuyen() {
        double tong = diem1 + diem2 + diem3;
        if (hsGioi) tong += 1.0;
        if (uuTien) tong += 0.5;
        return tong;
    }

    public boolean kiemTraDiemLiet() {
        if (diem1 == 0 || diem2 == 0 || diem3 == 0) {
            return true;
        }
        return false;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap SBD: ");
        this.sbd = sc.nextLine();
        System.out.print("Nhap diem mon 1: ");
        this.diem1 = sc.nextDouble();
        System.out.print("Nhap diem mon 2: ");
        this.diem2 = sc.nextDouble();
        System.out.print("Nhap diem mon 3: ");
        this.diem3 = sc.nextDouble();
        System.out.print("HS Gioi (1 - Co, 0 - Khong): ");
        this.hsGioi = (sc.nextInt() == 1);
        System.out.print("Uu tien (1 - Co, 0 - Khong): ");
        this.uuTien = (sc.nextInt() == 1);
        sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ThiSinh ts1 = new ThiSinh();
        ThiSinh ts2 = new ThiSinh();
        ThiSinh ts3 = new ThiSinh();

        System.out.println("   NHAP THONG TIN THI SINH 1   ");
        ts1.nhap(sc);
        System.out.println("   NHAP THONG TIN THI SINH 2   ");
        ts2.nhap(sc);
        System.out.println("   NHAP THONG TIN THI SINH 3   ");
        ts3.nhap(sc);

        TruongDaiHoc truongHSU = new TruongDaiHoc("HSU", 15.0);
        TruongDaiHoc truongHUTECH = new TruongDaiHoc("HUTECH", 16.0);
        TruongDaiHoc truongSGU = new TruongDaiHoc("SGU", 15.5);

        System.out.println("\n   KET QUA XET TUYEN   ");
        System.out.println("Xet tuyen Thi sinh 1 vao HSU:");
        truongHSU.xetTuyen(ts1);
        
        System.out.println("\nXet tuyen Thi sinh 2 vao HUTECH:");
        truongHUTECH.xetTuyen(ts2);
        
        System.out.println("\nXet tuyen Thi sinh 3 vao SGU:");
        truongSGU.xetTuyen(ts3);

        sc.close();
    }
}