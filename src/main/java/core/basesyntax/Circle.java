package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }
}