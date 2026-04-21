
package TranHieu.tuan6;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor 2 tham số
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            this.mauSo = 1; // Mặc định mẫu là 1 nếu nhập 0 để tránh lỗi
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    // Thuật toán UCLN bạn đưa (Viết lại cho Java)
    private int timUCLN(int a, int b) {
        a = Math.abs(a);// abs: là giá trị tuyệt đối
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return a + b;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    // Phương thức tối giản
    public void toiGian() {
        /*
         * Tại sao lại dùng this trong parameter của hàm timUCLN?
         * Tính tường minh (Explicit): Nhìn vào code là biết ngay bạn đang dùng biến của
         * Class
         * (Instance Variable), chứ không phải một biến tạm bợ nào đó vừa đẻ ra trong
         * hàm.
         * Tránh nhầm lẫn (Shadowing): Hãy tưởng tượng nếu trong hàm toiGian bạn lỡ tay
         * khai báo
         * thêm một biến int tuSo = 10;. Lúc này nếu gọi tuSo, máy sẽ lấy con số 10. Còn
         * nếu gọi this.tuSo,
         * máy sẽ lấy đúng cái tử số của phân số đó.
         * Thói quen tốt: Khi bạn làm việc với hàng nghìn dòng code, chữ this. giúp mắt
         * bạn phân biệt cực
         * nhanh đâu là "dữ liệu gốc" của đối tượng.
         */
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    @Override /*
               * Khi bạn thấy @Override, hãy hiểu là: "Cái này lớp cha đã làm rồi, nhưng tôi
               * muốn
               * làm lại theo cách của tôi cho nó xịn hơn!".
               * Dễ đọc code: Khi người khác nhìn vào, họ biết ngay đây là hàm được kế thừa và
               * sửa đổi lại,
               * chứ không phải hàm bạn tự nghĩ ra từ đầu.
               */
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}