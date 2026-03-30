package truongdaihoc;

import thisinh.ThiSinh;

public class TruongDaiHoc {
    private String tenTruong;
    private double diemChuan;

    public TruongDaiHoc(String tenTruong, double diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }

    public void xetTuyen(ThiSinh ts) {
        if (ts.tinhDiemXetTuyen() >= diemChuan && !ts.kiemTraDiemLiet()) {
            System.out.println("Chuc mung ban " + ts.getHoTen() + " da trung tuyen");
        } else {
            System.out.println("Rat tiec, ban " + ts.getHoTen() + " chua du dieu kien trung tuyen");
        }
    }
}