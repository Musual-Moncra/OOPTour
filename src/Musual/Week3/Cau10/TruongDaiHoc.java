package Week3.Cau10;



/**
 * Lớp TruongDaiHoc đại diện cho một trường đại học trong hệ thống xét tuyển.
 *
 * <p>
 * Mỗi trường có tên và điểm chuẩn. Cung cấp phương thức xetTuyen()
 * để kiểm tra một thí sinh đơn lẻ.
 * </p>
 *
 * <p>
 * <b>Tối ưu so với bản gốc:</b>
 * </p>
 * <ul>
 * <li>Sửa lỗi gán thiếu dấu '=' trong constructor.</li>
 * <li>Tách thông báo trúng/trượt rõ ràng, hiển thị thêm điểm chênh lệch khi
 * trượt.</li>
 * <li>Thêm đầy đủ Javadoc.</li>
 * </ul>
 */
public class TruongDaiHoc {

    private final String tenTruong;
    private final double diemChuan;

    /**
     * Tạo một trường đại học với tên và điểm chuẩn cho trước.
     *
     * @param tenTruong Tên trường (ví dụ: "HSU", "HUTECH")
     * @param diemChuan Điểm chuẩn xét tuyển (ví dụ: 15.0, 18.5)
     */
    public TruongDaiHoc(String tenTruong, double diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }

    /** @return Tên trường đại học */
    public String getTenTruong() {
        return tenTruong;
    }

    /** @return Điểm chuẩn xét tuyển */
    public double getDiemChuan() {
        return diemChuan;
    }

    /**
     * Xét tuyển một thí sinh và in kết quả ra màn hình.
     *
     * <p>
     * Điều kiện TRÚNG TUYỂN: điểm xét tuyển >= điểm chuẩn VÀ không có môn liệt.
     * </p>
     * <p>
     * <b>Tối ưu:</b> In thêm điểm chênh lệch khi trượt để người dùng biết còn thiếu
     * bao nhiêu.
     * </p>
     *
     * @param ts Thí sinh cần xét tuyển
     */
    public void xetTuyen(ThiSinh ts) {
        double diem = ts.tinhDiemXetTuyen(); // Cache: tính 1 lần
        if (diem >= diemChuan && !ts.kiemTraDiemLiet()) {
            System.out.println("Chuc mung " + ts.getHoTen()
                    + " da trung tuyen vao " + tenTruong
                    + " (Diem: " + diem + ")");
        } else {
            String lyDo = ts.kiemTraDiemLiet()
                    ? "co mon diem liet"
                    : "thieu " + String.format("%.1f", diemChuan - diem) + " diem";
            System.out.println("Rat tiec, " + ts.getHoTen()
                    + " chua du dieu kien vao " + tenTruong
                    + " (" + lyDo + ")");
        }
    }
}
