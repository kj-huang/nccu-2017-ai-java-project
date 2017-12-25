package homework;

public final class Point {
    private final int x;
    private final int y;
    private final Color color;
    private boolean canBeFill;


    public Point(Color color, int x, int y, boolean canBeFill){
        this.x = x;
        this.y = y;
        this.color = color;
        this.canBeFill = canBeFill;
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

    public boolean canBeFill() {
        return canBeFill;
    }
}
