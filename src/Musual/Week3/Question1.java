package Week3;

/*

Question:
+ Tạo một class bao gồm 3 đặc tính: (Name, Id, Address)
+ Dùng hàm main để chạy
*/
import java.util.Scanner;

// Đổi tên thành Question1 vì class Person đã được định nghĩa đầy đủ trong Person.java
// (cùng package Week3), không thể có 2 class cùng tên trong 1 package.
public class Question1 {
    public String Name, Id, Address;

    public static void main(String[] args) {
        Question1 p = new Question1();
        p.FillInfo();
        p.ShowInfo();
    }

    public void FillInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Id: ");
        Id = sc.nextLine();
        System.out.println("Enter Address: ");
        Address = sc.nextLine();
        sc.close();
    }

    public void ShowInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("Address: " + Address);
    }
}