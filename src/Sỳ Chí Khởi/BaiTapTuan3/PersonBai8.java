package baitaptuan3;

class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    //constructor
    public Name() {
    }

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    //getter&setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }


//từ đoạn này trở xuống chưa hiểu lắm
    @Override
    public String toString() {
        return lastName + " " + middleName + " " + firstName;
    }

    public void output() {
        System.out.println(this.toString());
    }
}

public class PersonBai8 {
    private String id;
    private Name fullName;
    private String address;

    public PersonBai8(String id, Name fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public Name getFullName() {
        return fullName;
    }

    public void output() {
        System.out.println("ID: " + id + " | Ho Ten: " + fullName.toString() + " | Dia chi: " + address);
    }

    public static void main(String[] args) {
        PersonBai8[] ds = new PersonBai8[5];
        
        ds[0] = new PersonBai8("P01", new Name("Khoi", "Sy", "Chi"), "Quan Cafe");
        ds[1] = new PersonBai8("P02", new Name("Sieu", "Thanh", ""), "Quan Cafe");
        ds[2] = new PersonBai8("P03", new Name("Anh", "Quynh", ""), "Quan Cafe");
        ds[3] = new PersonBai8("P04", new Name("Han", "Gia", ""), "Quan Cafe");
        ds[4] = new PersonBai8("P05", new Name("Khoa", "Dang", ""), "Quan Cafe");

        System.out.println("    DANH SACH NHOM TRUOC KHI SAP XEP    ");
        for (PersonBai8 p : ds) {
            p.output();
        }

        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = i + 1; j < ds.length; j++) {
                String tenTruoc = ds[i].getFullName().getFirstName();
                String tenSau = ds[j].getFullName().getFirstName();

                if (tenTruoc.compareToIgnoreCase(tenSau) > 0) {
                    PersonBai8 temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

        System.out.println("\n    DANH SACH NHOM SAU KHI SAP XEP THEO TEN (A-Z)    ");
        for (PersonBai8 p : ds) {
            p.output();
        }
    }
}