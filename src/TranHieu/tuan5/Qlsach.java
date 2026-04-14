package TranHieu.tuan5;

import java.util.Scanner;

public class Qlsach {
    private thongtinsach[] danhSach;
    private int n;
    private Scanner sc = new Scanner(System.in);

    public void NhapDanhSach() {
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();

        danhSach = new thongtinsach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cuon sach thu " + (i + 1) + ":");
            danhSach[i] = new thongtinsach();
            danhSach[i].nhap();
        }
    }

    public void XuatDanhSach() {
        if (danhSach == null) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (int i = 0; i < n; i++) {
            danhSach[i].xuat();
        }
    }

    public void TimSachMoiNhat() {
        if (n == 0)
            return;
        int maxNam = danhSach[0].getNamXuatBan();
        for (int i = 1; i < n; i++) {
            if (danhSach[i].getNamXuatBan() > maxNam) {
                maxNam = danhSach[i].getNamXuatBan();
            }
        }

        System.out.println("Cac cuon sach xuat ban moi nhat (" + maxNam + "):");
        for (int i = 0; i < n; i++) {
            if (danhSach[i].getNamXuatBan() == maxNam) {
                danhSach[i].xuat();
            }
        }
    }

    public void SapXepTheoSoTrang() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (danhSach[i].getSoTrang() > danhSach[j].getSoTrang()) {
                    thongtinsach temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep theo so trang tang dan!");
    }

    public void SapXepTheoTen() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // compareToIgnoreCase: So sánh 2 chuỗi, không phân biệt hoa thường
                // Trả về số dương (>0) nếu tên i đứng sau tên j trong bảng chữ cái
                if (danhSach[i].getTenSach().compareToIgnoreCase(danhSach[j].getTenSach()) > 0) {
                    thongtinsach temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep theo ten A-Z!");
    }

    public void TimSachTheoTen() {
        if (n == 0)
            return;
        System.out.print("Nhap ten sach can tim: ");
        String ten = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (danhSach[i].getTenSach().equalsIgnoreCase(ten)) {
                danhSach[i].xuat();
            }
        }
    }

    public void Menu() {
        int chon;
        do {
            System.out.println("\n--- QUAN LY SACH ---");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sap xep theo so trang");
            System.out.println("4. Sap xep theo ten");
            System.out.println("5. Tim sach moi nhat");
            System.out.println("6. Tim sach theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    NhapDanhSach();
                    break;
                case 2:
                    XuatDanhSach();
                    break;
                case 3:
                    SapXepTheoSoTrang();
                    break;
                case 4:
                    SapXepTheoTen();
                    break;
                case 5:
                    TimSachMoiNhat();
                    break;
                case 6:
                    TimSachTheoTen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chon sai roi!");
            }
        } while (chon != 0);
    }
}