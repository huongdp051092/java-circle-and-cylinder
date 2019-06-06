public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.toString());

        System.out.println("Gia tri mac dinh cua radius la: " + circle.getRadius());
        System.out.println("Gia tri mac dinh cua perimeter la: " + circle.perimeter());
        circle.setRadius(5.5);
        System.out.println("Gia tri sau khi thay doi perimeter la: " + circle.perimeter());
        System.out.println("Gia tri sau khi thay doi radius la: " + circle.getRadius());

        System.out.println("Gia tri mac dinh cua color la: " + circle.getColor());
        circle.setColor("blue");
        System.out.println("Gia tri sau khi thay doi color la: " + circle.getColor());

        System.out.println(circle.toString());
    }
}
