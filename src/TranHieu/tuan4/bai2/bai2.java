/*
2)	Xây dựng lớp sinh viên (SinhVien.java) bao gồm: 
-	Mã số, họ tên và năm sinh
-	Hàm khời tạo (constructor) 0 tham số và 3 tham số để khởi tạo giá trị cho Mã số, Họ tên và Năm sinh
-	Hàm nhập Mã số, Họ tên và Năm sinh từ người dùng
-	Hàm tính tuổi dựa vào năm sinh
-	Hàm xuất 1 dòng bao gồm Mã số, Họ tên và tuổi hiện tại
Lớp Main (Main.java) chứa hàm main()
a.	Tạo đối tượng sinh viên dùng constructor 3 tham số
b.	Tạo đối tượng sinh viên dùng constructor 0 tham số. Nhập thông tin sinh viên từ người dùng
c.	Xuất thông tin 2 sinh viên trên ra màn hình
 */

package TranHieu.tuan4.bai2;

public class bai2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("123", "Tran Van A", 2004);
        SinhVien sv2 = new SinhVien();
        sv2.nhap();
        sv1.xuat();
        sv2.xuat();
    }
}
