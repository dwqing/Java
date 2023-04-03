import java.util.Scanner;

public class muxi01 {
    double n1;
    double n2;

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtration(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        ;
        muxi01 p1 = new muxi01();
        muxi01 p2 = new muxi01();
        muxi01 p3 = new muxi01();
        muxi01 p4 = new muxi01();
        System.out.println("34加23的结果：" + p1.addition(34, 23));
        System.out.println("34减24的结果：" + p2.subtration(34, 24));
        System.out.println("34乘24的结果：" + p3.multiplication(34, 24));
        System.out.println("34除以24的结果:" + p4.division(34, 24));
    }
}
