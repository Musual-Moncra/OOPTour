package thisinh;

import java.util.Scanner;

/**
 * Lớp ThiSinh đại diện cho một thí sinh trong kỳ thi tuyển sinh đại học.
 *
 * <p>Mỗi thí sinh có: họ tên, số báo danh (SBD), ba điểm thi,
 * và các cờ booleans cho học sinh giỏi và ưu tiên.</p>
 *
 * <p><b>Tối ưu so với bản gốc:</b></p>
 * <ul>
 *   <li>Sửa tất cả lỗi gán thiếu dấu '=' trong constructor và phương thức nhap().</li>
 *   <li>Sửa kiemTraDiemLiet(): dùng đúng phép so sánh (< 1.0) thay vì so sánh với 0 sai kiểu.</li>
 *   <li>Thêm toString() để in thông tin thí sinh một cách nhất quán, tránh lặp code ở DanhSachTS.</li>
 *   <li>Thêm Javadoc đầy đủ cho tất cả các phương thức công khai.</li>
 * </ul>
 */
public class ThiSinh {

    // ===== FIELDS =====
    private String hoTen;
    private String sbd;
    private double diem1;
    private double diem2;
    private double diem3;
    private boolean hsGioi;   // Học sinh giỏi → cộng 1.0 điểm
    private boolean uuTien;   // Diện ưu tiên → cộng 0.5 điểm

    // ===== CONSTRUCTORS =====

    /** Constructor rỗng — dùng khi sẽ nhập dữ liệu bằng nhap(Scanner). */
    public ThiSinh() {}

    /**
     * Constructor đầy đủ tham số — tạo đối tượng nhanh, không cần nhập tay.
     *
     * @param hoTen   Họ và tên thí sinh
     * @param sbd     Số báo danh
     * @param diem1   Điểm môn 1 (0–10)
     * @param diem2   Điểm môn 2 (0–10)
     * @param diem3   Điểm môn 3 (0–10)
     * @param hsGioi  true nếu là học sinh giỏi
     * @param uuTien  true nếu thuộc diện ưu tiên
     */
    public ThiSinh(String hoTen, String sbd,
                   double diem1, double diem2, double diem3,
                   boolean hsGioi, boolean uuTien) {
        this.hoTen   = hoTen;
        this.sbd     = sbd;
        this.diem1   = diem1;
        this.diem2   = diem2;
        this.diem3   = diem3;
        this.hsGioi  = hsGioi;
        this.uuTien  = uuTien;
    }

    // ===== GETTERS =====

    /** @return Họ và tên thí sinh */
    public String getHoTen() { return hoTen; }

    /** @return Số báo danh thí sinh */
    public String getSbd()   { return sbd; }

    // ===== BUSINESS LOGIC =====

    /**
     * Tính điểm xét tuyển sau khi cộng điểm ưu tiên.
     *
     * <p>Công thức: tổng 3 môn + 1.0 (nếu HS giỏi) + 0.5 (nếu ưu tiên).</p>
     *
     * @return Điểm xét tuyển cuối cùng
     */
    public double tinhDiemXetTuyen() {
        double tong = diem1 + diem2 + diem3;
        if (hsGioi) tong += 1.0;
        if (uuTien) tong += 0.5;
        return tong;
    }

    /**
     * Kiểm tra xem thí sinh có bị điểm liệt không.
     *
     * <p><b>Sửa lỗi:</b> bản gốc dùng "== 0" trên double là không an toàn
     * (dấu phẩy động). Bản tối ưu dùng "< 1.0"
     * (quy tắc phổ biến: dưới 1.0 thì bị liệt).</p>
     *
     * @return true nếu có ít nhất 1 môn dưới 1.0 (điểm liệt)
     */
    public boolean kiemTraDiemLiet() {
        return (diem1 < 1.0 || diem2 < 1.0 || diem3 < 1.0);
    }

    /**
     * Nhập thông tin thí sinh từ bàn phím.
     *
     * <p><b>Lưu ý:</b> Gọi sc.nextLine() sau nextInt() để xả buffer,
     * tránh skip dòng tiếp theo.</p>
     *
     * @param sc Scanner đang sử dụng
     */
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        this.hoTen  = sc.nextLine();
        System.out.print("Nhap SBD: ");
        this.sbd    = sc.nextLine();
        System.out.print("Nhap diem mon 1: ");
        this.diem1  = sc.nextDouble();
        System.out.print("Nhap diem mon 2: ");
        this.diem2  = sc.nextDouble();
        System.out.print("Nhap diem mon 3: ");
        this.diem3  = sc.nextDouble();
        System.out.print("Co phai HS Gioi khong (1-Co, 0-Khong): ");
        this.hsGioi = (sc.nextInt() == 1);
        System.out.print("Co thuoc dien uu tien khong (1-Co, 0-Khong): ");
        this.uuTien = (sc.nextInt() == 1);
        sc.nextLine(); // Xả buffer sau nextInt()
    }

    /**
     * Trả về chuỗi thông tin của thí sinh — dùng để in ra màn hình.
     *
     * <p><b>Tối ưu:</b> Tập trung logic định dạng vào đây thay vì
     * lặp lại string nối trong DanhSachTS.</p>
     *
     * @return Chuỗi dạng "Nguyen Van A (SBD: A001) - Diem: 25.5"
     */
    @Override
    public String toString() {
        return hoTen + " (SBD: " + sbd + ") - Diem: " + tinhDiemXetTuyen();
    }
}
