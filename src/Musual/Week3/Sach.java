package Musual.Week3;

public class Sach {
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soTrang;

    public Sach(String tenSach, String tacGia, int namXuatBan, int soTrang) {
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

    public void xuatThongTin() {
        System.out.println("Tên sách: " + this.tenSach + ", Tác giả: " + this.tacGia + 
                           ", Năm XB: " + this.namXuatBan + ", Số trang: " + this.soTrang);
    }
}
