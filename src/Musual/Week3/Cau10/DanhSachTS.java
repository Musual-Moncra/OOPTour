package thisinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import truongdaihoc.TruongDaiHoc;

/**
 * Lớp DanhSachTS quản lý toàn bộ danh sách thí sinh.
 *
 * <p>Gồm hai nguồn dữ liệu:</p>
 * <ol>
 *   <li><b>Danh sách cố định (dsCoDinh)</b> — được khởi tạo sẵn trong constructor.</li>
 *   <li><b>Danh sách nhập vào (dsNhapVao)</b> — người dùng nhập từ bàn phím khi chạy.</li>
 * </ol>
 *
 * <p><b>Tối ưu so với bản gốc:</b></p>
 * <ul>
 *   <li>Thay mảng tĩnh (ThiSinh[]) bằng {@link ArrayList} → linh hoạt, không cần biết trước số phần tử.</li>
 *   <li>Dùng enhanced for-each loop thay for(int i=0...) → code ngắn gọn, ít lỗi off-by-one.</li>
 *   <li>Cache kết quả tinhDiemXetTuyen() vào biến cục bộ → tránh tính lại 2 lần trong cùng 1 if-block.</li>
 *   <li>Thêm phương thức xetTuyenTongHop() còn thiếu (được gọi trong main.java nhưng chưa tồn tại → lỗi biên dịch).</li>
 *   <li>Dùng ThiSinh.toString() thay vì nối chuỗi thủ công trong xuatDanhSachTrungTuyen().</li>
 *   <li>Gộp logic duyệt hai danh sách vào helper riêng để tránh lặp code (DRY principle).</li>
 * </ul>
 */
public class DanhSachTS {

    // Dùng List thay mảng: kích thước động, dễ mở rộng
    private final List<ThiSinh> dsCoDinh;
    private List<ThiSinh>       dsNhapVao;

    /** Khởi tạo và nạp sẵn 2 thí sinh cố định. */
    public DanhSachTS() {
        dsCoDinh = new ArrayList<>();
        dsCoDinh.add(new ThiSinh("Nguyen Van Co Dinh", "CD01", 7.0, 8.0, 9.0, true,  false));
        dsCoDinh.add(new ThiSinh("Le Thi Co Dinh",     "CD02", 5.0, 5.0, 5.0, false, true));
    }

    // ===== INPUT =====

    /**
     * Nhập n thí sinh từ bàn phím và lưu vào dsNhapVao.
     *
     * @param sc Scanner đang sử dụng
     */
    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong thi sinh can them: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xả buffer

        dsNhapVao = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("\n[ NHAP THI SINH " + (i + 1) + "/" + n + " ]");
            ThiSinh ts = new ThiSinh();
            ts.nhap(sc);
            dsNhapVao.add(ts);
        }
    }

    // ===== OUTPUT / BUSINESS LOGIC =====

    /**
     * Xét tuyển tổng hợp — in kết quả từng thí sinh (trúng hoặc trượt).
     *
     * <p><b>Thêm mới:</b> Phương thức này bị gọi trong main.java nhưng
     * hoàn toàn vắng mặt trong bản gốc, gây lỗi biên dịch
     * (cannot find symbol: xetTuyenTongHop).</p>
     *
     * @param truong Trường đại học cần xét tuyển vào
     */
    public void xetTuyenTongHop(TruongDaiHoc truong) {
        System.out.println("\n=== XET TUYEN VAO: " + truong.getTenTruong().toUpperCase() + " ===");
        System.out.printf("%-5s  %-25s  %-8s  %s%n", "STT", "Ho Ten", "Diem XT", "Ket Qua");
        System.out.println("-".repeat(60));

        int stt = 1;
        stt = xetTuyenDanhSach(dsCoDinh, truong, stt);
        if (dsNhapVao != null) {
            xetTuyenDanhSach(dsNhapVao, truong, stt);
        }
    }

    /**
     * Xuất danh sách thí sinh trúng tuyển (lọc đạt điểm chuẩn và không liệt).
     *
     * <p><b>Tối ưu:</b> Dùng toString() của ThiSinh thay vì nối chuỗi thủ công.</p>
     *
     * @param truong Trường đại học cần lọc
     */
    public void xuatDanhSachTrungTuyen(TruongDaiHoc truong) {
        System.out.println("\n=== DANH SACH TRUNG TUYEN: " + truong.getTenTruong().toUpperCase() + " ===");

        boolean coAiTrungTuyen = false;
        coAiTrungTuyen |= xuatTrungTuyenDanhSach(dsCoDinh, truong);
        if (dsNhapVao != null) {
            coAiTrungTuyen |= xuatTrungTuyenDanhSach(dsNhapVao, truong);
        }

        if (!coAiTrungTuyen) {
            System.out.println("  (Khong co thi sinh nao trung tuyen)");
        }
    }

    // ===== PRIVATE HELPERS (DRY - Don't Repeat Yourself) =====

    /**
     * Helper: duyệt một danh sách và in kết quả xét tuyển từng người.
     * Tách ra để tránh lặp code giữa dsCoDinh và dsNhapVao.
     *
     * <p><b>Tối ưu cache:</b> gọi tinhDiemXetTuyen() một lần,
     * lưu vào biến cục bộ 'diem', dùng lại 2 chỗ (so sánh + in).</p>
     *
     * @param ds     Danh sách thí sinh cần duyệt
     * @param truong Trường so sánh điểm chuẩn
     * @param stt    Số thứ tự bắt đầu
     * @return       Số thứ tự tiếp theo sau khi duyệt xong
     */
    private int xetTuyenDanhSach(List<ThiSinh> ds, TruongDaiHoc truong, int stt) {
        for (ThiSinh ts : ds) {
            double diem = ts.tinhDiemXetTuyen();     // Cache: tính 1 lần, dùng 2 lần
            boolean liet = ts.kiemTraDiemLiet();
            String ketQua;

            if (!liet && diem >= truong.getDiemChuan()) {
                ketQua = "TRUNG TUYEN";
            } else if (liet) {
                ketQua = "TRUOT (Diem liet)";
            } else {
                ketQua = "TRUOT (Thieu " + String.format("%.1f", truong.getDiemChuan() - diem) + " diem)";
            }

            System.out.printf("%-5d  %-25s  %-8.1f  %s%n", stt++, ts.getHoTen(), diem, ketQua);
        }
        return stt;
    }

    /**
     * Helper: duyệt một danh sách và in những ai trúng tuyển.
     *
     * @param ds     Danh sách thí sinh
     * @param truong Trường cần lọc
     * @return       true nếu có ít nhất 1 thí sinh trúng tuyển
     */
    private boolean xuatTrungTuyenDanhSach(List<ThiSinh> ds, TruongDaiHoc truong) {
        boolean found = false;
        for (ThiSinh ts : ds) {
            double diem = ts.tinhDiemXetTuyen(); // Cache
            if (diem >= truong.getDiemChuan() && !ts.kiemTraDiemLiet()) {
                System.out.println("  + " + ts); // Gọi ThiSinh.toString()
                found = true;
            }
        }
        return found;
    }
}
