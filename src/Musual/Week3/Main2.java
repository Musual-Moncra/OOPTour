package Week3;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== TAO SINH VIEN BANG CONSTRUCTOR 3 THAM SO ===");
        // a. Tạo đối tượng sinh viên dùng constructor 3 tham số
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 2004);
        
        System.out.println("\n=== TAO SINH VIEN BANG CONSTRUCTOR 0 THAM SO ===");
        // b. Tạo đối tượng sinh viên dùng constructor 0 tham số. Nhập thông tin sinh viên từ người dùng
        SinhVien sv2 = new SinhVien();
        sv2.input();
        
        System.out.println("\n=== THONG TIN 2 SINH VIEN ===");
        // c. Xuất thông tin 2 sinh viên ra màn hình
        sv1.xuat();
        sv2.xuat();
    }
}
