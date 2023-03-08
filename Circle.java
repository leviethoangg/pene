 public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}


class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, "red", 3.0);

        System.out.println("Radius is " + cylinder.getRadius());
        System.out.println("Color is " + cylinder.getColor());
        System.out.println("Height is " + cylinder.getHeight());
        System.out.println("Volume is " + cylinder.getVolume());
    }
}

