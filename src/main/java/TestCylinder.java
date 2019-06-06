public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        System.out.println(cylinder.toString());
        System.out.println("Gia tri mac dinh cua radius la: " + cylinder.getRadius());
        System.out.println("Gia tri mac dinh cua perimeter la: " + cylinder.perimeter());
        System.out.println("Gia tri mac dinh cua volume la: " + cylinder.volume());
        cylinder.setRadius(5.5);
        System.out.println("Gia tri sau khi thay doi perimeter la: " + cylinder.perimeter());
        System.out.println("Gia tri sau khi thay doi radius la: " + cylinder.getRadius());
        System.out.println("Gia tri mac dinh cua lenght la: " + cylinder.getLenght());
        cylinder.setLenght(5.5);
        System.out.println("Gia tri sau khi thay doi lenght la: " + cylinder.getLenght());
        System.out.println("Gia tri sau khi thay doi volume la: " + cylinder.volume());
        System.out.println("Gia tri mac dinh cua color la: " + cylinder.getColor());
        cylinder.setColor("blue");
        System.out.println("Gia tri sau khi thay doi color la: " + cylinder.getColor());
        System.out.println(cylinder.toString());
    }
}
