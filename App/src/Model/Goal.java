package Model;

public class Goal implements ICircle {
    
    private Vector2D position;
    private double radius;

    Goal(Vector2D position, double radius) {
        this.position = position;
        this.radius = radius;
    }

    public Vector2D getPosition() {
        return this.position;
    }

    public Double getRadius() {
        return this.radius;
    }

}
