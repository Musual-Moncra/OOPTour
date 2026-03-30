package baitaptuan3;

public class PhuongTrinhBac2 {
    public double a;
    public double b;
    public double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void giai() {
        System.out.println("Giai phuong trinh: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("-> Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("-> Phuong trinh vo nghiem.");
                }
            } else {
                System.out.println("-> Phuong trinh co 1 nghiem: x = " + (-c / b));
            }
            return; 
        }

        double delta = Math.pow(b, 2) - 4 * a * c;// .pow là luỹ thừa

        if (delta < 0) {
            System.out.println("-> Delta = " + delta + " < 0 => Phuong trinh VO NGHIEM.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("-> Delta = 0 => Phuong trinh co NGHIEM KEP: x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("-> Delta = " + delta + " > 0 => Phuong trinh co 2 NGHIEM PHAN BIET:");
            System.out.println("   x1 = " + x1);
            System.out.println("   x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        PhuongTrinhBac2 pt1 = new PhuongTrinhBac2(2, -5, 7);
        pt1.giai();

        PhuongTrinhBac2 pt2 = new PhuongTrinhBac2(5, 8, 9);
        pt2.giai();
    }
}