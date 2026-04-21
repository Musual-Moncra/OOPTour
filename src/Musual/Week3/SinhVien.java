package Week3;

import java.util.Scanner;
import java.util.Calendar;

public class SinhVien {
    private String maSo;
    private String hoTen;
    private int namSinh;

    // Default constructor (0 tham so)
    public SinhVien() {
    }

    // Constructor 3 tham so
    public SinhVien(String maSo, String hoTen, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    // Getters and Setters
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    // Ham nhap thong tin tu ban phim
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma So Sinh Vien: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap Ho va Ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap Nam Sinh: ");
        this.namSinh = sc.nextInt();
    }

    // Ham tinh tuoi
    public int tinhTuoi() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.namSinh;
    }

    // Ham xuat 1 dong: maSo, hoTen, tuoi
    public void xuat() {
        System.out.println("Ma So: " + this.maSo + " | Ho Ten: " + this.hoTen + " | Tuoi Hien Tai: " + this.tinhTuoi());
    }
}
