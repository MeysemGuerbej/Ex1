import java.util.Scanner;

class Calculatricee {
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double soustraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return a / b;
    }
}
