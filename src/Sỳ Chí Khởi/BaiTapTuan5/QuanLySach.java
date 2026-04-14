package baitaptuan5;

public class QuanLySach {
    public static void main(String[] args) {
        Sach[] ds = new Sach[5];
        
        ds[0] = new Sach("Head First Java", "Kathy Sierra", 2005, 720);
        ds[1] = new Sach("Clean Code", "Robert C. Martin", 2008, 464);
        ds[2] = new Sach("Nihongo Sou Matome N3", "Sasaki Hitoko", 2010, 160);
        ds[3] = new Sach("Toan Roi Rac", "Nguyen Duc Nghia", 2019, 350);
        ds[4] = new Sach("Ky Nang Lap Trinh BrSE", "Nhieu Tac Gia", 2024, 250);

        System.out.println("   DANH SACH 5 CUON SACH BAN DAU   ");
        for (Sach s : ds) {
            s.output();
        }

        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = 0; j < ds.length - 1 - i; j++) {
                if (ds[j].getSoTrang() > ds[j + 1].getSoTrang()) {
                    Sach temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }

        System.out.println("\n   DANH SACH SAU KHI SAP XEP TANG DAN THEO SO TRANG   ");
        for (Sach s : ds) {
            s.output();
        }

        Sach sachMoiNhat = ds[0];
        for (int i = 1; i < ds.length; i++) {
            if (ds[i].getNamXuatBan() > sachMoiNhat.getNamXuatBan()) {
                sachMoiNhat = ds[i];
            }
        }

        System.out.println("\n   SACH CO NAM XUAT BAN MOI NHAT   ");
        sachMoiNhat.output();
    }
}
