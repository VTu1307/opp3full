public class Ball {
    private float x;
    private float y;
    private float radius;
    private float xDetal;
    private float yDetal;
    public Ball(float x, float y, float radius , int speak ,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDetal =(float)(speak * Math.cos(Math.toRadians(direction)));
        this.yDetal =(float)(speak * Math.sin(Math.toRadians(direction)));

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getxDetal() {
        return xDetal;
    }

    public void setxDetal(float xDetal) {
        this.xDetal = xDetal;
    }

    public float getyDetal() {
        return yDetal;
    }

    public void setyDetal(float yDetal) {
        this.yDetal = yDetal;
    }
    public void move () {
        x+=xDetal;
        y+=yDetal;

    }
    public void reflectHorizontal () {
        xDetal = -xDetal;
    }
    public void reflectVertical () {
        yDetal = -yDetal;

    }
    @Override
    public String toString() {
        return "Ball [x=" + x + ", y=" + y + ", speed="  + xDetal + ", yDetal=" + yDetal + "]";
    }

}
