public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public void moveUp() {
        this.center.x += this.center.xSpeed;
    }
    public void moveDown() {
        this.center.x -= this.center.xSpeed;

    }
    public void moveLeft() {
        this.center.y -= this.center.ySpeed;

    }
    public void moveRight() {
        this.center.y += this.center.ySpeed;

    }
    public String toString() {
        return "MovableCircle(" + "radius = " + radius + ", center = " + center + ")";
    }
}
