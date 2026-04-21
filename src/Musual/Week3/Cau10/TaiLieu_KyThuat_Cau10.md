# 📘 Tài Liệu Kỹ Thuật & Học Thuật — Câu 10: Hệ Thống Tuyển Sinh Đại Học

> **Môn học:** Lập Trình Hướng Đối Tượng (OOP) — Java  
> **Bài tập:** Tuần 3 — Câu 10  
> **Phiên bản tối ưu:** `Musual/Week3/Cau10/`  
> **Dựa trên bản gốc:** `Sỳ Chí Khởi/BaiTapTuan3/Câu 10/`  

---

## 1. Tổng Quan Hệ Thống

Chương trình mô phỏng hệ thống tuyển sinh đại học. Người dùng nhập danh sách thí sinh, hệ thống tính điểm xét tuyển (bao gồm điểm ưu tiên), so sánh với điểm chuẩn của trường và in ra kết quả trúng/trượt.

### 1.1 Sơ Đồ Lớp (Class Diagram)

```
┌─────────────────────────────────────┐
│           <<class>> Main            │
│  + main(args: String[]) : void      │
└────────────────┬────────────────────┘
                 │ uses
     ┌───────────▼────────────┐   uses   ┌──────────────────────────┐
     │  <<class>> DanhSachTS   │─────────▶│  <<class>> TruongDaiHoc  │
     │─────────────────────────│          │──────────────────────────│
     │ - dsCoDinh: List<TS>    │          │ - tenTruong: String       │
     │ - dsNhapVao: List<TS>   │          │ - diemChuan: double       │
     │─────────────────────────│          │──────────────────────────│
     │ + nhapDanhSach()        │          │ + getTenTruong()          │
     │ + xetTuyenTongHop()     │          │ + getDiemChuan()          │
     │ + xuatDanhSachTrungTuyen│          │ + xetTuyen(ts: ThiSinh)  │
     │ - xetTuyenDanhSach()    │          └──────────────────────────┘
     │ - xuatTrungTuyenDs()    │
     └───────────┬─────────────┘
                 │ contains (1..*)
     ┌───────────▼─────────────┐
     │  <<class>> ThiSinh       │
     │──────────────────────────│
     │ - hoTen, sbd: String     │
     │ - diem1, diem2, diem3    │
     │ - hsGioi, uuTien: bool   │
     │──────────────────────────│
     │ + tinhDiemXetTuyen()     │
     │ + kiemTraDiemLiet()      │
     │ + nhap(sc: Scanner)      │
     │ + toString()             │
     └──────────────────────────┘
```

### 1.2 Cấu Trúc Package

| Package          | Lớp            | Vai Trò                                  |
|------------------|----------------|------------------------------------------|
| `thisinh`        | `ThiSinh`      | Entity — thông tin và điểm của thí sinh  |
| `thisinh`        | `DanhSachTS`   | Manager — quản lý & duyệt danh sách      |
| `truongdaihoc`   | `TruongDaiHoc` | Entity — thông tin và quy tắc xét tuyển  |
| `main`           | `Main`         | Entry point — điều phối toàn bộ luồng    |

---

## 2. Các Lỗi Tìm Thấy Trong Bản Gốc

| # | File                 | Vị Trí                     | Loại Lỗi           | Mô Tả                                                                        |
|---|----------------------|----------------------------|--------------------|------------------------------------------------------------------------------|
| 1 | `ThiSinh.java`       | Constructor (dòng 20–26)   | **Compile Error**  | Thiếu `=` trong toàn bộ câu lệnh gán (`this.hoTen hoTen` → `this.hoTen = hoTen`) |
| 2 | `ThiSinh.java`       | `tinhDiemXetTuyen` (d.38)  | **Compile Error**  | `double tong   diem1 + ...` — thiếu `=`                                      |
| 3 | `ThiSinh.java`       | `kiemTraDiemLiet` (d.45)   | **Logic Error**    | `diem1   0` — thiếu `==`; so sánh `== 0` với `double` là không an toàn       |
| 4 | `ThiSinh.java`       | `nhap()` (dòng 50–62)      | **Compile Error**  | Mọi dòng gán đều thiếu `=`                                                   |
| 5 | `DanhSachTS.java`    | `xuatTrungTuyen` (d.35–36) | **Performance**    | Gọi `tinhDiemXetTuyen()` 2 lần/thí sinh — tính toán lặp vô nghĩa            |
| 6 | `DanhSachTS.java`    | Toàn bộ class              | **Missing Method** | `xetTuyenTongHop()` gọi trong `main.java` nhưng chưa được định nghĩa → **cannot find symbol** |
| 7 | `TruongDaiHoc.java`  | Constructor (dòng 10–11)   | **Compile Error**  | Thiếu `=` trong gán `this.tenTruong` và `this.diemChuan`                     |
| 8 | `main.java`          | Dòng 9, 12, 19             | **Compile Error**  | `Scanner sc   new Scanner(...)` — thiếu `=`                                  |
| 9 | `main.java`          | Không có try-finally       | **Resource Leak**  | `sc.close()` chỉ chạy nếu không có exception                                 |

