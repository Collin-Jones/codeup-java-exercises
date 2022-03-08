package shapes;

public class ShapesTest {
    public static <Measurable> void main(String[] args){
        Measurable shapes = (Measurable) new Square(5);
        System.out.println("Perimeter " + ((Square) shapes).getPerimeter());
        System.out.println("Area " + ((Square) shapes).getArea());

        shapes = (Measurable) new Rectangle(7, 6);
        System.out.println("Rectangle Perimeter " + ((Rectangle) shapes).getPerimeter());
        System.out.println("Rectangle Area " + ((Rectangle) shapes).getArea());
    }
}
