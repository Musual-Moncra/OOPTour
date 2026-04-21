/*
2)	Xây dựng lớp Student như sau
public class Student { 
    private int id;
    private String name;
    // Biến tĩnh
    private static int numberOfStudents = 0;
    //Constructor
    public Student(String name) {
        //increment number of Students
        this.id = ++numberOfStudents;
        this.name = name;
    }
}
-	Bổ sung thêm hàm output để xuất id và name ra màn hình theo mẫu <id> - <name>
-	Hàm main() tạo n đối tượng Student và xuất ra danh sách n Student, đếm tổng số Student đã tạo.
*/

package TranHieu.tuan6;

public class bai2 {
    public static void main(String[] args) {
        QLhocsinh[] students = new QLhocsinh[5];
        students[0] = new QLhocsinh("John");
        students[1] = new QLhocsinh("Jane");
        students[2] = new QLhocsinh("Bob");
        students[3] = new QLhocsinh("Alice");
        students[4] = new QLhocsinh("Mike");
        for (int i = 0; i < 5; i++) {
            students[i].output();
        }
        System.out.println("Total number of students: " + QLhocsinh.getNumberOfStudents());
    }
}