package thisinh;

import java.util.Scanner;
import truongdaihoc.TruongDaiHoc;

public class DanhSachTS {
    private ThiSinh[] dsCoDinh;
    private ThiSinh[] dsNhapVao;

    public DanhSachTS() {
        dsCoDinh = new ThiSinh[2];
        dsCoDinh[0] = new ThiSinh("Nguyen Van A", "CD01", 7.0, 8.0, 9.0, true, false);
        dsCoDinh[1] = new ThiSinh("Le Thi B", "CD02", 4.0, 5.0, 4.0, false, true);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong thi sinh can them: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        dsNhapVao = new ThiSinh[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhap thi sinh moi " + (i + 1) + " ---");
            dsNhapVao[i] = new ThiSinh();
            dsNhapVao[i].nhap(sc);
        }
    }

    public void xuatDanhSachTrungTuyen(TruongDaiHoc truong) {
        System.out.println("\n--- DANH SACH TRUNG TUYEN VAO " + truong.getTenTruong() + " ---");
        for (ThiSinh ts : dsCoDinh) {
            if (ts.tinhDiemXetTuyen() >= truong.getDiemChuan() && !ts.kiemTraDiemLiet()) {
                System.out.println("+ " + ts.getHoTen() + " (SBD: " + ts.getSbd() + ")");
            }
        }
        if (dsNhapVao != null) {
            for (ThiSinh ts : dsNhapVao) {
                if (ts.tinhDiemXetTuyen() >= truong.getDiemChuan() && !ts.kiemTraDiemLiet()) {
                    System.out.println("+ " + ts.getHoTen() + " (SBD: " + ts.getSbd() + ")");
                }
            }
        }
    }
}
