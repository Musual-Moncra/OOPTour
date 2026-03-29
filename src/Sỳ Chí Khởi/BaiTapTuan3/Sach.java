package baitaptuan3;

public class Sach {
    public String tenSach;
    public String tacGia;
    public int namXB;
    public int soTrang;

    public Sach(String tenSach, String tacGia, int namXB, int soTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.soTrang = soTrang;
    }

    // Hàm xuất thông tin sách
    public void xuat() {
        System.out.printf("Ten: %-20s | TG: %-15s | Nam: %d | Trang: %d\n", tenSach, tacGia, namXB, soTrang);
    }

    public static void main(String[] args) {
        //  Yêu cầu 1: Tạo dữ liệu cho 5 cuốn sách 
        Sach[] dsSach = new Sach[5];
        dsSach[0] = new Sach("Java Co Ban", "Nguyen Van A", 2020, 250);
        dsSach[1] = new Sach("OOP nang cao", "Le Thi B", 2024, 150);
        dsSach[2] = new Sach("Cau truc du lieu", "Tran Van C", 2018, 400);
        dsSach[3] = new Sach("Thiet ke Web", "Pham Doan D", 2026, 120);
        dsSach[4] = new Sach("Tri tue nhan tao", "Hoang Van E", 2023, 350);

        System.out.println("1. DANH SACH 5 CUON SACH BAN DAU:");
        for (Sach s : dsSach) {
            s.xuat();
        }

        //  Yêu cầu 2: Sắp xếp tăng dần theo số trang 
        // Thuật toán Interchange Sort
        for (int i = 0; i < dsSach.length - 1; i++) {
            for (int j = i + 1; j < dsSach.length; j++) {
                if (dsSach[i].soTrang > dsSach[j].soTrang) {
                    // Đổi chỗ 2 đối tượng sách
                    Sach temp = dsSach[i];
                    dsSach[i] = dsSach[j];
                    dsSach[j] = temp;
                }
            }
        }

        System.out.println("\n2. DANH SACH SACH TANG DAN THEO SO TRANG:");
        for (Sach s : dsSach) {
            s.xuat();
        }

        //  Yêu cầu 3: Tìm sách có năm xuất bản mới nhất 
        Sach sachMoiNhat = dsSach[0];
        for (Sach s : dsSach) {
            if (s.namXB > sachMoiNhat.namXB) {
                sachMoiNhat = s;
            }
        }

        System.out.println("\n3. CUON SACH CO NAM XUAT BAN MOI NHAT:");
        sachMoiNhat.xuat();
    }
}