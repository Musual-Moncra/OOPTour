/*
10)	Viết chương trình thông báo kết quả thi tuyển của thí sinh thi vào Đại học
-	Lớp Thí Sinh (thuộc package thisinh)
o	Họ tên, số báo danh
o	Điểm môn 1, môn 2, môn 3
o	HS Giỏi lớp 12: có/không
o	Đối tượng ưu tiên: có/không
o	Hàm tính điểm xét tuyển: Điểm xét tuyển = môn 1 + môn 2 + môn 3 + 1 (HS Giỏi) + 0.5 (Đối tượn ưu tiên)
o	Hàm kiểm tra Điểm liệt: Nếu có ít nhất 1 môn 0 điểm thì return true, ngược lại thì return false
o	Hàm nhập thông tin thí sinh
-	Lớp Trường Đại học (thuộc package truongdaihoc)
o	Tên trường
o	Điểm chuẩn 
o	Hàm xét tuyển: có 1 tham số là Thí Sinh
	Nếu Điểm xét tuyển >= Điểm chuẩn và không có điểm liệt thì xuất thông báo “Chúc mừng bạn <name> đã trúng tuyển”
	Ngược lại thì xuất thông báo “Rất tiếc, bạn <name> chưa đủ điều kiện trúng tuyển”
-	Hàm main(): Nhập thông tin của 3 thí sinh và xuất kết quả xét tuyển của 3 thí sinh này lần lượt vào các trường sau
o	Thí sinh 1: trường HSU, điểm chuẩn 15
o	Thí sinh 2: trường HUTECH, điểm chuẩn 16
o	Thí sinh 3: trường SGU, điểm chuẩn 15.5
 */

package TranHieu.tuan4.bai10;

import TranHieu.tuan4.truong_dai_hoc.truongdaihoc;

public class bai10 {
    public static void main(String[] args) {
        LopThiSinh ts1 = new LopThiSinh();
        LopThiSinh ts2 = new LopThiSinh();
        LopThiSinh ts3 = new LopThiSinh();

        System.out.println("NHAP THONG TIN 3 THI SINH:");
        System.out.print("Thi sinh 1: ");
        ts1.nhap();
        System.out.print("Thi sinh 2: ");
        ts2.nhap();
        System.out.print("Thi sinh 3: ");
        ts3.nhap();

        truongdaihoc hsu = new truongdaihoc("HSU", 15.0);
        truongdaihoc hutech = new truongdaihoc("HUTECH", 16.0);
        truongdaihoc sgu = new truongdaihoc("SGU", 15.5);

        hsu.xetTuyen(ts1);
        hutech.xetTuyen(ts2);
        sgu.xetTuyen(ts3);
    }
}
