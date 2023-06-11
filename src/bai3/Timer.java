package bai3;

import java.time.Instant;
import java.time.Duration;

public class Timer {
    private Instant startTime;
    private Instant endTime;

    public Timer() {
        startTime = Instant.now(); // Khởi tạo startTime với thời gian hiện tại của hệ thống
    }

    public Instant getStartTime() {
        return startTime; // Trả về thời điểm bắt đầu đo thời gian
    }

    public Instant getEndTime() {
        return endTime; // Trả về thời điểm kết thúc đo thời gian
    }

    public void start() {
        startTime = Instant.now(); // Thiết lập startTime về thời gian hiện tại của hệ thống, bắt đầu đo thời gian
    }

    public void stop() {
        endTime = Instant.now(); // Thiết lập endTime về thời gian hiện tại của hệ thống, kết thúc đo thời gian
    }

    public long getElapsedTime() {
        if (startTime != null && endTime != null) {
            Duration duration = Duration.between(startTime, endTime); // Tính toán khoảng thời gian giữa startTime và endTime
            return duration.toMillis(); // Trả về khoảng thời gian đã tính toán dưới dạng số milisecond
        } else {
            return 0; // Trả về 0 nếu startTime hoặc endTime chưa được thiết lập
        }
    }
}
