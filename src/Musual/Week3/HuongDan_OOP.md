# Hướng dẫn Xây dựng Lớp và Đối tượng (OOP) trong Java

Tài liệu này đóng vai trò như một cẩm nang học thuật để giới thiệu và hướng dẫn bạn cách thiết kế một **Class (Lớp)** chuẩn trong Lập trình Hướng đối tượng (OOP) bằng Java. Chúng ta sẽ dùng chính các bài tập `Person`, `SinhVien`, `SanPham` làm ví dụ xuyên suốt.

> [!NOTE]
> OOP (Object-Oriented Programming) là một mô hình lập trình dựa trên khái niệm về "Đối tượng" (Object). Mỗi đối tượng có thể chứa **dữ liệu** trong các trường (fields / properties / attributes) và **mã code** (logic) dưới dạng các phương thức (methods).

---

## 1. Thành phần của một Lớp (Class)
Một Class (hay khuôn mẫu) để tạo ra các Object (đối tượng cụ thể) thường bao gồm 3 thành phần chính:
1. **Thuộc tính (Fields/Attributes):** Định nghĩa trạng thái, đặc tính của đối tượng. 
2. **Hàm khởi tạo (Constructors):** Hàm đặc biệt được gọi tự động khi sử dụng từ khoá `new` để tạo một đối tượng. Nhiệm vụ chính là khởi tạo giá trị ban đầu.
3. **Phương thức (Methods):** Định nghĩa hành vi, hành động (ví dụ: `input()`, `xuat()`, `calcAge()`).

## 2. Tính Đóng gói (Encapsulation)

> [!IMPORTANT]
> **Quy tắc vàng:** Trong thiết kế lớp chuẩn học thuật, **tất cả** các thuộc tính nên được đặt làm `private`. 

Thay vì để biến static hay trạng thái `public` tự do:
```java
public String name; // KHÔNG NÊN
public static String MSSV; // CÀNG KHÔNG NÊN (static là biến dùng chung cho TẤT CẢ object)
```

**Cách viết chuẩn:**
Chúng ta dùng `private` để ngăn chặn việc chỉnh sửa trực tiếp bên ngoài Class. Để giao tiếp với bên ngoài, ta mở các cổng, gọi là `Getter` và `Setter`.

```java
public class SinhVien {
    private String maSo;   // chỉ bản thân Class SinhVien mới được truy cập biến này
    private String hoTen;

    // Cổng (hàm) để Lấy giá trị ra ngoài (Getter)
    public String getMaSo() {
        return maSo;
    }

    // Cổng (hàm) để Cập nhật giá trị vào trong (Setter)
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
}
```

## 3. Tìm hiểu về Constructor (Hàm khởi tạo)

Khi tạo một Object `new SinhVien()`, máy tính sẽ tự tìm đến Constructor. Tên của Constructor **bắt buộc phải đặt trùng** với tên lớp và KHÔNG có kiểu trả về (ngay cả `void` cũng không có).

### a. Constructor mặc định (0 tham số)
Dùng để tạo một Object trống, chưa có thông tin gì cả. Thường kết hợp chung với lệnh `input()` (nhập từ bàn phím).

```java
public SinhVien() {
    // Để trống hoặc đặt giá trị mặc định cho thuộc tính tuỳ ý
}
```

### b. Constructor nhiều tham số (Parameterized Constructor)
Dùng khi bạn muốn "bơm" trực tiếp toàn bộ dữ liệu ngay lúc vừa khai báo `new`. Đây là cách rút ngắn thay vì gọi từng `Setter` dài dòng.

```java
public SinhVien(String maSo, String hoTen, int namSinh) {
    this.maSo = maSo;       // gán từ con đường "tham số" vào "thuộc tính nội bộ" của Object
    this.hoTen = hoTen;
    this.namSinh = namSinh;
}

// CÁCH DÙNG
SinhVien sv = new SinhVien("SV01", "Nguyen Van A", 2000); 
```

> [!TIP] 
> Từ khoá `this` là một đại từ chỉ **"đối tượng đang gọi lệnh hiện tại"**. `this.maSo` mang ý nghĩa "thuộc tính maSo của tôi" phân biệt với biến truyền vào `String maSo` trong ngoặc.

## 4. Các Phương thức Hành vi (Methods)

Đây là nơi bạn xử lý nghiệp vụ của hệ thống. 
Ví dụ: Đề bài yêu cầu tạo "Hàm tính tuổi dựa vào năm sinh". Đây là một hàm toán học.

- Bạn không cần phải truyền thêm tham số `int namSinh` vào hàm, bởi vì khi hàm này được cấp cho một Object, Object đã **có sẵn** tài sản tính tuổi của riêng nó thông qua `this.namSinh`.

```java
public int tinhTuoi() {
    // 2026 trừ đi năm sinh của riêng tôi
    int year = Calendar.getInstance().get(Calendar.YEAR);
    return year - this.namSinh; 
}
```

## 5. Chạy Luồng (Lớp Main)

Cũng là một tập hợp các Class, nhưng sẽ có một Class chứa hàm `public static void main(String[] args)`. Đó là **"Khu vực tiếp tân"** của toàn bộ Chương trình.
Chương trình luôn chạy từ phần tử đầu tiên của `main`.

```java
public class Main2 {
    public static void main(String[] args) {
        // ... code kiểm thử và dùng đối tượng ở đây
        SinhVien ds = new SinhVien(); 
        ds.input();
        ds.xuat();
    }
}
```

> [!CAUTION] 
> Tại sao lại chia nhiều file (`Main1`, `Main2`, `Main3`)? Trong một gói (package) Java, lớp không thể có cùng tên trùng lặp (nếu không tạo subfolders). Điều này giúp code gọn, dễ bảo trì, biên dịch `javac` và chạy `java` nhanh chóng cho từng mô-đun bài tập.
