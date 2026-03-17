
package baitaptuan1;
import java.util.Scanner;
/*
  Sy Chi Khoi
  17/03/2026
*/
public class BaiTapTuan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Bai01();
        //Bai02();
        //Bai03(); 
        Bai04();
    }
    public static void Bai01() 
    {
        System.out.println("Hello World!");
       
    }
 
    public static void Bai02() 
    {
        String HoTen;
        int NamSinh;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ho ten: ");
        HoTen = sc.nextLine();
        
        System.out.print("nam sinh: ");
        NamSinh = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ten: " + HoTen + "\nTuoi: " + (2026-NamSinh));
    }
    
    public static void Bai03() 
    {
        String hoten;
        float diem1, diem2, diem3, CK;
            
            Scanner sc = new Scanner(System.in);
            System.out.print("ho ten: ");
            hoten = sc.nextLine();
            
            System.out.print("Nhap diem 1: ");
            diem1 = Float.parseFloat(sc.nextLine());
            
            System.out.print("Nhap diem 2: ");
            diem2 = Float.parseFloat(sc.nextLine());
            
            System.out.print("Nhap diem 3: ");
            diem3 = Float.parseFloat(sc.nextLine());
            
            CK = ((diem1 + diem2 + diem3)/3);
            
            System.out.println("Ten: " + hoten + "\nDiem: " + Math.round((CK*10)/10));
    }
    
    public static void Bai04()
    {
        Scanner sc = new Scanner(System.in);
        
        int GIA = 2035;

        System.out.print("Nhap ho va ten khach hang: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap so luong san pham da mua: ");
        int soLuongSP = sc.nextInt();

        int soLuongQua = soLuongSP / 5;
        int soLuongGG = soLuongSP % 5;
        
        double tongTienTra = (soLuongSP * GIA) - (soLuongGG * GIA * 0.02);

        System.out.println("\n-------------------");
        System.out.println("- Khach hang: " + hoTen);
        System.out.println("- So luong sp da mua: " + soLuongSP);
        System.out.println("- So phan qua nhan duoc: " + soLuongQua);
        System.out.println("- So sp duoc giam gia: " + soLuongGG);
        System.out.printf("- Tong tien phai tra: %.2f\n", tongTienTra);
        
    }
}
    