package thisinh;

import java.util.Scanner;
import truongdaihoc.TruongDaiHoc;

public class DanhSachTS {
    private ThiSinh[] dsCoDinh;
    private ThiSinh[] dsNhapVao;

    public DanhSachTS() {
        dsCoDinh = new ThiSinh[2];
        dsCoDinh[0] = new ThiSinh("Nguyen Van Co Dinh", "CD01", 7.0, 8.0, 9.0, true, false);
        dsCoDinh[1] = new ThiSinh("Le Thi Co Dinh", "CD02", 5.0, 5.0, 5.0, false, true);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong thi sinh can them: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        dsNhapVao = new ThiSinh[n]; 
        
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP THONG TIN THI SINH ");
            dsNhapVao[i] = new ThiSinh();
            dsNhapVao[i].nhap(sc);
        }
    }

    public void xuatDanhSachTrungTuyen(TruongDaiHoc truong) {
        System.out.println("\n   DANH SACH THI SINH TRUNG TUYEN VAO " + truong.getTenTruong().toUpperCase() + "   ");

        // Kiem tra danh sach co dinh
        for (int i = 0; i < dsCoDinh.length; i++) {
            if (dsCoDinh[i].tinhDiemXetTuyen() >= truong.getDiemChuan() && !dsCoDinh[i].kiemTraDiemLiet()) {
                System.out.println("+ " + dsCoDinh[i].getHoTen() + " (SBD: " + dsCoDinh[i].getSbd() + ") - Diem: " + dsCoDinh[i].tinhDiemXetTuyen());
            }
        }

        // Kiem tra danh sach nhap vao
        if (dsNhapVao != null) {
            for (int i = 0; i < dsNhapVao.length; i++) {
                if (dsNhapVao[i].tinhDiemXetTuyen() >= truong.getDiemChuan() && !dsNhapVao[i].kiemTraDiemLiet()) {
                    System.out.println("+ " + dsNhapVao[i].getHoTen() + " (SBD: " + dsNhapVao[i].getSbd() + ") - Diem: " + dsNhapVao[i].tinhDiemXetTuyen());
                }
            }
        }
    }
}
