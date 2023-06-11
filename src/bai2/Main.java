package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính phương trình bậc 2: ax² + bx + c");
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        System.out.println("Kết quả của phương trình " + a + "x² + " + b + "x + " + c + " có 2 nghiệm là:");
        System.out.println("Nghiệm 1: x = " + equation.getRoot1());
        System.out.println("Nghiệm 2: x = " + equation.getRoot2());

        scanner.close();
    }
}
