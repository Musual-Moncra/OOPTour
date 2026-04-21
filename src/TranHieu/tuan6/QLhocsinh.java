package TranHieu.tuan6;

public class QLhocsinh {
    private int ID;
    private String name;
    private static int numberOfStudents = 0;

    public QLhocsinh(String name) {
        this.ID = ++numberOfStudents;
        this.name = name;
    }

    public void output() {
        System.out.println(ID + " - " + name);
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
}
