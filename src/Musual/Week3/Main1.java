package Week3;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== TAO NGUOI THU 1 ===");
        Person p1 = new Person();
        p1.input();
        
        System.out.println("\n=== TAO NGUOI THU 2 ===");
        Person p2 = new Person();
        p2.input();
        
        System.out.println("\n=== CAU CHAO KET QUA ===");
        p1.sayHello();
        p2.sayHello();
    }
}
