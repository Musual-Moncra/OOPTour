package thisinh;

import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private String sbd;
    private double diem1;
    private double diem2;
    private double diem3;
    private boolean hsGioi;
    private boolean uuTien;

    public ThiSinh() {}

    public ThiSinh(String hoTen, String sbd, double diem1, double diem2, double diem3, boolean hsGioi, boolean uuTien) {
        this.hoTen = hoTen;
        this.sbd = sbd;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.hsGioi = hsGioi;
        this.uuTien = uuTien;
    }

    public String getHoTen() { return hoTen; }
    public String getSbd() { return sbd; }

    public double tinhDiemXetTuyen() {
        double tong = diem1 + diem2 + diem3;
        if (hsGioi) tong += 1.0;
        if (uuTien) tong += 0.5;
        return tong;
    }

    public boolean kiemTraDiemLiet() {
        return (diem1 == 0 || diem2 == 0 || diem3 == 0);
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
        System.out.print("HS Gioi (1-Co, 0-Khong): ");
        this.hsGioi = (sc.nextInt() == 1);
        System.out.print("Uu tien (1-Co, 0-Khong): ");
        this.uuTien = (sc.nextInt() == 1);
        sc.nextLine();
    }
}
