package TranHieu.tuan4.bai3;
/*
3)	Xây dựng lớp sản phẩm (SanPham.java) bao gồm:
-	Mã sản phẩm, Tên sản phẩm, Đơn vị tính, Giá và Năm sản xuất
-	Constructor 5 tham số để khởi tạo giá trị cho 5 thông tin trên
-	Hàm xuất sản phẩm sao cho thông tin 1 sản phẩm là 1 dòng bao gồm 5 thông tin trên cách nhau bởi dấu chấm phẩy (;)
a.	Tạo ra 3 sản phẩm khác nhau và xuất 3 sản phẩm này ra màn hình. 
b.	Giả sử hóa đơn bao gồm 3 sản phẩm trên với số lượng tương ứng là 3,10 và 7. Tính tổng số tiền của hóa đơn
c.	Tạo mảng gồm N sản phẩm bất kỳ (N là hằng số với giá trị được xác định trong chương trình). Tìm sản phẩm có giá cao nhất
 */

public class bai3 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01", "Laptop Lenovo LOQ", "Cái", 20000000, 2024);
        SanPham sp2 = new SanPham("SP02", "Chuột Gaming", "Cái", 1500000, 2023);
        SanPham sp3 = new SanPham("SP03", "Bàn phím cơ", "Cái", 3000000, 2024);

        System.out.println("Danh sach 3 san pham ban dau:");
        sp1.xuatSanPham();
        sp2.xuatSanPham();
        sp3.xuatSanPham();

        // Công thức: Total = (Gia1 * 3) + (Gia2 * 10) + (Gia3 * 7)
        double tongTien = (sp1.getGia() * 3) + (sp2.getGia() * 10) + (sp3.getGia() * 7);
        System.out.printf("\nTong so tien hoa don (3 sp1, 10 sp2, 7 sp3): %.0f VND\n", tongTien);

        // --- Câu c: Tạo mảng N sản phẩm và tìm sản phẩm giá cao nhất ---
        final int N = 4;// Khai báo một hằng số nguyên N với giá trị cố định là 4".ko the change value
                        // dc
        SanPham[] danhSach = new SanPham[N];

        danhSach[0] = sp1;
        danhSach[1] = sp2;
        danhSach[2] = sp3;
        danhSach[3] = new SanPham("SP04", "Man hinh 4K", "Cai", 12000000, 2024);

        SanPham maxGia = danhSach[0];
        for (int i = 1; i < N; i++) {
            if (danhSach[i].getGia() > maxGia.getGia()) {
                maxGia = danhSach[i];
            }
        }

        System.out.println("\nSan pham co gia cao nhat trong mang la:");
        maxGia.xuatSanPham();
    }
}
