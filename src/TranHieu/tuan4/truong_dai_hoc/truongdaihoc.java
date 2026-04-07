package TranHieu.tuan4.truong_dai_hoc;

import TranHieu.tuan4.bai10.LopThiSinh;

public class truongdaihoc {
    private String tenTruong;
    private double diemChuan;

    public truongdaihoc(String tenTruong, double diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }

    public void xetTuyen(LopThiSinh ts) {
        System.out.println("\n--- Ket qua tai truong: " + tenTruong + " ---");
        if (ts.tinhDiemXetTuyen() >= diemChuan && !ts.kiemTraDiemLiet()) {
            System.out.println("Chuc mung ban " + ts.getHoTen() + " da trung tuyen!");
        } else {
            System.out.println("Rat tiec, ban " + ts.getHoTen() + " chua du dieu kien.");
        }
    }
}