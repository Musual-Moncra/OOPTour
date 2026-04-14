package baitaptuan5;

import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach[] ds = null; // Khởi tạo mảng rỗng ban đầu
        int n = 0;
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
            sc.nextLine(); // Xóa bộ đệm sau khi chọn menu

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sach can them (N): ");
                    n = sc.nextInt();
                    sc.nextLine();
                    
                    ds = new Sach[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("   Nhap thong tin sach thu " + (i + 1) + "   ");
                        ds[i] = new Sach();
                        ds[i].nhap(sc);
                    }
                    break;

                case 2:
                    if (ds != null && n > 0) {
                        System.out.println("   DANH SACH CUON SACH   ");
                        for (Sach s : ds) {
                            s.output();
                        }
                    } else {
                        System.out.println("Danh sach dang trong! Vui long nhap du lieu (Chon 1).");
                    }
                    break;

                case 3:
                    if (ds != null && n > 0) {
                        // Sắp xếp nổi bọt (Bubble Sort) theo Tên sách (A-Z)
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - 1 - i; j++) {
                                if (ds[j].getTenSach().compareToIgnoreCase(ds[j + 1].getTenSach()) > 0) {
                                    Sach temp = ds[j];
                                    ds[j] = ds[j + 1];
                                    ds[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Da sap xep thanh cong theo Ten Sach! Chon 2 de xem ket qua.");
                    } else {
                        System.out.println("Danh sach dang trong!");
                    }
                    break;

                case 4:
                    if (ds != null && n > 0) {
                        // Sắp xếp nổi bọt (Bubble Sort) theo Số trang tăng dần
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - 1 - i; j++) {
                                if (ds[j].getSoTrang() > ds[j + 1].getSoTrang()) {
                                    Sach temp = ds[j];
                                    ds[j] = ds[j + 1];
                                    ds[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Da sap xep thanh cong theo So Trang! Chon 2 de xem ket qua.");
                    } else {
                        System.out.println("Danh sach dang trong!");
                    }
                    break;

                case 5:
                    if (ds != null && n > 0) {
                        System.out.print("Nhap ten sach can tim: ");
                        String tenCanTim = sc.nextLine();
                        boolean timThay = false;

                        System.out.println("   KET QUA TIM KIEM   ");
                        for (Sach s : ds) {
                            // Dùng equalsIgnoreCase để so sánh không phân biệt hoa/thường
                            if (s.getTenSach().equalsIgnoreCase(tenCanTim)) {
                                s.output();
                                timThay = true;
                            }
                        }
                        
                        if (!timThay) {
                            System.out.println("Khong tim thay cuon sach nao co ten: " + tenCanTim);
                        }
                    } else {
                        System.out.println("Danh sach dang trong!");
                    }
                    break;

                default:
                    System.out.println("Da thoat chuong trinh quan ly sach.");
                    break;
            }
        } while (luaChon >= 1 && luaChon <= 5);
        
        sc.close();
    }
}
            }
        }

        System.out.println("\n   SACH CO NAM XUAT BAN MOI NHAT   ");
        sachMoiNhat.output();
    }
}
