package baitaptuan3;

public class MainCau2 {
    public static void main(String[] args) {
        // 1. Tạo đối tượng dùng Constructor 3 tham số
        // Dữ liệu được truyền thẳng vào lúc tạo mới (new)
        SinhVien sv1 = new SinhVien("22502168", "Sy Chi Khoi", 2004);

        // 2. Tạo đối tượng dùng Constructor 0 tham số
        SinhVien sv2 = new SinhVien();
        // Phải gọi hàm nhập để điền thông tin vào "khung trống"
        System.out.println("--- Nhap thong tin cho Sinh vien 2 ---");
        sv2.nhap();

        // 3. Xuất thông tin cả 2 sinh viên
        sv1.xuat();
        sv2.xuat();
    }
}
