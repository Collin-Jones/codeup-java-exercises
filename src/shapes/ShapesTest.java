package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Perimeter " + box1.getPerimeter());
        System.out.println("Area " + box1.getArea());

        Rectangle box2 = new Rectangle(5, 4);
        System.out.println("Square Perimeter " + box2.getPerimeter());
        System.out.println("Square Area " + box2.getArea());
    }
}
