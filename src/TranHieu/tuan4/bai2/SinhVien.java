package TranHieu.tuan4.bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSo;
    private String hoTen;
    private int namSinh;

    public SinhVien() {

    }

    public SinhVien(String maSo, String hoTen, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        sc.close();
    }

    public int tinhTuoi() {
        return 2026 - namSinh;
    }

    public void xuat() {
        System.out.println(
                "Ma so: " + maSo + "\t Ho ten: " + hoTen + "\t Nam sinh: " + namSinh + ", Tuoi: " + tinhTuoi());
    }
}
