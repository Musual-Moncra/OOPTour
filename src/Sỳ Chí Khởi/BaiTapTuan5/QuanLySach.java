package baitaptuan5;

import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach[] ds = null; 
        int luaChon;

        do {
            System.out.println("\n   MENU QUAN LY SACH   ");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sap xep theo ten");
            System.out.println("4. Sap xep theo so trang");
            System.out.println("5. Tim kiem theo ten sach");
            System.out.println("Nhan so bat ky (khac 1-5) de thoat");
            System.out.print("Moi ban chon chuc nang: ");
            
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    ds = Sach.nhapDanhSach(sc);
                    break;
                case 2:
                    Sach.xuatDanhSach(ds);
                    break;
                case 3:
                    Sach.sapXepTheoTen(ds);
                    break;
                case 4:
                    Sach.sapXepTheoSoTrang(ds);
                    break;
                case 5:
                    System.out.print("Nhap ten sach can tim: ");
                    String tenCanTim = sc.nextLine();
                    Sach.timKiemTheoTen(ds, tenCanTim);
                    break;
                default:
                    System.out.println("Da thoat chuong trinh quan ly sach.");
                    break;
            }
        } while (luaChon >= 1 && luaChon <= 5);
        
        sc.close();
    }
}
