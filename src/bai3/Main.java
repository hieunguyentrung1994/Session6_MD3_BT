package bai3;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        // Bắt đầu đếm thời gian
        timer.start();

        // Thực hiện một tác vụ
        doTask();

        // Kết thúc đếm thời gian
        timer.stop();

        // Lấy thời gian đã trôi qua
        long elapsedTime = timer.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }

    public static void doTask() {
        // Một tác vụ mất thời gian để thực hiện
        try {
            Thread.sleep(2000); // Dừng chương trình trong 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
