package Lab4;

class Circle{
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

class Cylinder extends Circle{
    private double height = 4.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(),3);
    }
}


public class TestCircleAndCylinder {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Radius" + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea() + "\n");

        Circle circle2 = new Circle(2);
        System.out.println(circle2);
        System.out.println("Radius" + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea() + "\n");

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Volume: " + cylinder1.getVolume() + "\n");

        Cylinder cylinder2 = new Cylinder(3);
        System.out.println(cylinder2);
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Volume: " + cylinder2.getVolume() + "\n");

        Cylinder cylinder3 = new Cylinder(4,6);
        System.out.println(cylinder3);
        System.out.println("Height: " + cylinder3.getHeight());
        System.out.println("Area: " + cylinder3.getArea());
        System.out.println("Volume: " + cylinder3.getVolume() + "\n");


    }
}
