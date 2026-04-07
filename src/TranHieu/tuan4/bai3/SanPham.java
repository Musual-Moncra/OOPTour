package TranHieu.tuan4.bai3;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String donViTinh;
    private double gia;
    private int namSanXuat;

    public SanPham(String maSP, String tenSP, String donViTinh, double gia, int namSanXuat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donViTinh = donViTinh;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    // Getter cho giá để dùng ở câu b và c
    public double getGia() {
        return gia;
    }

    public void xuatSanPham() {
        System.out.printf("%-10s %-20s %-10s %-10.0f %-10d\n", maSP, tenSP, donViTinh, gia, namSanXuat);
    }
}