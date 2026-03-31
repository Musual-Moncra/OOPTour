package Musual.Week3;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== a. TAO 3 SAN PHAM KHAC NHAU ===");
        SanPham sp1 = new SanPham("SP01", "Laptop Dell", "Cai", 15000000, 2022);
        SanPham sp2 = new SanPham("SP02", "Chuot Logitech", "Cai", 500000, 2023);
        SanPham sp3 = new SanPham("SP03", "Ban Phim Co", "Cai", 1200000, 2021);
        
        sp1.xuat();
        sp2.xuat();
        sp3.xuat();
        
        System.out.println("\n=== b. TINH TONG TIEN HOA DON ===");
        int sl1 = 3;
        int sl2 = 10;
        int sl3 = 7;
        double tongTien = (sp1.getGia() * sl1) + (sp2.getGia() * sl2) + (sp3.getGia() * sl3);
        System.out.println("Tong tien cua hoa don: " + tongTien + " VND");
        
        System.out.println("\n=== c. MANG N SAN PHAM BAT KY, TIM GIA CAO NHAT ===");
        final int N = 5;
        SanPham[] arrSP = new SanPham[N];
        Random rand = new Random();
        
        // Tao ra N san pham (gia random tu 1.000.000 den 10.000.000)
        for(int i = 0; i < N; i++) {
            double randomGia = 1000000 + (9000000 * rand.nextDouble());
            // Làm tròn giá cho đẹp
            randomGia = Math.round(randomGia / 1000) * 1000; 
            arrSP[i] = new SanPham("RAND" + i, "San Pham " + i, "Cai", randomGia, 2020 + rand.nextInt(4));
            arrSP[i].xuat();
        }
        
        // Tim gia cao nhat
        SanPham maxSP = arrSP[0];
        for (int i = 1; i < N; i++) {
            if (arrSP[i].getGia() > maxSP.getGia()) {
                maxSP = arrSP[i];
            }
        }
        
        System.out.println("-> San pham thuoc mang N co gia cao nhat la:");
        maxSP.xuat();
    }
}
