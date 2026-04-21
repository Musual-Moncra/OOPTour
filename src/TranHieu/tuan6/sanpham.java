package TranHieu.tuan6;

public class sanpham {
    private String tenSP;
    private int soLuong;
    private double gia;
    private static double tongTien = 0;

    public sanpham(String tenSP, int soLuong, double gia) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.gia = gia;
        tongTien += getThanhTien();
    }

    public double getThanhTien() {
        return soLuong * gia;
    }

    public void xuat() {
        System.out.println(tenSP + " - " + soLuong + " - " + gia + " - " + getThanhTien());
    }

    public static double getTongTien() {
        return tongTien;
    }
}