public class TestGame {
    public static void main(String[] args) {
        // Khởi tạo bóng tại tọa độ (0, 0, 0)
        Ball2 ball = new Ball2(0, 0, 0);
        System.out.println("Initial Ball Position: " + ball);

        // Khởi tạo cầu thủ tại tọa độ (2, 3)
        Player player1 = new Player(10, 2, 3);
        System.out.println("Initial " + player1);

        // Di chuyển cầu thủ
        player1.move(1, 1);
        System.out.println("After moving, " + player1);

        // Kiểm tra khoảng cách đến bóng và thử sút bóng
        if (player1.near(ball)) {
            System.out.println(player1 + " is near the ball and will kick it.");
            player1.kick(ball);
        } else {
            System.out.println(player1 + " is too far from the ball to kick.");
        }

        // In vị trí của bóng sau khi cầu thủ thử sút
        System.out.println("Ball Position after kick: " + ball);

        // Cầu thủ nhảy lên
        player1.jump(5);
        System.out.println("After jumping, " + player1);
    }
}
