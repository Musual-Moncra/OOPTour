package TranHieu.tuan4.bai10;

import java.util.Scanner;

public class LopThiSinh {
    private String hoTen;
    private String SBD;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;
    private boolean hsGioi;
    private boolean doiTuongUuTien;
    private Scanner sc = new Scanner(System.in);

    public LopThiSinh() {
    }

    public LopThiSinh(String hoTen, String SBD, double diemMon1, double diemMon2, double diemMon3, boolean hsGioi,
            boolean doiTuongUuTien) {
        this.hoTen = hoTen;
        this.SBD = SBD;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.hsGioi = hsGioi;
        this.doiTuongUuTien = doiTuongUuTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void nhap() {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so bao danh: ");
        SBD = sc.nextLine();
        System.out.print("Nhap diem mon 1: ");
        diemMon1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem mon 2: ");
        diemMon2 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem mon 3: ");
        diemMon3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap co phai hoc sinh gioi khong (true/false): ");
        hsGioi = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap co phai doi tuong uu tien khong (true/false): ");
        doiTuongUuTien = Boolean.parseBoolean(sc.nextLine());
    }

    public double tinhDiemXetTuyen() {
        return diemMon1 + diemMon2 + diemMon3 + (hsGioi ? 1 : 0) + (doiTuongUuTien ? 0.5 : 0);
    }

    public boolean kiemTraDiemLiet() {
        return diemMon1 == 0 || diemMon2 == 0 || diemMon3 == 0;
    }

    public void xuat() {
        System.out.println(
                "Ho ten: " + hoTen + "|So bao danh" + SBD + " Diem XT: " + tinhDiemXetTuyen() + " | Diem Liet: "
                        + kiemTraDiemLiet());
    }
}