> [!CAUTION]
> Lỗi **#6 (Missing Method)** là nghiêm trọng nhất: `DanhSachTS` không có `xetTuyenTongHop()` nên chương trình không biên dịch được ngay cả sau khi sửa hết lỗi cú pháp.

---

## 3. Những Gì Đã Được Tối Ưu / Sửa

### 3.1 ThiSinh.java

| Vị Trí               | Thay Đổi                                                        | Lý Do                                                    |
|----------------------|-----------------------------------------------------------------|----------------------------------------------------------|
| Constructor đầy đủ   | Thêm `=` vào tất cả dòng gán                                   | Sửa compile error                                        |
| `kiemTraDiemLiet()`  | `diem1 == 0` → `diem1 < 1.0`                                   | An toàn hơn với floating point; đúng quy tắc điểm liệt  |
| `nhap(Scanner)`      | Thêm `=` vào tất cả dòng gán                                   | Sửa compile error                                        |
| **Thêm `toString()`**| Trả về `"hoTen (SBD: sbd) - Diem: X"`                          | Tập trung format — tránh lặp code ở DanhSachTS           |
| Javadoc              | Thêm `/** ... */` cho class và mọi method public               | Tài liệu hóa, IDE tooltip                                |

**Trước:**
```java
public boolean kiemTraDiemLiet() {
    return (diem1   0 || diem2   0 || diem3   0); // Lỗi cú pháp + logic
}
```
**Sau:**
```java
public boolean kiemTraDiemLiet() {
    return (diem1 < 1.0 || diem2 < 1.0 || diem3 < 1.0); // Đúng và an toàn
}
```

---

### 3.2 DanhSachTS.java

| Vị Trí                    | Thay Đổi                                                          | Lý Do                                       |
|---------------------------|-------------------------------------------------------------------|---------------------------------------------|
| `ThiSinh[]`               | → `List<ThiSinh>` (ArrayList)                                     | Kích thước động, dễ mở rộng                 |
| `for(int i = 0; ...)`     | → `for (ThiSinh ts : ds)`                                         | Gọn, loại bỏ lỗi off-by-one                 |
| `tinhDiemXetTuyen()` 2×   | Cache: `double diem = ts.tinhDiemXetTuyen()`                      | Tính 1 lần, dùng 2 lần — tránh lặp          |
| **Thêm `xetTuyenTongHop`**| Method mới — in bảng tổng hợp với `printf` format                | Sửa compile error trong `main.java`         |
| **Thêm private helpers**  | `xetTuyenDanhSach()` + `xuatTrungTuyenDanhSach()`                 | DRY — không lặp cùng block code 2 lần      |
| In chuỗi thí sinh         | Dùng `ts.toString()` thay vì nối chuỗi thủ công                  | Ngắn hơn, cập nhật 1 chỗ khi đổi format    |

**Trước (lặp + performance):**
```java
for (int i = 0; i < dsCoDinh.length; i++) {
    if (dsCoDinh[i].tinhDiemXetTuyen() >= truong.getDiemChuan()     // Tính lần 1
            && !dsCoDinh[i].kiemTraDiemLiet()) {
        System.out.println("... Diem: " + dsCoDinh[i].tinhDiemXetTuyen()); // Tính lần 2!
    }
}
```
**Sau (cache + DRY):**
```java
for (ThiSinh ts : ds) {
    double diem = ts.tinhDiemXetTuyen(); // Tính 1 lần
    if (diem >= truong.getDiemChuan() && !ts.kiemTraDiemLiet()) {
        System.out.println("  + " + ts); // Dùng toString(), diem đã có sẵn
    }
}
```

---

### 3.3 TruongDaiHoc.java

| Vị Trí           | Thay Đổi                                                     | Lý Do                                    |
|------------------|--------------------------------------------------------------|------------------------------------------|
| Constructor      | Thêm `=`                                                     | Sửa compile error                        |
| Fields           | Thêm `final`                                                 | Tên & điểm chuẩn không thay đổi         |
| `xetTuyen()`     | Cache `tinhDiemXetTuyen()`, hiển thị lý do trượt rõ ràng   | Ít tính toán; output thân thiện hơn      |

---

### 3.4 main.java → Main.java

| Vị Trí         | Thay Đổi                                          | Lý Do                                         |
|----------------|---------------------------------------------------|-----------------------------------------------|
| Gán biến       | Thêm `=`                                          | Sửa compile error                             |
| `sc.close()`   | Bọc trong `try { } finally { sc.close(); }`       | Đảm bảo giải phóng tài nguyên dù có exception |
| Tên file       | `main.java` → `Main.java`                         | Java convention: tên file = tên public class  |

---

## 4. Nguyên Lý OOP Áp Dụng

### 4.1 Encapsulation (Đóng Gói)

