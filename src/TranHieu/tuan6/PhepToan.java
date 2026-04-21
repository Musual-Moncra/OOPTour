package TranHieu.tuan6;

public class PhepToan {

    public static PhanSo cong2PS(PhanSo ps1, PhanSo ps2) {
        int tu = ps1.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * ps1.getMauSo();
        int mau = ps1.getMauSo() * ps2.getMauSo();
        PhanSo kq = new PhanSo(tu, mau);
        kq.toiGian();
        return kq;
    }

    public static PhanSo tru2PS(PhanSo ps1, PhanSo ps2) {
        int tu = ps1.getTuSo() * ps2.getMauSo() - ps2.getTuSo() * ps1.getMauSo();
        int mau = ps1.getMauSo() * ps2.getMauSo();
        PhanSo kq = new PhanSo(tu, mau);
        kq.toiGian();
        return kq;
    }

    public static PhanSo nhan2PS(PhanSo ps1, PhanSo ps2) {
        int tu = ps1.getTuSo() * ps2.getTuSo();
        int mau = ps1.getMauSo() * ps2.getMauSo();
        PhanSo kq = new PhanSo(tu, mau);
        kq.toiGian();
        return kq;
    }

    public static PhanSo chia2PS(PhanSo ps1, PhanSo ps2) {
        int tu = ps1.getTuSo() * ps2.getMauSo();
        int mau = ps1.getMauSo() * ps2.getTuSo();
        PhanSo kq = new PhanSo(tu, mau);
        kq.toiGian();
        return kq;
    }
}