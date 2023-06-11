package bai2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
    public double getDelta() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-b + Math.pow(getDelta(),0.5)) / (2 * a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-b - Math.sqrt(getDelta())) / (2 * a);
        return root2;
    }
}
