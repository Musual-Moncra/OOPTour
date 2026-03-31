/*

Question: 
+ Tạo một class bao gồm 3 đặc tính: (Name, Id, Address)
+ Dùng hàm main để chạy
*/
import java.util.Scanner;
public class Person{
    public String Name, Id, Address;
    public static void main(String[] args) {
        Person p = new Person();
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