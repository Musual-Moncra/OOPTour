package main;

import java.util.Scanner;
import thisinh.DanhSachTS;
import truongdaihoc.TruongDaiHoc;

public class Main {
    public static void main(String[] args) {
        Scanner sc   new Scanner(System.in);
        
        // Khoi tao quan ly danh sach (da co san 2 thi sinh co dinh ben trong)
        DanhSachTS quanLy   new DanhSachTS();
        
        // Nhap danh sach thi sinh moi tu ban phim
        System.out.println("   NHAP DANH SACH THI SINH TUY CHINH   ");
        quanLy.nhapDanhSach(sc);
        
        // Khoi tao thong tin truong dai hoc
        TruongDaiHoc hsu   new TruongDaiHoc("HSU", 15.0);
        
        // 1. Xuat toan bo ket qua xet tuyen (ca trung va truot)
        System.out.println("\n--- TIEN HANH XET TUYEN ---");
        quanLy.xetTuyenTongHop(hsu);
        
        // 2. Chi xuat nhung thi sinh thuc su trung tuyen
        System.out.println("\n--- LOC DANH SACH TRUNG TUYEN CUOI CUNG ---");
        quanLy.xuatDanhSachTrungTuyen(hsu);
        
        sc.close();
    }
}
