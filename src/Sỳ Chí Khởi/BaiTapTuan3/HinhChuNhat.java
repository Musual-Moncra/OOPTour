package baitaptuan3;

import java.util.Scanner;

public class HinhChuNhat {
    public int chieuDai, chieuRong;
    
    public HinhChuNhat(){
         
     }
    public HinhChuNhat(int chieuDai, int chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }
    public void veHinh(){
        for(int i=0; i < chieuRong; i++){
            for(int j=0; j<chieuDai;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public int tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public int tinhDienTich(){
        return (chieuDai*chieuRong);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. VE HINH CHU NHAT TU BAN PHIM");
        System.out.print("Nhap chieu dai: ");
        int cd = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        int cr = sc.nextInt();
        
        HinhChuNhat hcnUser = new HinhChuNhat(cd, cr);
        
        System.out.println("\n-> Hinh ve:");
        hcnUser.veHinh();
        System.out.println("-> Chu vi: " + hcnUser.tinhChuVi());
        System.out.println("-> Dien tich: " + hcnUser.tinhDienTich());
        
        //3 hinhchunhat bat ki
        HinhChuNhat h1 = new HinhChuNhat(5, 3);
        HinhChuNhat h2 = new HinhChuNhat(8, 4);
        HinhChuNhat h3 = new HinhChuNhat(10, 5);
        int tongChuVi = h1.tinhChuVi() + h2.tinhChuVi() + h3.tinhChuVi();
        double binhQuanDT = (h1.tinhDienTich() + h2.tinhDienTich() + h3.tinhDienTich()) / 3.0;
        System.out.println("Tong chu vi cua 3 hinh: " + tongChuVi);
        System.out.printf("Binh quan dien tich cua 3 hinh: %.2f\n", binhQuanDT);
    }    
}