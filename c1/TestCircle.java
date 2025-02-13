package c1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hinh tron co ban kinh la " +c1.getRadius()+ "va dien tich la "+c1.getArea());
        Circle c2 = new Circle(6);
        System.out.println("hinh tron co ban kinh la "+c2.getRadius()+ "va dien tich la "+c2.getArea());
        Circle c3 = new Circle();
        c3.setRadius(5);
        System.out.println("ban kinh la "+c3.getRadius());
        c3.setColor("black");
        System.out.println("mau hinh tron la "+c3.getColor());
        Circle c4 = new Circle(5,"black");
        System.out.println(c4.toString());
    }
}
