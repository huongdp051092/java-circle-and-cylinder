public class Cylinder extends Circle {
    private double lenght = 0;

    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double volume() {
        return super.perimeter() * lenght;
    }

    @Override
    public String toString() {
        return "radius: " + getRadius() + "\tcolor: " + getColor() + "\tvolume: " + volume();
    }
}
