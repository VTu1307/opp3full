public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100, 10, 5, 45);

        while (true) {
            ball.move();
            System.out.println("Ball position: (" + ball.getX() + ", " + ball.getY() + ")");

            // Check for collisions and reflect the ball's movement accordingly
            if (ball.getX() - ball.getRadius() < 0 || ball.getX() + ball.getRadius() > 800) {
                ball.reflectHorizontal();
            }
            if (ball.getY() - ball.getRadius() < 0 || ball.getY() + ball.getRadius() > 600) {
                ball.reflectVertical();
            }

            try {
                Thread.sleep(50); // Pause for 50 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}