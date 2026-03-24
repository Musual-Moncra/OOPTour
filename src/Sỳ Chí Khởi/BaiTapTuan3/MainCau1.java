package baitaptuan3;

public class MainCau1{
    public static void main(String[] args) {
        // Tạo đối tượng thứ 1
        Person p1 = new Person();
        p1.input();

        // Tạo đối tượng thứ 2
        Person p2 = new Person();
        p2.input();

        // Gọi hàm thực hiện hành động
        System.out.println("\n--- Ket qua xuat ra ---");
        p1.sayHello();
        p2.sayHello();
    }
}