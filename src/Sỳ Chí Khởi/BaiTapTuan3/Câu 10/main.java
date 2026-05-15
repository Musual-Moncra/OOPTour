package main;

import java.util.Scanner;
import thisinh.DanhSachTS;
import truongdaihoc.TruongDaiHoc;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachTS quanLy = new DanhSachTS();
        
        quanLy.nhapDanhSach(sc);
        
        TruongDaiHoc hsu = new TruongDaiHoc("HSU", 15.0);
        quanLy.xuatDanhSachTrungTuyen(hsu);
        
        sc.close();
    }
}
