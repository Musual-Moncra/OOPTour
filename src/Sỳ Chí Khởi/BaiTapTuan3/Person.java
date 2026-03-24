package baitaptuan3;

import java.util.Scanner;

public class Person {

    public String id;
    public String name;
    public String addr;

    // Hàm nhập thông tin
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Nhap thong tin ---");
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Address: ");
        addr = sc.nextLine();
    }

    // Hàm xuất câu chào
    public void sayHello() {
        System.out.println("I am " + name + " (ID: " + id + "). Hello everybody!!!");
    }
}