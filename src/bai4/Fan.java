package bai4;

public class Fan {
    private static final int SLOW = 1; // Hằng số tốc độ chậm
    private static final int MEDIUM = 2; // Hằng số tốc độ trung bình
    private static final int FAST = 3; // Hằng số tốc độ nhanh

    private int speed; // Tốc độ của quạt
    private boolean on; // Trạng thái bật/tắt của quạt
    private double radius; // Bán kính của quạt
    private String color; // Màu sắc của quạt

    public Fan() {
        this.speed = SLOW; // Mặc định tốc độ là chậm
        this.on = false; // Mặc định quạt tắt
        this.radius = 5.0; // Mặc định bán kính là 5.0
        this.color = "blue"; // Mặc định màu sắc là blue
    }

    public int getSpeed() {
        return speed; // Trả về tốc độ của quạt
    }

    public void setSpeed(int speed) {
        this.speed = speed; // Thiết lập tốc độ của quạt
    }

    public boolean isOn() {
        return on; // Trả về trạng thái bật/tắt của quạt
    }

    public void setOn(boolean on) {
        this.on = on; // Thiết lập trạng thái bật/tắt của quạt
    }

    public double getRadius() {
        return radius; // Trả về bán kính của quạt
    }

    public void setRadius(double radius) {
        this.radius = radius; // Thiết lập bán kính của quạt
    }

    public String getColor() {
        return color; // Trả về màu sắc của quạt
    }

    public void setColor(String color) {
        this.color = color; // Thiết lập màu sắc của quạt
    }

    public static int getMedium() {
        return MEDIUM; // Trả về giá trị tốc độ trung bình
    }

    public static int getFast() {
        return FAST; // Trả về giá trị tốc độ nhanh
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on - Speed: " + speed + ", Color: " + color + ", Radius: " + radius; // Chuỗi thông tin khi quạt đang bật
        } else {
            return "Fan is off - Color: " + color + ", Radius: " + radius; // Chuỗi thông tin khi quạt tắt
        }
    }
}