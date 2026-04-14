package TranHieu.tuan5;

import java.util.Scanner;

public class thongtinsach {
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soTrang;

    public thongtinsach() {
    }

    public thongtinsach(String tenSach, String tacGia, int namXuatBan, int soTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();
        sc.close();
    }

    public void xuat() // in ra thong tin sach, khong gan them duoc chuoi nao nx
    {
        System.out.println("Ten sach: " + tenSach + "\t Tac gia: " + tacGia + "\t Nam xuat ban: " + namXuatBan
                + "\t So trang: " + soTrang);
    }

    public String toString() // chuyen thong tin sach thanh chuoi, gan them dc ham chuoi
    {
        return "Ten sach: " + tenSach + "\t Tac gia: " + tacGia + "\t Nam xuat ban: " + namXuatBan
                + "\t So trang: " + soTrang;
    }
}
