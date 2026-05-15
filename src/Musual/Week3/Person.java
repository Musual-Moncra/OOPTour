package Week3;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private String addr;

    public Person() {
    }

    public Person(String id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // Method to input data
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.id = sc.nextLine();
        System.out.print("Nhap Name: ");
        this.name = sc.nextLine();
        System.out.print("Nhap Address: ");
        this.addr = sc.nextLine();
        // Không đóng Scanner (sc.close()) ở đây vì nó sẽ đóng System.in của toàn bộ chương trình,
        // gây lỗi (NoSuchElementException) nếu ta tiếp tục nhập liệu ở nơi khác.
    }

    // Method to say hello
    public void sayHello() {
        System.out.println("I am " + this.name + ". Hello everybody!!!");
    }
}
