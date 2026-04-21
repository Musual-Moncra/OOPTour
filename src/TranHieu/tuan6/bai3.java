package TranHieu.tuan6;

/*
3)	Xây dựng lớp sản phẩm (SanPham.java) bao gồm
-	tên, giá, số lượng 
-	Constructor 3 tham số: tên, giá, số lượng
-	Hàm getThanhTien: return giá * số lượng
-	Biến tĩnh tổng tiền bằng tổng thành tiền của tất cả các sản phẩm được tạo ra
-	Phương thức xuat(): tên, giá, số lượng và thành tiền
-	Phương thức tĩnh getTongTien(): return tổng tiền
-	Hàm main() tạo ra n sản phẩm và xuất n sản phẩm cùng tổng tiền.
-	Code gợi ý
public SanPham(String tensp, int sl, int gia) {
        tenSP = tensp;
        soluong = sl;
        dongia = gia;
        tongtien += getThanhTien();
}
*/

public class bai3 {
    public static void main(String[] args) {
        sanpham[] sanPhams = new sanpham[5];
        sanPhams[0] = new sanpham("John", 1, 10);
        sanPhams[1] = new sanpham("Jane", 2, 20);
        sanPhams[2] = new sanpham("Bob", 3, 30);
        sanPhams[3] = new sanpham("Alice", 4, 40);
        sanPhams[4] = new sanpham("Mike", 5, 50);
        for (int i = 0; i < 5; i++) {
            sanPhams[i].xuat();
        }
        System.out.println("Total number of products: " + sanpham.getTongTien());
    }
}
