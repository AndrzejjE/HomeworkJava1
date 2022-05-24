package Lab3;
class Circle{
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(String color) {
        radius = 4;
        this.color = color;
    }
    public Circle() {
        radius = 6;
        color = "blue";
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle(1,"red");
        Circle c2 = new Circle("black");
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        c4.setRadius(8);
        c4.setColor("green");
        System.out.println("Area: " + c1.getArea() + " Radius: " + c1.getRadius());
        System.out.println(c1);
        System.out.println("Area: " + c2.getArea() + " Radius: " + c2.getRadius());
        System.out.println(c2);
        System.out.println("Area: " + c3.getArea() + " Radius: " + c3.getRadius());
        System.out.println(c3);
        System.out.println("Area: " + c4.getArea() + " Radius: " + c4.getRadius());
        System.out.println(c4);
    }
}

