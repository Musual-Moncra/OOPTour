
package baitaptuan2;
import java.util.Scanner;
/*
    Sy Chi Khoi-Molten
    +3/17/2026- done cau 1
  
 */
public class BaiTapTuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //IfELseDemo();
        Cau1();
    }

    
    public static void IfELseDemo()
    {
        int testscore = 76;
        char grade;
        
        if (testscore >=90 ){
            grade ='A';
        }else if (testscore >=80){
            grade ='B';
        }else {
            grade ='F';
        }
        System.out.println("Grade ="+ grade);
    }

    public static void Cau1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("canh a: ");
        double a = sc.nextDouble();
        System.out.print("canh b: ");
        double b = sc.nextDouble();
        System.out.print("canh c: ");
        double c = sc.nextDouble();

        //check condition
        if (a + b > c && a + c > b && b + c > a) {
            
            //Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } 
            else if ((a == b && a * a + b * b == c * c) ||(a == c && a * a + c * c == b * b)||(b == c && b * b + c * c == a * a)) {
                System.out.println("Day la tam giac vuong can");
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Day la tam giac vuong");
            } 
            else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
            } 
            else {
                System.out.println("day la tam giac thuong");
            }
        } else {
            System.out.println("この3辺は三角形を構成しません!");//Ba cạnh này không tạo thành một tam giác!
        }
    }
}