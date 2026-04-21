package main;

import java.util.Scanner;

import thisinh.DanhSachTS;
import truongdaihoc.TruongDaiHoc;

/**
 * Lớp Main — điểm vào (entry point) của chương trình tuyển sinh.
 *
 * <p>Luồng chạy:</p>
 * <ol>
 *   <li>Khởi tạo {@link DanhSachTS} (tự nạp 2 thí sinh cố định).</li>
 *   <li>Cho người dùng nhập thêm thí sinh từ bàn phím.</li>
 *   <li>Khởi tạo {@link TruongDaiHoc} (HSU, điểm chuẩn 15.0).</li>
 *   <li>Gọi xetTuyenTongHop() — in bảng kết quả toàn bộ.</li>
 *   <li>Gọi xuatDanhSachTrungTuyen() — in danh sách trúng tuyển cuối.</li>
 * </ol>
 *
 * <p><b>Tối ưu so với bản gốc:</b></p>
 * <ul>
 *   <li>Đóng Scanner trong khối finally để đảm bảo giải phóng tài nguyên dù có lỗi.</li>
 *   <li>Thêm tiêu đề rõ ràng cho từng bước.</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Bước 1: Khởi tạo — 2 thí sinh cố định được nạp tự động
            DanhSachTS quanLy = new DanhSachTS();

            // Bước 2: Nhập thêm thí sinh từ người dùng
            System.out.println("=== NHAP DANH SACH THI SINH TUY CHINH ===");
            quanLy.nhapDanhSach(sc);

            // Bước 3: Cấu hình trường đại học
            TruongDaiHoc hsu = new TruongDaiHoc("HSU", 15.0);

            // Bước 4: In bảng kết quả tổng hợp (trúng + trượt)
            quanLy.xetTuyenTongHop(hsu);

            // Bước 5: In danh sách trúng tuyển cuối cùng
            quanLy.xuatDanhSachTrungTuyen(hsu);

        } finally {
            sc.close(); // Đảm bảo luôn đóng Scanner dù có exception
        }
    }
}
