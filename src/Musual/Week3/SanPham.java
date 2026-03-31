package Musual.Week3;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String donViTinh;
    private double gia;
    private int namSanXuat;

    // Constructor 5 tham so
    public SanPham(String maSP, String tenSP, String donViTinh, double gia, int namSanXuat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donViTinh = donViTinh;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    // Getters
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public double getGia() {
        return gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    // Ham xuat thong tin 1 san pham la 1 dong
    public void xuat() {
        System.out.println(this.maSP + ";" + this.tenSP + ";" + this.donViTinh + ";" + this.gia + ";" + this.namSanXuat);
    }
}
