package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("bạn hãy nhập bán kính (theo m) muốn tính chuvi và diện tích");
    double bankinh = scanner.nextDouble();

    Chuvi bankinh1 = new Chuvi(bankinh);

    double chuvi = bankinh1.chuvi();
    double dientich = bankinh1.diendtich();

        System.out.println("vói bán kính là: " + bankinh+ " m");
        System.out.println("có chu vi là: " + chuvi + " m");
        System.out.println("có diện tích là: " + dientich + " m²");
    }
}
