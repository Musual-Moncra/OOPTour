
package baitaptuan3;
import java.util.Scanner;

public class SanPham {
    public String tenSP, maSP, donViTinh;
    public double gia;
    public int namSX;
    
    public SanPham(String maSP, String tenSP, String donViTinh, double gia, int namSX){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donViTinh = donViTinh;
        this.gia = gia;
        this.namSX = namSX;
    }
    public void xuat() {
        System.out.printf("%s; %s; %s; %,.0f; %d\n", maSP, tenSP, donViTinh, gia, namSX);
    }
    
    public static void main(String[] args) {
        //  Yêu cầu 1: Tạo và xuất 3 sản phẩm
        System.out.println("1. DANH SACH 3 SAN PHAM:");
        SanPham sp1 = new SanPham("SP01", "Laptop ASUS", "Cai", 25000000, 2025);
        SanPham sp2 = new SanPham("SP02", "Chuot Logitech", "Con", 500000, 2024);
        SanPham sp3 = new SanPham("SP03", "Ban phim co", "Cai", 1200000, 2025);

        sp1.xuat();
        sp2.xuat();
        sp3.xuat();

        //  Yêu cầu 2: Tính tổng hóa đơn (số lượng 3, 10, 7) 
        double tongTien = (sp1.gia * 3) + (sp2.gia * 10) + (sp3.gia * 7);
        System.out.println("\n2. TONG TIEN HOA DON:");
        System.out.printf("Tong cong: %,.0f VND\n", tongTien);
        
        //  Yêu cầu 3: Tìm sản phẩm giá cao nhất trong mảng N phần tử 
        final int N = 5; //cho N là hằng số bằng final
        SanPham[] danhSach = new SanPham[N];
        
        danhSach[0] = sp1;
        danhSach[1] = sp2;
        danhSach[2] = sp3;
        danhSach[3] = new SanPham("SP04", "Man hinh Dell", "Cai", 8500000, 2026);
        danhSach[4] = new SanPham("SP05", "Tai nghe Sony", "Cai", 4500000, 2025);

        System.out.println("\n3. TIM SAN PHAM GIA CAO NHAT:");
        SanPham spMax = danhSach[0];
        for (SanPham sp : danhSach) { //vòng lặp foreach
            if (sp.gia > spMax.gia) {
                spMax = sp;
            }
        }
        spMax.xuat();
        
    }
}