```java
private String hoTen;               // Field private — chỉ class ThiSinh biết
public String getHoTen() { return hoTen; }  // Truy cập qua getter
```
**Lợi ích:** Nội dung bên trong class được bảo vệ; có thể thêm validation sau.

### 4.2 Single Responsibility Principle (SRP)

| Lớp              | Trách Nhiệm Duy Nhất                                            |
|------------------|-----------------------------------------------------------------|
| `ThiSinh`        | Lưu dữ liệu + tính điểm của **một** thí sinh                   |
| `DanhSachTS`     | Quản lý **tập hợp** thí sinh (nhập, filter, xuất)              |
| `TruongDaiHoc`   | Lưu thông tin trường + quy tắc xét tuyển                       |
| `Main`           | Điều phối luồng chạy — **không chứa logic nghiệp vụ**          |

### 4.3 DRY — Don't Repeat Yourself

Bản gốc lặp hoàn toàn block code cho 2 danh sách. Bản tối ưu dùng helper:
```java
// Thay vì copy-paste 2 lần:
xetTuyenDanhSach(dsCoDinh,  truong, stt);
xetTuyenDanhSach(dsNhapVao, truong, stt);
```

### 4.4 toString() Pattern

Định nghĩa `toString()` trong entity — định dạng tại một nơi duy nhất:
```java
@Override
public String toString() {
    return hoTen + " (SBD: " + sbd + ") - Diem: " + tinhDiemXetTuyen();
}
// Sử dụng: System.out.println(ts); — Java tự gọi toString()
```

---

## 5. Luồng Thực Thi (Execution Flow)

```
main()
 │
 ├─▶ new DanhSachTS()
 │       └─▶ Nạp 2 thí sinh cố định vào dsCoDinh
 │
 ├─▶ nhapDanhSach(sc)
 │       └─▶ Nhập n → vòng lặp → ts.nhap(sc) → dsNhapVao.add(ts)
 │
 ├─▶ new TruongDaiHoc("HSU", 15.0)
 │
 ├─▶ xetTuyenTongHop(hsu)    ← Phương thức MỚI được thêm
 │       └─▶ xetTuyenDanhSach(dsCoDinh, hsu, 1)
 │               └─▶ for ts: diem = cache, in bảng kết quả
 │       └─▶ xetTuyenDanhSach(dsNhapVao, hsu, ...)
 │
 └─▶ xuatDanhSachTrungTuyen(hsu)
         └─▶ xuatTrungTuyenDanhSach(dsCoDinh, hsu)
         └─▶ xuatTrungTuyenDanhSach(dsNhapVao, hsu)
```

---

## 6. Ví Dụ Output Khi Chạy

```
=== NHAP DANH SACH THI SINH TUY CHINH ===
Nhap so luong thi sinh can them: 1

[ NHAP THI SINH 1/1 ]
Nhap ho ten: Tran Van B
...

=== XET TUYEN VAO: HSU ===
STT    Ho Ten                     Diem XT   Ket Qua
------------------------------------------------------------
1      Nguyen Van Co Dinh         25.0      TRUNG TUYEN
2      Le Thi Co Dinh             15.5      TRUNG TUYEN
3      Tran Van B                 16.5      TRUNG TUYEN

=== DANH SACH TRUNG TUYEN: HSU ===
  + Nguyen Van Co Dinh (SBD: CD01) - Diem: 25.0
  + Le Thi Co Dinh (SBD: CD02) - Diem: 15.5
  + Tran Van B (SBD: B001) - Diem: 16.5
```

> [!NOTE]
> **Giải thích điểm:**  
> - "Nguyen Van Co Dinh": 7+8+9 = 24, HS Giỏi +1 = **25.0** ✓  
> - "Le Thi Co Dinh": 5+5+5 = 15, ưu tiên +0.5 = **15.5** ✓  
> - Cả hai đều ≥ 15.0 (điểm chuẩn HSU) → Trúng tuyển  

---

## 7. Bảng Tổng Kết Tối Ưu

| Loại Cải Thiện        | Số Lượng | Chi Tiết                                              |
|-----------------------|----------|-------------------------------------------------------|
| Compile Error sửa     | 8        | Thiếu `=`, thiếu `==` trong `kiemTraDiemLiet`         |
| Logic Error sửa       | 1        | Điều kiện liệt: `== 0` → `< 1.0`                     |
| Missing Method thêm   | 1        | `xetTuyenTongHop()` trong `DanhSachTS`                |
| Performance tối ưu    | 2        | Cache `tinhDiemXetTuyen()` tại 2 vị trí               |
| Code mới thêm         | 4        | `toString()`, 2 private helpers, `final` fields       |
| Resource Management   | 1        | `try-finally` cho `Scanner.close()`                   |
| Code Style            | 3+       | Enhanced for-each, ArrayList, Javadoc đầy đủ          |

---

*Tài liệu được tạo sau quá trình review và tối ưu code Câu 10, Tuần 3 — OOP Java.*
