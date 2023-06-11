package bai4;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.getFast()); // Thiết lập tốc độ quạt là FAST bằng cách gọi phương thức getFast()
        fan1.setRadius(10.0); // Thiết lập bán kính quạt là 10.0
        fan1.setColor("yellow"); // Thiết lập màu sắc quạt là yellow
        fan1.setOn(true); // Thiết lập trạng thái bật của quạt là true

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.getMedium()); // Thiết lập tốc độ quạt là MEDIUM bằng cách gọi phương thức getMedium()
        fan2.setRadius(5.0); // Thiết lập bán kính quạt là 5.0
        fan2.setColor("blue"); // Thiết lập màu sắc quạt là blue
        fan2.setOn(false); // Thiết lập trạng thái bật của quạt là false

        System.out.println(fan1.toString()); // In thông tin của quạt fan1 bằng cách gọi phương thức toString()
        System.out.println(fan2.toString()); // In thông tin của quạt fan2 bằng cách gọi phương thức toString()
    }
}
