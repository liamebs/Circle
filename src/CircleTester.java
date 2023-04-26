public class CircleTester {
    public static void main(String[] args) {
        // Instantiate Circle object from Circle class
        Circle Circle01 = new Circle(1.0, "red");

        // Print object characteristics using getter functionality
        System.out.println(Circle01.getClass().getSimpleName() + " details:\n");
        System.out.println("Radius: " + Circle01.getRadius());
        System.out.println("Area: " + Circle01.getArea() + "cm2");
        System.out.println("Circumference: " + Circle01.circumference() + "cm");
        System.out.println("Color: " + Circle01.getColor());

    }
}