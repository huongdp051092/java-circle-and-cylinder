public class Circle {
    private double radius = 0;
    private String color = "black";

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double perimeter() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "radius: " + radius + "\tcolor: " + color;
    }
}
