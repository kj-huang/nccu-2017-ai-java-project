package homework;

public final class Point {
    private final int x;
    private final int y;
    private final Color color;

    public Point(Color color, int x, int y){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}
