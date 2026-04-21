package TranHieu.tuan6;

/*
5)	Viết chương trình thực hiện các phép toán cộng, trừ, nhân, chia trên hai phân số
•	Lớp phân số bao gồm 
-	Tử số và mẫu số, constructor 2 tham số
-	Phương thức 
o	toString(): trả về chuỗi phân số dạng a/b, 
o	toiGian(): tham khảo thuật toán tìm UCLN
•	Lớp PhepToan: bao gồm các phương thức tĩnh Cong2PS(ps1, ps2), Nhan2PS(ps1, ps2)
uint UCLN(uint a, uint b)
{
while(a!=b)
{
    if(a>b) 
            a-=b;
    else 
            b-=a;
}
      return a;//BCNN=a*b/UCLN
*/

public class bai5 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 4);

        System.out.println("Phân số 1: " + ps1);
        System.out.println("Phân số 2: " + ps2);

        System.out.println("Cộng: " + PhepToan.cong2PS(ps1, ps2));
        System.out.println("Trừ: " + PhepToan.tru2PS(ps1, ps2));
        System.out.println("Nhân: " + PhepToan.nhan2PS(ps1, ps2));
        System.out.println("Chia: " + PhepToan.chia2PS(ps1, ps2));
    }
}
