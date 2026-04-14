package TranHieu.tuan5;

public class converted {
    public static double cToF(double c) {
        return (c * 1.8) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) / 1.8;
    }

    public static double inchToCm(double inch) {
        return inch * 2.54;
    }

    public static double cmToInch(double cm) {
        return cm / 2.54;
    }

    public static double footToM(double foot) {
        return foot * 0.3048;
    }

    public static double mToFoot(double m) {
        return m / 0.3048;
    }
}
