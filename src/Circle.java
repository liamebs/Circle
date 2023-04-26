
public class Circle {

    // Initialise class variables
    private double radius;
    private String color;

    // Initialise instance variables
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // set up getter methods
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
    public double circumference() {
        return radius * 2 * 3.14;
    }
    public String getColor() {
        return color;
    }

}
