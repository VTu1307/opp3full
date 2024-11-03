public class Ball2 {
    private float x;
    private float y;
    private float z;

    public Ball2(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    @Override
    public String toString() {
        return "Ball2 [x=" + x + ", y=" + y + ", z=" + z + "]";

    }
}
